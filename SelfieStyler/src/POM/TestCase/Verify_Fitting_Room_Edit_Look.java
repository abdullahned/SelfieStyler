package POM.TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import PageObjectModel.Fitting_Room_Edit_Look;
import PageObjectModel.Fitting_Room_Hanger_Icon;
import PageObjectModel.Login;

public class Verify_Fitting_Room_Edit_Look {

	Login login_page;              // login_page is the object reference variable of Login class
	
	Fitting_Room_Hanger_Icon fitting_hanger;  // fitting_hanger is the object reference variable of Fitting_Room_Hanger_Icon
	
	Fitting_Room_Edit_Look fittting_editlook;
	
	@Test
	
	public void validate_fitting_room_editlook () throws InterruptedException
	{
		// This will launch browser and specific url 
		WebDriver driver=BrowserFactory.startBrowser("chrome", "https://selfiestyler.com/");  // live Environment
		
		login_page = new Login(driver);  // create the object of login class 
		
		// Call the method
		login_page.login_selfie_styler("rikotest@mailinator.com", "Germany0!");      // live credentials
		
		fitting_hanger = new Fitting_Room_Hanger_Icon(driver);
		
		fitting_hanger.click_shop();
		
		fitting_hanger.click_hanger();
		
		Thread.sleep(6000);
		
		fitting_hanger.click_hanger1();
		
		Thread.sleep(6000);
		
		fittting_editlook = new Fitting_Room_Edit_Look(driver); 
		
		
		fittting_editlook.Click_Edit_look();
		
	}
	
	
	
	
	
}
