package Automation.ShadowDomElements;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ShadowDomElementsWithPOM extends BaseClass
{
	PageObjectsShadowDom posd;
	
	@BeforeTest
	public void init()
	{
		posd = new PageObjectsShadowDom(driver);
	}
	
	@Test
	public void testGetText_FromShadowDOMElements() throws InterruptedException
	{
		posd.testGetText_FromShadowDOMElements();
		posd.enterSearchText_FromShadowDOMElements();
		Thread.sleep(5000);
	}

}
