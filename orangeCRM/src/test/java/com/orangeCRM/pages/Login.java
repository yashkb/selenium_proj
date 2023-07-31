package com.orangeCRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	WebDriver driver;
	
	public Login(WebDriver d) {
		// TODO Auto-generated constructor stub
		this.driver = d;
	}
	
	public void enterUserName(String userId)
	{
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		
		userName.sendKeys(userId);
		
	}
	public void enterPassword(String pass)
	{
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(pass);
	}
	public void clickLogin()
	{
		WebElement loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		loginBtn.click();
	}
	
	
	
}































