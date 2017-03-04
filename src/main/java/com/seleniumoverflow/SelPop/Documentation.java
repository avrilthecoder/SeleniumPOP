package com.seleniumoverflow.SelPop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Documentation {
	public WebDriver driver;
	
	Documentation(WebDriver driver){
		this.driver=driver;
	}
	
	public String getPageTittle(){
		return driver.findElement(By.xpath("//div[@id='selenium-documentation']/h1")).getText();
	}

}
