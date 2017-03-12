package com.seleniumoverflow.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage {
	protected WebDriver driver;
	
	public ResultsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterSearch(){
		driver.findElement(By.xpath("//button[@value='Search']")).click();
	}
	
}
