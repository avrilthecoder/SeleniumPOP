package com.seleniumoverflow.SelPop;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class About {
	public WebDriver driver;
	
	public About(WebDriver driver) {
		this.driver=driver;
		if (!StringUtils.equals("About Selenium",getAcutalPageTitle())) {
			throw new WrongPageException("Incorrect page for About");
		}
	}

	public List<String> getListOfLeftNavItems() {
		List<String> actualListOfLeftNavItems = new ArrayList<String>();
		List<WebElement> listOfLeftMenuItem = driver.findElements(By.xpath("//ul[@id='nav']/li//a"));
		
		for(WebElement singleLinkWebElement :listOfLeftMenuItem){
			actualListOfLeftNavItems.add(singleLinkWebElement.getText().trim());
		}
		
		return actualListOfLeftNavItems;
	}
	
	public String getAcutalPageTitle(){
		return driver.findElement(By.xpath("//div[@id='mainContent']/h2")).getText().trim();
	}

}
