package POM.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import PageObjectModel.FittingRoomPopup;
import PageObjectModel.Login;

public class Verify_Fitting_Room_Popup {

	
    @Test
	
	public void validate_fitting_room_popup() throws InterruptedException
	{
	
	// This will launch browser and specific url 
	WebDriver driver=BrowserFactory.startBrowser("chrome", "https://selfiestyler.com/");  // live Environment
	
	Login login_page=PageFactory.initElements(driver, Login.class); // Created Page Object using Page Factory
	 
	 
	// Call the method
	login_page.login_selfie_styler("rikotest@mailinator.com", "Germany0!");      // live credentials
	
	
	// Created Page Object using Page Factory
	
	FittingRoomPopup fittingroom =PageFactory.initElements(driver, FittingRoomPopup.class);
	
	fittingroom.fitting_selfie_styler();   // Call the method
	
	driver.quit();
	
	
	}
	
	
    
    
}
