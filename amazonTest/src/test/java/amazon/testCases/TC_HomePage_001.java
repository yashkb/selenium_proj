package amazon.testCases;

import org.testng.annotations.Test;

import amazon.pages.Homepage;

public class TC_HomePage_001 extends BaseClass {
	
	Homepage homeObj ;
	
	@Test
	void hamburger() throws InterruptedException
	{
		
		homeObj = new Homepage(driver);
		driver.get(url);
		homeObj.clickHamburger();
	}
	
	
}
