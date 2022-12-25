package Automation.ShadowDomElements;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class ShadowDomElements 
{
	public static void main(String args[]) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		Shadow shadow = new Shadow(driver);
		driver.get("chrome://downloads/");		
		System.out.println("Open Chrome Downloads Page");
		shadow.setImplicitWait(5);
		
		WebElement element = shadow.findElement("h1");
		String text = element.getText();
		System.out.println(text);
		WebElement element1 = shadow.findElementByXPath("//input[@id='searchInput']");
		element1.sendKeys("test");
		Thread.sleep(5000);
		//List<WebElement> element = shadow.findElements("paper-tab[title='Settings']");		
	}
}
