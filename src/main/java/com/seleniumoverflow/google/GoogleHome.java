package com.seleniumoverflow.google;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.seleniumoverflow.SelPop.WrongPageException;

public class GoogleHome {
	private WebDriver driver;

	public GoogleHome(WebDriver driver){
		this.driver=driver;
		driver.get("http://www.google.co.in");
		if (!StringUtils.equals("Google", driver.getTitle())) {
			throw new WrongPageException("Landed to incorrect page");
		}
	}

	public WebElement getGoogleSearchBtn() {
		try {
			return driver.findElement(By.xpath("//input[@type='submit' and @value='Google Search']"));
		} catch (Exception e) {
			return null;
		}
	}
	
	public String getGoogleSerachBtnText(){
		return getGoogleSearchBtn().getText();
	}

	public WebElement getFeelingLuckyBtn() {
		try {
			return driver.findElement(By.xpath("//input[@type='submit' and contains(@value,'m Feeling Lucky')]"));
		} catch (Exception e) {
			return null;
		}
	}
	
	public String getFeelingLuckyBtnText(){
		return getFeelingLuckyBtn().getText();
	}

	public SearchBox getSearchBox() {
		try {
			driver.findElement(By.xpath("//input[@id='lst-ib' and @title='Search']"));
			return new SearchBox(driver);
		} catch (Exception e) {
			return null;
		}
	}
}
