package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import library.HighlightLocator;

public class Fitting_Room_Hanger_Icon {

	WebDriver driver;
	
	public Fitting_Room_Hanger_Icon(WebDriver ldriver)
	{
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(linkText="Shop") 
	WebElement shop;
	
	@FindBy(xpath="//a[@id='740']") 
	WebElement hanger;
	
	@FindBy(xpath="//a[@id='614']") 
	WebElement hanger1;
	
	
	public void click_shop () throws InterruptedException	
	{
	
	   HighlightLocator.highLightElement(driver, shop);             // High lighting the web element
		
		shop.click();                                                 // Click on shop
		
		Thread.sleep(5000);	
		
		JavascriptExecutor jex = (JavascriptExecutor)driver;          // To scroll down the page 
		 
	    jex.executeScript("window.scrollBy(0,300)", "");
		
		Thread.sleep(8000);		
		
	}
	
	
	public void click_hanger ()	
	{
		hanger.click();		
				
	}
	
	public void click_hanger1 ()	
	{
		hanger1.click();		
				
	}
	
	
	
	
	
}
