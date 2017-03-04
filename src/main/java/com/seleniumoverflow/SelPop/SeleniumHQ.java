package com.seleniumoverflow.SelPop;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumHQ {
	private WebDriver driver;

	public SeleniumHQ(WebDriver driver) {
		this.driver = driver;
		String baseUrl = "http://www.seleniumhq.org";
		driver.get(baseUrl + "/");
	}
	
	public Documentation clickDocumentationLink(){
		driver.findElement(By.xpath("//li[@id='menu_documentation']/a")).click();
		return new Documentation(driver);
	}
	
	public Download clickDownloadLink(){
		driver.findElement(By.xpath("//li[@id='menu_download']/a")).click();
		return new Download(driver);
	}

	public About clickAboutLink() {
		driver.findElement(By.xpath("//li[@id='menu_about']/a")).click();
		return new About(driver);
	}
	
	
	
}
