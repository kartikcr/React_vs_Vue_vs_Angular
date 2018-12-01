package com.test;

import org.testng.annotations.Test;

import com.pages.main.Initialize;
import com.pages.main.ToDoMainPageVue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;

/******************************************************************************************************************
Test Case: To Do List Sanity for Vue app

MODIFICATION LOG
11/29/2018					Initial Development					Shraddha
******************************************************************************************************************/

@Test(groups = { "mats" })
public class ToDoTestVue extends Initialize
{
	@BeforeClass
	@Parameters({"browser", "platform"})
	public void beforeClass(String browser, String platform) 
	{
		//Change to @Parameters to be passed from testng.xml
		init(browser,platform);
	}
	
	public void createLocationAlias() 
	{
		wdObj.get(propObj.getProperty("app_url"));
		wdObj.manage().window().maximize();
		((JavascriptExecutor) wdObj).executeScript("window.focus();");
		
		ToDoMainPageVue pgObj = new ToDoMainPageVue(wdObj);
		
		pgObj.setText("VueTesting");
		//pgObj.clickTaskdelete();
		pgObj.clickAdd();
		pgObj.waitForUpdation(5);
		
	}

	
	@AfterClass(alwaysRun=true)
	public void afterClass() 
	{		
		exitTest();
	}
}
