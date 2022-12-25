package Automation.ShadowDomElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

import io.github.sukgu.support.ElementFieldDecorator;
import io.github.sukgu.support.FindElementBy;

public class PageObjectsShadowDom
{
	WebDriver driver;
	
	public PageObjectsShadowDom(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(new ElementFieldDecorator(new DefaultElementLocatorFactory(driver)), this);
		//ElementFieldDecorator decorator = new ElementFieldDecorator(new DefaultElementLocatorFactory(driver));
    	//PageFactory.initElements(decorator, this);
	}
	
	@FindElementBy(css = "h1")
	private WebElement downloadHeadingText;
	
	@FindElementBy(xpath = "//input[@id='searchInput']")
	private WebElement searchField;
	
	public void testGetText_FromShadowDOMElements()
	{
		String text = downloadHeadingText.getText();
		System.out.println(text);
	}
	public void enterSearchText_FromShadowDOMElements()
	{
		searchField.sendKeys("test");
	}

}
