package com.seleniumoverflow.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	
	public static WebElement waitUntilPresenceOfElementLocated(WebDriver driver,int timeOut, String xpathLocator){
		return (new WebDriverWait(driver, timeOut)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathLocator)));
	}
	
}
