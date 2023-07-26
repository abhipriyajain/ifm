package com.ifm.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPage {
WebDriver ldriver;
	
	public landingPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"collapseOne\"]/div/div/div/div[1]/ul/li[16]/a") WebElement deutsch;
		
	
	public void clickDeutsch()
	{

		deutsch.click();
	}
	
}
