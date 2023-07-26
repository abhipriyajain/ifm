package com.store.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ifm.pageobject.landingPage;
import com.ifm.pageobject.searchPage;


public class searchProduct extends BaseClass {

	
	@Test
	public void searchTheProduct() throws IOException
	{
		landingPage lpg = new landingPage(driver);
		lpg.clickDeutsch();
		logger.info("language selected");
		
		searchPage spg = new searchPage(driver);
		spg.enterTextSearchBar();
		spg.clickSeek();
		
		String actPrice = spg.validatePrice();
		
		String expectedPrice="374.90";
		
		if(actPrice.equals(expectedPrice))
		{
						Assert.assertTrue(true);
		}
		else
		{
			
			captureScreenshot(driver,"verifyAddToWishlistWithoutLogin");
			Assert.assertTrue(false);
		}

	}
}
