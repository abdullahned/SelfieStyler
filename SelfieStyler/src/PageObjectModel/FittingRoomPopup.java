package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import library.HighlightLocator;
import library.Synchronization;

public class FittingRoomPopup {

	WebDriver driver;
	  
	public FittingRoomPopup(WebDriver ldriver)
	{
		
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(linkText="Shop") 
	WebElement shop;
	
	@FindBy(xpath="//span[@class='down']") 
	WebElement down;
	
	@FindBy(xpath="//span[@class='up']") 
	WebElement up;
	
	
	public void fitting_selfie_styler () throws Exception
	{
	
		Synchronization.Exception_Handling(driver, shop, 30);    // click on shop link
		
		JavascriptExecutor jex = (JavascriptExecutor)driver;          // To scroll down the page 
		 
	    jex.executeScript("window.scrollBy(0,500)", "");
	    
	    Thread.sleep(8000);
	    
	    Synchronization.Exception_Handling(driver, down, 30);       // minimize the demo model popup
	    		                                             	
		Thread.sleep(2000);
		
		jex.executeScript("window.scrollBy(0,-500)", "");         // To scroll up the page
		
		Synchronization.Exception_Handling(driver, up, 30);
		
		Thread.sleep(4000);
		
		
	}
	

	
}
