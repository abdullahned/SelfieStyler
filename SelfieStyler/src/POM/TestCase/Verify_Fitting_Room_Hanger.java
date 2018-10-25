package POM.TestCase;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Helper.BrowserFactory;
import PageObjectModel.Fitting_Room_Hanger_Icon;
import PageObjectModel.Login;


public class Verify_Fitting_Room_Hanger {


	Fitting_Room_Hanger_Icon fitting_hanger;  // fitting_hanger is the object reference variable of Fitting_Room_Hanger_Icon
	
	Login login_page;                       // login_page is the object reference variable of Login class
	
	
	@Test
	 
	 public void validate_Fitting_Room_Hanger () throws Exception
	 {
		// This will launch browser and specific url 
			WebDriver driver=BrowserFactory.startBrowser("chrome", "https://selfiestyler.com/");  // live Environment
				
			login_page = new Login(driver);  // create the object of login class	 
			 
			// Call the method
			login_page.login_selfie_styler("rikotest@mailinator.com", "Germany0!");      // live credentials
				
			//Fitting_Room_Hanger_Icon fittinghanger =PageFactory.initElements(driver, Fitting_Room_Hanger_Icon.class);
			
			fitting_hanger = new Fitting_Room_Hanger_Icon(driver);
			
			fitting_hanger.click_shop();
			
			fitting_hanger.click_hanger();
			
			Thread.sleep(8000);	
			
			fitting_hanger.click_hanger();
			
			Thread.sleep(1000);	
			
			fitting_hanger.clickRandom();
			
			Thread.sleep(1000);
			
			driver.quit(); 
					
			
	 }
	
	
	
}
