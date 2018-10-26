package POM.TestCase;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import PageObjectModel.Men;
import PageObjectModel.Women;
import library.Synchronization;

public class Verify_Men {
	

	 Random r = new Random();
	
	String firstname = "QA"+r.nextInt(100);
	   String lastname = "test"+r.nextInt(1000);
	   String email = "Qtest"+r.nextInt(1000)+"@mailinator.com";
	   String email1 = "Qtest"+r.nextInt(1000)+"@mailinator.com";
		
	
	Women womenobj;
	Men menobj;
	
	@Test
	
	public void validate_men() throws Exception
	{
		
		// This will launch browser and specific url 
		   WebDriver driver=BrowserFactory.startBrowser("chrome", "https://selfiestyler.com/");  // live Environment
		   
		   womenobj = new Women(driver);  // create the object of women class
		   
		   menobj = new Men(driver);  // create the object of men class
		   
		   womenobj.Signup_Click();   // click the signup link
		   
		   menobj.select_gender();   // select the gender
		   
		   womenobj.Enter_Firstname(firstname);  // enter the first name
		   
		   womenobj.Enter_Lastname(lastname);   // enter the last name
		   
		   womenobj.Enter_Email(email);    // enter the email
		   
		   womenobj.Enter_Phone();   // enter the phone number
		   
		   menobj.click_notify();    // click notify button
		   
		   Thread.sleep(3000);
		   
		   menobj.click_great(); 
		
		   Thread.sleep(2000);
		   
		   driver.quit();
		
	}
	
	
	
	
	
	
	
	

}
