package POM.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import PageObjectModel.Login;
import PageObjectModel.Shop_Checkout;

public class Verify_Shop_Checkout {
	
    Login Login_obj;
	
	Shop_Checkout Shop_Checkout_obj;
	
	
	@Test(enabled=true)
	public void validate_shop_checkout() throws Exception
	{
		
		// This will launch browser and specific url 
	   WebDriver driver=BrowserFactory.startBrowser("chrome", "https://selfiestyler.com/");  // live Environment
		   
	   Login_obj = new Login(driver); // create the object of login class
		   
	   Shop_Checkout_obj = new Shop_Checkout(driver); // create the object of shop_checkout class
		
       Login_obj.click_login(); // click the login
	   
	   Login_obj.enter_email("qa-men@mailinator.com");  // enter the email for login
	   
	   Login_obj.enter_password("Germany0!");  // enter the password for login
	   
	   Login_obj.click_submit(); // submit button
	   
	   Thread.sleep(5000);
	   
	   Shop_Checkout_obj.click_men();
	   
	   Shop_Checkout_obj.click_product_Detail();
	   
	   Thread.sleep(3000);
	   
	   JavascriptExecutor jex = (JavascriptExecutor)driver;
	   
	   jex.executeScript("window.scrollBy(0,200)", "");
		 
	   Thread.sleep(3000);
	   
	   Shop_Checkout_obj.click_add_to_cart();
		
	    Thread.sleep(3000);
	   
	    Shop_Checkout_obj.click_go_to_cart();
	   

	   Thread.sleep(5000);
	   
	   jex.executeScript("window.scrollBy(0,200)", "");
	   
	   Shop_Checkout_obj.click_checkout();
	   
	   Shop_Checkout_obj.click_checkout_shipping_address();
	   
	   Shop_Checkout_obj.click_checkout_shipping_address_city();
	   
	   Shop_Checkout_obj.click_checkout_shipping_address_zip();
	   
	   jex.executeScript("window.scrollBy(0,200)", "");
	   
	   Thread.sleep(2000);
	   
	   Shop_Checkout_obj.click_continue_to_shipping_method();
	   
	   Thread.sleep(5000);
	   
	   Shop_Checkout_obj.click_continue_to_payment_method();   

	   Thread.sleep(5000);
	   
	   driver.quit();
	   
	   
	}
	

	

}
