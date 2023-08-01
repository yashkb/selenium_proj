package amazon.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	String url  = "https://www.amazon.in/";
	WebDriver driver ;
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");   
		driver = new ChromeDriver();
	}
	

}
