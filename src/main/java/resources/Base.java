package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	public Properties props;
	public WebDriver driver;
	
	public WebDriver initialize() throws IOException
	{
		props=new Properties();
		FileInputStream fis=new FileInputStream("E:\\simplecucmber\\src\\main\\java\\resources\\data.properties");
		props.load(fis);
		
		String browsername=props.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ABHISHEK\\Downloads\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver=new ChromeDriver(options);
		}
		else
		{
			System.out.println("no driver");
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
	}

}
