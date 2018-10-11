package POM.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import PageObjectModel.Login;

public class VerifyLogin {

	@Test
	
	public void checkValidCredentials()
	{
	   
		// This will launch browser and specific url 
		WebDriver driver=BrowserFactory.startBrowser("chrome", "https://selfiestyler.com/");  // live Environment
		
		//WebDriver driver=BrowserFactory.startBrowser("chrome", "http://qa-na.selfiestyler.com/");  // QA Environment
		 
		// Created Page Object using Page Factory
		
		Login login_page=PageFactory.initElements(driver, Login.class);
		 
		// Call the method
		login_page.login_selfie_styler("rikotest@mailinator.com", "Germany0!");      // live credentials
		
		
	
	}
	
	
	
	
	
	
	
	
}
