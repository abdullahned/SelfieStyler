package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import library.HighlightLocator;
import library.Synchronization;

public class Men {

    WebDriver driver;
	
	public Men(WebDriver ldriver)
	{
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
	}
		
	@FindBy(id="gender") 
	WebElement gender;
	
	@FindBy(xpath="//button[contains(text(),'Notify Me')]") 
	WebElement notify;
	
	@FindBy(xpath="//button[contains(text(),'Ok, great!')]") 
	WebElement great;
	
	
	
	
	public void select_gender()    // select the gender
	{
		HighlightLocator.highLightElement(driver, gender);
		 
		Select select = new Select(gender);
		
		select.selectByVisibleText("Male");				
	}
	
	
	public void click_notify() throws Exception
	{
		
		Synchronization.Exception_Handling(driver, notify, 30);
		
		Thread.sleep(3000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy(0,-500)", "");
		
	}
	
	public void click_great() throws Exception
	{
		Synchronization.Exception_Handling(driver, great, 30);
		
		Thread.sleep(2000);
		
	}
	
	
	
	
	
	
	
}

