package POM.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import PageObjectModel.Fitting_Room_Hanger_Icon;
import PageObjectModel.Login;

public class Verify_Fitting_Room_Hanger {


	Fitting_Room_Hanger_Icon fitting_hanger;  // fitting_hanger is the object reference variable of Fitting_Room_Hanger_Icon
	
	Login login_page;                       // login_page is the object reference variable of Login class
	
	
	@Test
	 
	 public void validate_Fitting_Room_Hanger () throws InterruptedException
	 {
		// This will launch browser and specific url 
			WebDriver driver=BrowserFactory.startBrowser("chrome", "https://marlon4xx.myshopify.com/");  // live Environment
				
			login_page = new Login(driver);  // create the object of login class	 
			 
			// Call the method
			login_page.login_selfie_styler("rikodemo@mailinator.com", "Germany0!");      // live credentials
				
			//Fitting_Room_Hanger_Icon fittinghanger =PageFactory.initElements(driver, Fitting_Room_Hanger_Icon.class);
			
			fitting_hanger = new Fitting_Room_Hanger_Icon(driver);
			
			fitting_hanger.click_shop();
			
			fitting_hanger.click_hanger();
			
			Thread.sleep(8000);	
			
			fitting_hanger.click_hanger();
			
			Thread.sleep(1000);	
			
			WebElement tool = driver.findElement(By.xpath("//div[@class='toolbar']")); 
			
			Actions action = new Actions(driver);

			action.moveToElement(tool).click().perform();
			
			Thread.sleep(4000);	
			
			driver.quit();
			
			
			
	 }
	
	
	
	
	
}
