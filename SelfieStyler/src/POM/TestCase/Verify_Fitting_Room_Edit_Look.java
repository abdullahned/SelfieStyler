package POM.TestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import PageObjectModel.Fitting_Room_Edit_Look;
import PageObjectModel.Fitting_Room_Hanger_Icon;
import PageObjectModel.Login;

public class Verify_Fitting_Room_Edit_Look {

	Login login_page;              // login_page is the object reference variable of Login class
	
	Fitting_Room_Hanger_Icon fitting_hanger;  // fitting_hanger is the object reference variable of Fitting_Room_Hanger_Icon
	
	Fitting_Room_Edit_Look fitting_editlook;
	
	
	@Test (enabled=false)
	
	public void validate_fitting_room_editlook () throws InterruptedException
	{
		// This will launch browser and specific url 
		WebDriver driver=BrowserFactory.startBrowser("chrome", "https://selfiestyler.com/");  // live Environment
		
		login_page = new Login(driver);  // create the object of login class 
		
		// Call the method
		login_page.login_selfie_styler("rikotest@mailinator.com", "Germany0!");      // live credentials
		
		fitting_hanger = new Fitting_Room_Hanger_Icon(driver);
		
		fitting_hanger.click_shop();    // click on shop link
		
		fitting_hanger.click_hanger();    // click on hanger for product
		
		Thread.sleep(8000);
		
		fitting_hanger.click_hanger1();     // click on hanger for product
		
		Thread.sleep(6000);
		
		fitting_editlook = new Fitting_Room_Edit_Look(driver); 
		
		
		fitting_editlook.Click_Edit_look();  // click on edit look in demo model
		
		fitting_editlook.Select_size();      // verify select size
		
		String text = fitting_editlook.Select_size();   // get the text of select size drop down 
		
		Assert.assertTrue(text.contains("Select a size")); // verify by default, select a size should be selected for non calibrated
		
		
    	Thread.sleep(3000);
		
		fitting_editlook.Remove_product();    // this will remove the product
		
		Thread.sleep(5000);
		
		fitting_editlook.Close_edit_popup();   // close the opened popup
		
		Thread.sleep(4000);
		
		fitting_editlook.Click_Edit_look();   // click on edit look in demo model
		
		fitting_editlook.recommended();   // select size from the drop down
		
		fitting_editlook.Add_to_cart();      // shows the status of cart
		
		fitting_editlook.Click_Add_to_bag();   // add the item to the bag
		
		Thread.sleep(3000);
		
		fitting_editlook.Add_to_cart();      // shows the status of cart
		
		driver.quit();
		
	}
	
	@Test(enabled=false)
	
	public void validate_select_a_size() throws InterruptedException
	
	{
		
		// This will launch browser and specific url 
		WebDriver driver=BrowserFactory.startBrowser("chrome", "https://selfiestyler.com/");  // live Environment
				
		login_page = new Login(driver);  // create the object of login class 
				
		// Call the method
		login_page.login_selfie_styler("rikotest@mailinator.com", "Germany0!");      // live credentials
				
		fitting_hanger = new Fitting_Room_Hanger_Icon(driver);
				
		fitting_hanger.click_shop();    // click on shop link
				
		fitting_hanger.click_hanger();    // click on hanger for product
				
		Thread.sleep(8000);
		
       fitting_editlook = new Fitting_Room_Edit_Look(driver); 
		
		
		fitting_editlook.Click_Edit_look();  // click on edit look in demo model
		
		Thread.sleep(4000);
		
		fitting_editlook.Click_Add_to_bag();   // add the item to the bag
		
		String text1 = fitting_editlook.error_message_select_size();  // get the text of error message of select a size
		
		Assert.assertTrue(text1.contains("Select a size"));
		
		driver.quit();
			
		
	}
	
	
	
	@Test(enabled=false)
	
	public void validate_calibrated_user() throws InterruptedException
	{
		
		// This will launch browser and specific url 
		WebDriver driver=BrowserFactory.startBrowser("chrome", "https://selfiestyler.com/");  // live Environment
				
		login_page = new Login(driver);  // create the object of login class 
				
		// Call the method
		login_page.login_selfie_styler("chandellevaldizon@yahoo.com", "Cjv913306061");      // live credentials
				
		fitting_hanger = new Fitting_Room_Hanger_Icon(driver);
				
		fitting_hanger.click_shop();    // click on shop link
		
        fitting_hanger.click_hanger();    // click on hanger for product
		
		Thread.sleep(8000);
		
		fitting_hanger.click_hanger1();     // click on hanger for product
		
		Thread.sleep(6000);
		
		fitting_editlook = new Fitting_Room_Edit_Look(driver);
		
		fitting_editlook.Click_Edit_look();  // click on edit look in demo model
		
       String recommended = fitting_editlook.Select_size();   // get the text of select size drop down 
		
		Assert.assertTrue(recommended.contains("(SureFit™ Recommended)")); // verify by default, (SureFit™ Recommended) should be selected for non calibrated
		
		Thread.sleep(3000);
		
		fitting_editlook.Remove_product();    // this will remove the product
		
		Thread.sleep(3000);
		
		fitting_editlook.Close_edit_popup();   // close the opened popup
		
		Thread.sleep(2000);
		
		fitting_editlook.Click_Edit_look();   // click on edit look in demo model
		
        Thread.sleep(3000);
		
		fitting_editlook.recommended();
		
		Thread.sleep(2000);
		
	    fitting_editlook.Add_to_cart();      // shows the status of cart
		
		fitting_editlook.Click_Add_to_bag();   // add the item to the bag
		
		Thread.sleep(3000);
		
		fitting_editlook.Add_to_cart();
		
		driver.quit();	
		
	}
	
	@Test
	
	public void validate_change_color() throws InterruptedException
	{
		// This will launch browser and specific url 
		WebDriver driver=BrowserFactory.startBrowser("chrome", "https://selfiestyler.com/");  // live Environment
						
		login_page = new Login(driver);  // create the object of login class 
						
				// Call the method
	    login_page.login_selfie_styler("chandellevaldizon@yahoo.com", "Cjv913306061");      // live credentials
						
		fitting_hanger = new Fitting_Room_Hanger_Icon(driver);				
		
		fitting_editlook = new Fitting_Room_Edit_Look(driver);
		
		fitting_editlook.click_brand();
		
		Thread.sleep(5000);
		   
		fitting_editlook.clickMonrow();
		
		Thread.sleep(8000);	
		
		fitting_editlook.click_monrow_product();
		
		Thread.sleep(8000);	
		
		fitting_editlook.Click_Edit_look();   // click on edit look in demo model
		
		fitting_editlook.Select_a_color();
		
		Thread.sleep(2000);
		
		fitting_editlook.recommended();
		
        fitting_editlook.Add_to_cart();      // shows the status of cart
		
		fitting_editlook.Click_Add_to_bag();   // add the item to the bag
		
		Thread.sleep(3000);
		
		fitting_editlook.Add_to_cart();      // shows the status of cart
		
		driver.quit();
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
