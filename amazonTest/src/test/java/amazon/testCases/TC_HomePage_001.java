package amazon.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import amazon.pages.Homepage;

public class TC_HomePage_001 extends BaseClass {
	
	Homepage homeObj ;
	
	@Test
	void hamburger() throws InterruptedException
	{
		
		homeObj = new Homepage(driver);
		
		homeObj.clickHamburger();
	}
	
	@Test
	void language() throws InterruptedException
	{
		homeObj = new Homepage(driver);
		boolean bool = homeObj.checkLanguage();
		if(bool)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
	}
	
	
}
