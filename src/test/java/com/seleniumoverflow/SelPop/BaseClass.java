package com.seleniumoverflow.SelPop;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;

	@Before
	public void setUp(){
		//Set the path 'chromedriver.exe'
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\resources\\chromedriver.exe");

		//Initialize a new instance of Chrome browser
		driver = new ChromeDriver(); 

		//Maximize the browse window
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
}
