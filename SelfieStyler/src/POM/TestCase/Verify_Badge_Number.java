package POM.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import PageObjectModel.Fitting_Room_Hanger_Icon;
import PageObjectModel.Login;
import PageObjectModel.Shop_Checkout;

public class Verify_Badge_Number {
	
    Login Login_obj;
	
	Shop_Checkout Shop_Checkout_obj;
	
	Fitting_Room_Hanger_Icon fitting_hanger; 
		
	
	@Test(enabled=true)
	public void validate_Badge_number() throws Exception
	{
		// This will launch browser and specific url 
		   WebDriver driver=BrowserFactory.startBrowser("chrome", "https://selfiestyler.com/");  // live Environment
		   
		   Login_obj = new Login(driver); // create the object of login class
		   
		   Shop_Checkout_obj = new Shop_Checkout(driver); // create the object of shop_checkout class
		   
		   fitting_hanger = new Fitting_Room_Hanger_Icon(driver); // create the object of fitting_hanger class
		
		   Login_obj.click_login(); // click the login
		   
		   Login_obj.enter_email("qa-women@mailinator.com");  // enter the email for login
		   
		   Login_obj.enter_password("Germany0!");  // enter the password for login
		   
		   Login_obj.click_submit(); // submit button
		   
		   Thread.sleep(5000);
		   
		   Shop_Checkout_obj.click_Women(); // click the women link
		   
		   Thread.sleep(3000);
		    
		   String badge_number = Shop_Checkout_obj.get_badge_number();
		   
		   System.out.println("\n"+badge_number);
		     
		   Assert.assertTrue(badge_number.contains("0"));
		   
		   fitting_hanger.click_hanger();    // click on hanger for product
		   
		   Thread.sleep(8000);
		   
		   String updated_badge_number = Shop_Checkout_obj.updated_get_badge_number();
		   
		   System.out.println("\n"+updated_badge_number);
		   
		   Assert.assertTrue(updated_badge_number.contains("1"));
		   
		   Thread.sleep(5000);
		          		   
		   driver.quit();
		
		
		
	}
	
	
	

}
