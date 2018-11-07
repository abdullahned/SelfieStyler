package POM.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import PageObjectModel.FittingRoomPopup;
import PageObjectModel.Login;
import PageObjectModel.Shop_Checkout;

public class Verify_Fitting_Room_Popup {

	Login Login_obj;             // login_obj is the object reference variable of Login class
	
	FittingRoomPopup fitting_room_popup_obj;    // fitting_room_popup_obj is the object reference variable of FittingRoomPopup
	
	Shop_Checkout Shop_Checkout_obj;  // Shop_Checkout_obj is the object reference variable of Shop_Checkout class
	
	
    @Test
	
	public void validate_fitting_room_popup() throws Exception
	{
	
	// This will launch browser and specific url 
	WebDriver driver=BrowserFactory.startBrowser("chrome", "https://selfiestyler.com/");  // live Environment
	
	  Login_obj = new Login(driver); // create the object of login class
	
	  fitting_room_popup_obj = new FittingRoomPopup(driver);   // create the object of FittingRoomPopup class
	
	  Shop_Checkout_obj = new Shop_Checkout(driver); // create the object of shop_checkout class
	
	  Login_obj.click_login(); // click the login
	   
	  Login_obj.enter_email("qa-women@mailinator.com");  // enter the email for login
	   
	  Login_obj.enter_password("Germany0!");  // enter the password for login
	   
	  Login_obj.click_submit(); // submit button
	   
	  Thread.sleep(5000);
	
	  Shop_Checkout_obj.click_Women();
	
	  fitting_room_popup_obj.click_down();
	  
	  fitting_room_popup_obj.click_up();
		
	  driver.quit();
	
	
	}
	

}
