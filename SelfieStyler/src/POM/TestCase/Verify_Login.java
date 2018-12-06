package POM.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import PageObjectModel.Login;

public class Verify_Login {

	@Test (priority =4,enabled=true)  
	
	public void checkValidCredentials() throws Exception
	{
	   
		// This will launch browser and specific url 
		WebDriver driver=BrowserFactory.startBrowser("chrome", "https://selfiestyler.com");  // live Environment
		
		String titile = driver.getTitle();
		
		System.out.println(titile);
		 
		// Created Page Object using Page Factory
		
		Login login_page=PageFactory.initElements(driver, Login.class);
		 
		// Call the method
		login_page.login_selfie_styler("qa-women@mailinator.com", "Germany0!");      // live credentials
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
	
	}
	
	
	
	
	
	
	
	
}
