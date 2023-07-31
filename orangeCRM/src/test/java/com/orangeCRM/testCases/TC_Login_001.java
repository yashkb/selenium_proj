package com.orangeCRM.testCases;

import org.testng.annotations.Test;

import com.orangeCRM.pages.Login;

public class TC_Login_001 extends BaseClass {
	
	Login loginObj ;
	
	@Test
	void validLogin() throws InterruptedException
	{
		loginObj  = new Login(driver);
		driver.get(url);
		Thread.sleep(3000);
		loginObj.enterUserName();
		loginObj.enterPassword();
		loginObj.clickLogin();
	}

}
