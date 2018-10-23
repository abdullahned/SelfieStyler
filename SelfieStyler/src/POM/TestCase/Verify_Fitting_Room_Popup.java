package POM.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import PageObjectModel.FittingRoomPopup;
import PageObjectModel.Login;

public class Verify_Fitting_Room_Popup {

	Login login_page;              // login_page is the object reference variable of Login class
	
	FittingRoomPopup fitting_room;    // fitting_room is the object reference variable of FittingRoomPopup
	
	
    @Test
	
	public void validate_fitting_room_popup() throws InterruptedException
	{
	
	// This will launch browser and specific url 
	WebDriver driver=BrowserFactory.startBrowser("chrome", "https://selfiestyler.com/");  // live Environment
	
	login_page = new Login(driver);  // create the object of login class 
	
	// Call the method
	login_page.login_selfie_styler("rikodemos@mailinator.com", "Germany0!");      // live credentials
	
	
	fitting_room = new FittingRoomPopup(driver);
	
	fitting_room.fitting_selfie_styler();   // Call the method
	
	driver.quit();
	
	
	}
	
	
    
    
}
