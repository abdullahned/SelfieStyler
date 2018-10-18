package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import library.HighlightLocator;

public class Fitting_Room_Edit_Look {

	WebDriver driver;
	
	
	public Fitting_Room_Edit_Look(WebDriver ldriver)
	{
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
	
	}
	
	//@FindBy(xpath="//a[contains(text(),'Edit look']") 
	//WebElement Edit_look;
	
	@FindBy(xpath="//div[@class ='edit_look']") 
	WebElement Edit_look;
	
	
	public void Click_Edit_look() throws InterruptedException
	{
		HighlightLocator.highLightElement(driver, Edit_look);
		
		Thread.sleep(1000);
		
		Edit_look.click();
	}
	
	

	
	
}
