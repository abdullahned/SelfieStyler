package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.HighlightLocator;

public class FittingRoomPopup {

	WebDriver driver;
	  
	public FittingRoomPopup(WebDriver ldriver)
	{
	this.driver=ldriver;
	}
	
	
	@FindBy(linkText="Shop") 
	WebElement shop;
	
	@FindBy(xpath="//span[@class='down']") 
	WebElement down;
	
	@FindBy(xpath="//span[@class='up']") 
	WebElement up;
	
	public void fitting_selfie_styler () throws InterruptedException
	{
		
		
		HighlightLocator.highLightElement(driver, shop);             // High lighting the web element
		
		shop.click();                                                 // Click on shop
		
		JavascriptExecutor jex = (JavascriptExecutor)driver;          // To scroll down the page 
		 
	    jex.executeScript("window.scrollBy(0,200)", "");
		
		Thread.sleep(8000);
		
		HighlightLocator.highLightElement(driver, down);             // High lighting the web element
		
		down.click();                                                 // Click on down arrow
		
		Thread.sleep(5000);
		
	    HighlightLocator.highLightElement(driver, up);             // High lighting the web element
		
		up.click();                                                 // Click on up arrow
		
		Thread.sleep(4000);
		
		
	}
	
	
	
	
	
}
