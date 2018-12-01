package com.pages.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/******************************************************************************************************************
POM: Initialize
Main class to be inherited by all test cases
Initializes web driver object to be used with respective browser
Initializes property class object to enable test cases to read from config file test.properties


******************************************************************************************************************/
public class Initialize 
{
	
	protected WebDriver wdObj;
	protected Properties propObj;
	protected String codeCovgDir;
	
	//Initialize for firefox
	private WebDriver initFirefox()
	{
		String driver_path =propObj.getProperty("gecko_path");
		File ffxBinPath = new File(propObj.getProperty("firefox_path"));
		FirefoxProfile ff_profObj = null;
		if (ffxBinPath.exists() && !ffxBinPath.isDirectory()) {
			ff_profObj = new FirefoxProfile();
		} else {
			ProfilesIni profObj = new ProfilesIni();
            ff_profObj = profObj.getProfile("default");
		}
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("browser.download.folderList", 2);
		options.addPreference("browser.download.dir", propObj.getProperty("download_path"));
		options.addPreference("browser.download.useDownloadDir", true);
		options.addPreference("browser.helperApps.neverAsk.saveToDisk",  "application/octet-stream, text/csv, text/plain, application/xls, application/zip, application/pdf");
		options.addPreference("pdfjs.disabled", true);
		options.addPreference("browser.shell.checkDefaultBrowser", false);
		options.addPreference("app.update.auto", false);
		options.addPreference("app.update.enabled", false);
		if (ffxBinPath.exists() && !ffxBinPath.isDirectory()) {
			System.setProperty("webdriver.gecko.driver", driver_path);
			FirefoxBinary firefoxBinary = new FirefoxBinary(ffxBinPath);
			DesiredCapabilities desired = DesiredCapabilities.firefox();
			desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
			wdObj = new FirefoxDriver(options);
		} else {
			System.setProperty("webdriver.gecko.driver", driver_path);
			wdObj = new FirefoxDriver(options);
		}
		return wdObj;
	}
	
	//Initialize for chrome on windows
	private WebDriver initChromeWin()
	{
		String driverPath = propObj.getProperty("driver_path");
		System.setProperty("webdriver.chrome.driver", driverPath+"/chrome/windows/chromedriver.exe");
		wdObj = new ChromeDriver();
		return wdObj;
	}
	
	//Initialize for chrome on linux
	private WebDriver initChromeLinux()
	{
		String driverPath = propObj.getProperty("driver_path");
		System.setProperty("webdriver.chrome.driver", driverPath+"/chrome/linux/chromedriver");
		wdObj = new ChromeDriver();
		return wdObj;
	}
	
	//Initialize for IE
	private WebDriver initIE()
	{
		String driverPath = propObj.getProperty("driver_path");
		System.setProperty("webdriver.ie.driver", driverPath+"/ie/IEDriverServer.exe");
		wdObj = new InternetExplorerDriver();
		return wdObj;
	}
	
	/*
	 * Initializes web driver object based on browser passed
	 * This method should be called in beforeTest() method of each test class
	 */
	public void init(String browser, String platform)
	{
		propObj = new Properties();
		try 
		{
			Path currentPath = Paths.get(System.getProperty("user.dir"));
            Path propPathObj = Paths.get(currentPath.toString(), "src", "config", "test.properties");
            InputStream inpStrObj = new FileInputStream(propPathObj.toString());
			propObj.load(inpStrObj);
			System.out.println(propObj.getProperty("firefox_path"));
		} catch (FileNotFoundException excObj) {
			System.out.println("Cannot read test.properties");
			excObj.printStackTrace();
		} catch (IOException excObj) {
			System.out.println("Exception occured while loading test.properties");
			excObj.printStackTrace();
		} catch (Exception excObj) {
			excObj.printStackTrace();
		}
		
		if (browser.equalsIgnoreCase("firefox"))
			wdObj = this.initFirefox();
		if (browser.equalsIgnoreCase("chrome") && platform.equalsIgnoreCase("linux"))
			wdObj = this.initChromeLinux();
		if (browser.equalsIgnoreCase("chrome") && platform.equalsIgnoreCase("windows"))
			wdObj = this.initChromeWin();
		if (browser.equalsIgnoreCase("ie"))
			wdObj = this.initIE();
	}
	
	/*
	 * Quit test and destroy web driver object
	 * This method should be called in afterTest() method of each test class
	 */
	public void exitTest()
	{
		wdObj.quit();
	}
	
}
