package com.seleniumoverflow.SelPop;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class About {
	public WebDriver driver;
	
	public About(WebDriver driver) {
		this.driver=driver;
	}

	public List<String> getListOfLeftNavItems() {
		List<String> actualListOfLeftNavItems = new ArrayList<String>();
		List<WebElement> listOfLeftMenuItem = driver.findElements(By.xpath("//ul[@id='nav']/li//a"));
		
		for(WebElement singleLinkWebElement :listOfLeftMenuItem){
			actualListOfLeftNavItems.add(singleLinkWebElement.getText().trim());
		}
		
		return actualListOfLeftNavItems;
	}

}
