package com.pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/******************************************************************************************************************
POM: ToDoMainPage
Page object to handle controls for create string checks

MODIFICATION LOG
29/11/2018					Initial Development					shraddha bhadauria
******************************************************************************************************************/
public class ToDoMainPage
{
	//Locators 
	private final String newStringValue = "//input[@value ='']";
	private final String delBtnLoc = "//button[@class = 'TaskDelete']";
	private final String cnclAppBtnFnlLoc = "//button[@name = 'ToDoList_btn']";

	WebDriver wdObj;
	public ToDoMainPage(WebDriver webDriverObj)
	{
		this.wdObj = webDriverObj;
	}

	//Set text
	public void setText(String text)
	{
		By newAppNmObj = By.xpath(newStringValue);
		WebDriverWait waitCrtAppPopupObj = new WebDriverWait(wdObj, 15);
		waitCrtAppPopupObj.until(ExpectedConditions.visibilityOfElementLocated(newAppNmObj));
		wdObj.findElement(newAppNmObj).clear();
		wdObj.findElement(newAppNmObj).sendKeys(text);
	}


	//Click Task delete
	public void clickTaskdelete()
	{
		By crtAppBtnObj = By.xpath(delBtnLoc);
		wdObj.findElement(crtAppBtnObj).click();
	}


	//Click add To do List
	public void clickAdd()
	{
		By crtAppBtnObj = By.xpath(cnclAppBtnFnlLoc);
		wdObj.findElement(crtAppBtnObj).click();
	}


	//Wait for database updation
	public void waitForUpdation(int sec)
	{
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}