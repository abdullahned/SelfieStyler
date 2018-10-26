package PageObjectModel;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import library.HighlightLocator;
import library.Synchronization;

public class Fitting_Room_Edit_Look {

	WebDriver driver;
	
	
	public Fitting_Room_Edit_Look(WebDriver ldriver)
	{
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(xpath="//div[@class ='edit_look']") 
	WebElement Edit_look;
	
	@FindBy(xpath="//select[@id ='size_0']") 
	WebElement Size;
	
	@FindBy(xpath="//input[@id ='product-remove-1']") 
	WebElement remove;
	
	@FindBy(xpath="//span[@class ='close_1']") 
	WebElement close;
	
	
	@FindBy(xpath="//input[@id ='product-add-0']") 
	WebElement Add_to_bag;
	
	@FindBy(xpath="//a[@id ='cartToggle']") 
	WebElement cart_toggle;
	
	@FindBy(xpath="//div[@class ='errorcls']") 
	WebElement selectsize;	
	
	@FindBy(linkText="Brands") 
	WebElement brand;
	
	@FindBy(xpath="//a[@href ='/collections/vendors?q=Monrow']") 
	WebElement monrow;
	
	@FindBy(xpath="//a[@data-product-title='Oversized Crew Neck Tee']") 
	WebElement monrow_product;
	
	@FindBy(xpath="//select[@id ='color_0']") 
	WebElement color;
	
	
	public void Click_Edit_look() throws Exception
	{
		
		Synchronization.Exception_Handling(driver, Edit_look, 30);
	}
	
	
	public String Select_size ()
	{
		
		String text = Size.getText();
		return text;
		
	}
	
	public void Remove_product () throws Exception
	{
		
		Synchronization.Exception_Handling(driver, remove, 30);
		
	}

	
	public void Close_edit_popup() throws Exception
	{
		
		Synchronization.Exception_Handling(driver, close, 30);
	}
	
	
	public void Select_a_size() 
	{
		
		HighlightLocator.highLightElement(driver, Size);
		 
		Select select = new Select(Size);
		
		select.selectByVisibleText("Size: 26");	
		
	}
	
	
	public void Click_Add_to_bag() throws Exception
	{	
		
		Synchronization.Exception_Handling(driver, Add_to_bag, 30);
		
	}
	
	
	public void Add_to_cart () throws InterruptedException
	
	{
		
		Actions action = new Actions(driver);
		
		HighlightLocator.highLightElement(driver, cart_toggle);
		
		Thread.sleep(1000);
		
		action.moveToElement(cart_toggle).build().perform();
		
		Thread.sleep(3000);
		
	}
	
	
	
	public String error_message_select_size()
	{
		
		String text1 = selectsize.getText();
		return text1;
				
		
	}
	

	
	
	public void recommended() 
	{
		
		
		HighlightLocator.highLightElement(driver, Size);
		
		Select oSelect = new Select(Size);
		
		List<WebElement> liElements = oSelect.getOptions();
		
		int size = liElements.size();
		
		int randnMumber = ThreadLocalRandom.current().nextInt(0, size);
		
		liElements.get(randnMumber).click();
					
	}
	
	
	
	
	public void click_brand() throws Exception
	{
		//HighlightLocator.highLightElement(driver, brand);
		
		//Synchronization.clickOn(driver,brand, 5);	
		
		Synchronization.Exception_Handling(driver, brand, 30);
		
	}
	
	
	
	public void clickMonrow() throws Exception
	{
	
		
		//Synchronization.Exception_Handling(driver, monrow, 30);
		
			
		Synchronization.clickOn(driver, monrow, 30);
		
		JavascriptExecutor jex = (JavascriptExecutor)driver;          // To scroll down the page 
		 
		jex.executeScript("window.scrollBy(0,300)", "");
			
	}
	
	
  public void click_monrow_product() throws Exception
  {
	    
	  
	Synchronization.click_explicitly(driver, monrow_product, 30);
	  
	  //Synchronization.Exception_Handling(driver, monrow_product, 40);
	  
	  //monrow_product.click();
	  
	 
	 
	 
  }
  
	
	
  public void Select_a_color() throws InterruptedException
	
	{
		
		HighlightLocator.highLightElement(driver, color);
		 
		Select select = new Select(color);
		
		Thread.sleep(2000);
		
		select.selectByVisibleText("Color: Blue");
		
		Thread.sleep(1000);
			
		
	}
	
	
	
	
}
	
	

		
	

