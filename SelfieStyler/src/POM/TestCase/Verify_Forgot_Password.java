package POM.TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import PageObjectModel.Forgot_Password;
import PageObjectModel.Login;

public class Verify_Forgot_Password {
	
	Forgot_Password Forgot_Password_obj;
	
	Login Login_obj;
	
	@Test(enabled=true)
	public void validate_forgot_password() throws Exception
	{
	// This will launch browser and specific url 
	   WebDriver driver=BrowserFactory.startBrowser("chrome", "https://selfiestyler.com/");  // live Environment
	   
	   Forgot_Password_obj = new Forgot_Password(driver); // create the object of forgot password class
	   
	   Login_obj = new Login(driver); // create the object of login class
	   
	   Login_obj.click_login(); // click the login link
	   
	   Forgot_Password_obj.Click_forgot(); // click the forgot password link
		
	   Login_obj.enter_email("rikotest@mailinator.com"); // enter the email to get the forgot password link
	   
	   Forgot_Password_obj.click_reset_button(); // click the reset button
	   
	   Forgot_Password_obj.mailinator(); //open the mailinator url
	   
	   Forgot_Password_obj.inboxfield_mailinator(); // enter the email in mailinator
	   
	   Forgot_Password_obj.btn_mailinator(); // click the go button
	   
	   Forgot_Password_obj.open_email(); // open the email
	   
	   Thread.sleep(6000);
		 
	   driver.switchTo().frame("msg_body");  // move into the email
		 
	  Thread.sleep(4000);
	   
	   Forgot_Password_obj.email_button();  // click the button which is in email
	   
	   Forgot_Password_obj.switch_to_other_page();
	   
	   Forgot_Password_obj.click_reset_button();
	   
	   Thread.sleep(8000);
	   
	   Login_obj.click_login(); // click the login link
		   
	}
	
	
	
	
	

}
