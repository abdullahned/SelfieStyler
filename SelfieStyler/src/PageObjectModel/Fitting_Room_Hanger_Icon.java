package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import library.HighlightLocator;
import library.Synchronization;

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
	
	@FindBy(xpath="//div[@class='toolbar']") 
	WebElement random;
	
	
	
	
	public void click_shop () throws Exception	
	{
		Synchronization.Exception_Handling(driver, shop, 30);  // click the shop link 
		
		JavascriptExecutor jex = (JavascriptExecutor)driver;          // To scroll down the page 
		 
	    jex.executeScript("window.scrollBy(0,300)", "");
		
		Thread.sleep(8000);		
		
	}
	
	
	public void click_hanger () throws Exception	
	{
		
		Synchronization.click_explicitly(driver, hanger, 30);
	
	}
	
	
	public void click_hanger1 () throws Exception	
	{
	
		
		
		Synchronization.click_explicitly(driver, hanger1, 30);
					
	}
	
	
	
	public void clickRandom()
	{
		
	Actions action = new Actions(driver);

	action.moveToElement(random).click().perform();
			
		
	}
	
	
	
	
}
