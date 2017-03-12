package com.seleniumoverflow.google;

import org.junit.Assert;
import org.junit.Test;

import com.seleniumoverflow.SelPop.BaseClass;
import com.seleniumoverflow.google.GoogleHome;

public class GoogleSmokeTest extends BaseClass {

	@Test
	public void googleSearchCountTest(){
		GoogleHome googleHome = new GoogleHome(driver);
		
		if (googleHome.getGoogleSearchBtn() == null) {
			Assert.fail("Google Search button was not found.");
		}
		
		if (googleHome.getFeelingLuckyBtn() == null) {
			Assert.fail("Google Feeling Lucky button was not found.");
		}

		new GoogleHome(driver).getSearchBox().inputSearch("Testing selenium");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
