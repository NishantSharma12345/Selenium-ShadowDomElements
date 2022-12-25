package Automation.ShadowDomElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.sukgu.Shadow;

public class BaseClass 
{
	public WebDriver driver;
	public Shadow shadow;
	
	@BeforeTest
	public void configBrowser()
	{
		driver = new ChromeDriver();
		shadow = new Shadow(driver);
		driver.get("chrome://downloads/");		
		System.out.println("Open Chrome Downloads Page");
		shadow.setImplicitWait(5);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
