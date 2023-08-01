package amazon.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	String url = "https://www.amazon.in/";
	WebDriver driver ;
	
	public Homepage(WebDriver d) {
		// TODO Auto-generated constructor stub
		this.driver = d;
		
	}
	public void openWebsite()
	{
		driver.get(url);
	}
	public void clickHamburger() throws InterruptedException
	{
		
		WebElement hamburger = driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
		hamburger.click();
		Thread.sleep(3000);
		WebElement mobilesMenu = driver.findElement(By.xpath("//div[text()='Mobiles, Computers']"));
		mobilesMenu.click();
		Thread.sleep(3000);
		WebElement backBtn = driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible hmenu-translateX']/li/a"));
		
		backBtn.click();
		
		WebElement closeBtn = driver.findElement(By.xpath("//div[@class='nav-sprite hmenu-close-icon']"));
		closeBtn.click();
	}
	
	public void checkLanguage() throws InterruptedException
	{
		Thread.sleep(6000);
		WebElement enBtn = driver.findElement(By.id("icp-nav-flyout"));
		enBtn.click();
	}

}
