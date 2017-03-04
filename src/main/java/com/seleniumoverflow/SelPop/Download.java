package com.seleniumoverflow.SelPop;

import org.apache.commons.codec.binary.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Download {
	public WebDriver driver;
	
	public Download(WebDriver driver) {
		this.driver=driver;
		if (!StringUtils.equals("Downloads",getAcutalPageTitle())) {
			throw new WrongPageException("Incorrect page for Download");
		}
	}

	private String getAcutalPageTitle() {
		return driver.findElement(By.xpath("//div[@id='mainContent']/h2")).getText().trim();
	}

	public long getLatestSeleniumDriverVersion() throws NumberFormatException{
		String seleniumVal = driver.findElement(By.xpath("//div[@id='mainContent']/p[contains(text(),'Download version')]/a")).getText();
		return	Long.parseLong(seleniumVal) ;
	}
	
	public String getLatestSeleniumDriverVersionAsString(){
		return driver.findElement(By.xpath("//div[@id='mainContent']/p[contains(text(),'Download version')]/a")).getText();
	}
}
