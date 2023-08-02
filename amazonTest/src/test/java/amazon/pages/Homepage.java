package amazon.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	
	String url = "https://www.amazon.in/";
	WebDriver driver ;
	
	public Homepage(WebDriver d) {
		// TODO Auto-generated constructor stub
		this.driver = d;
		
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
	
	public boolean checkLanguage() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement languageButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("icp-nav-flyout")));
        languageButton.click();
        WebElement kannadaRadioButton = driver.findElement(By.xpath("//input[@value='kn_IN']"));
        boolean isKannadaSelected = kannadaRadioButton.isSelected();

        if (isKannadaSelected) {
            return true;
        }
        return false;
        
        
	}

}
