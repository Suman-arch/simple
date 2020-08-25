package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	By email=By.xpath("//input[@id='email']");
	By password=By.xpath("//input[@id='pass']");
	By click=By.xpath("//button[@type='submit']");
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getClick()
	{
		return driver.findElement(click);
	}
	
	

}
