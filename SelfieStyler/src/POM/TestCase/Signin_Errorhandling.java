package POM.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import PageObjectModel.Login;

public class Signin_Errorhandling {

	Login loginobj;

	
	@Test(enabled=true)
	public void Invalidcrdentials() throws Exception
	{
		//This will launch browser and specific url 
		WebDriver driver=BrowserFactory.startBrowser("chrome", "https://selfiestyler.com/");  // live Environment
		
		loginobj = new Login(driver);
		
		loginobj.click_login();
		
		loginobj.enter_email("abc@gmail.com");
		
		loginobj.enter_password("Germany0!");
		
		loginobj.click_submit();
		
		Thread.sleep(6000);
		
		String top_error_message = loginobj.top_error();
		
		System.out.println(top_error_message);
		
		String bottom_error_message = loginobj.bottom_error();
		
		System.out.println(bottom_error_message);
		
		 Assert.assertTrue(top_error_message.contains("Looks like something went wrong"));
			
		 Assert.assertTrue(top_error_message.contains("User name and/or password is not valid"));
		 
		 Assert.assertTrue(bottom_error_message.contains("Please enter valid user name and password."));
		
	}
	
	

}
