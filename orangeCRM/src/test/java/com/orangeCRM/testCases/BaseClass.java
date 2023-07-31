package com.orangeCRM.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	WebDriver driver;
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");   
		driver = new ChromeDriver();
	}
	
	public void tearDown()
	{
		driver.close();
	}

}
