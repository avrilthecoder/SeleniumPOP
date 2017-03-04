package com.seleniumoverflow.SelPop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Download {
	public WebDriver driver;
	
	public Download(WebDriver driver) {
		this.driver=driver;
	}

	public long getLatestSeleniumDriverVersion() throws NumberFormatException{
		String seleniumVal = driver.findElement(By.xpath("//div[@id='mainContent']/p[contains(text(),'Download version')]/a")).getText();
		return	Long.parseLong(seleniumVal) ;
	}
	
	public String getLatestSeleniumDriverVersionAsString(){
		return driver.findElement(By.xpath("//div[@id='mainContent']/p[contains(text(),'Download version')]/a")).getText();
	}
}
