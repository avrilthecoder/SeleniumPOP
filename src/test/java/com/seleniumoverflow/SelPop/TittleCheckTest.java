package com.seleniumoverflow.SelPop;

import org.junit.Assert;
import org.junit.Test;

public class TittleCheckTest extends BaseClass {
	
	@Test
	public void checkTittle(){
		SeleniumHQ seleniumHq = new SeleniumHQ(driver);
		Documentation documentationPage = seleniumHq.clickDocumentationLink();
		String acutalPageTittle = documentationPage.getPageTittle();
		System.out.println(acutalPageTittle);
		Assert.assertEquals("Selenium Documentation",acutalPageTittle);
	}
	
	@Test
	public void getSeleniumVersion(){
		SeleniumHQ seleniumHq = new SeleniumHQ(driver);
		Download downloadPage = seleniumHq.clickDownloadLink();
		Assert.assertEquals("Failed", "3.2.0", downloadPage.getLatestSeleniumDriverVersionAsString());
	}
	
}
