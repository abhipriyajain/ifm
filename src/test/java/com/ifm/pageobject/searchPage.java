package com.ifm.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchPage {
	WebDriver ldriver;
	public searchPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="search-bar__input") WebElement searchBar;
	@FindBy(xpath="//*[@id=\"form-search-bar\"]/button") WebElement seekBtn;
	@FindBy(xpath="//*[@id=\"product\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/span[2]") WebElement listenPrice;
		
	
	public void enterTextSearchBar()
	{

		searchBar.sendKeys("VVB001");
	}
	
	public void clickSeek()
	{
		seekBtn.click();
	}
	
	public String validatePrice()
	{
		String actualPrice = listenPrice.getText();
		return actualPrice;
	}
	
}
