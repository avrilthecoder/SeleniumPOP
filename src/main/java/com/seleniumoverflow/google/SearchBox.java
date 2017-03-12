package com.seleniumoverflow.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox {
	private WebDriver driver;

	public SearchBox(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void inputSearch(String string) {
		driver.findElement(By.xpath("//input[@id='lst-ib' and @title='Search']")).sendKeys(string);
		new ResultsPage(driver).enterSearch();
	}

}
