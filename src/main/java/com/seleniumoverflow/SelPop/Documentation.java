package com.seleniumoverflow.SelPop;

import org.apache.commons.codec.binary.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Documentation {
	public WebDriver driver;
	
	Documentation(WebDriver driver){
		this.driver=driver;
		if (!StringUtils.equals("Selenium Documentation", getActualPageTittle())) {
			throw new WrongPageException("Incorrect page for Documentation");
		}
	}
	
	public String getActualPageTittle(){
		return driver.findElement(By.xpath("//div[@id='selenium-documentation']/h1")).getText();
	}

}
