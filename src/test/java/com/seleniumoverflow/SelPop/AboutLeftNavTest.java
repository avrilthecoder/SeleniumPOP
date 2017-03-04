package com.seleniumoverflow.SelPop;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AboutLeftNavTest extends BaseClass {

	@Test
	public void checkAboutLeftNav(){
		List<String> expectedList = Arrays.asList("About Selenium",
				"News/Blog",
				"Events",
				"Sponsoring",
				"Sponsors",
				"Contributors",
				"Ecosystem",
				"License",
				"History",
				"Getting Involved");
		
		SeleniumHQ seleniumHq = new SeleniumHQ(driver);
		About aboutPage =seleniumHq.clickAboutLink();
		List<String> actualListOfLeftNavItemsFromAbout = aboutPage.getListOfLeftNavItems();
		
		Assert.assertEquals("Missmatched found :\n",expectedList, actualListOfLeftNavItemsFromAbout);
	}
}
