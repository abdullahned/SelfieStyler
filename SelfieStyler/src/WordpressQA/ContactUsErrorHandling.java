package WordpressQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ContactUsErrorHandling extends UnauthenticatedHomePage {
	
	
@Test (priority =17,enabled=false)
	
	public void InvalidEmail () throws InterruptedException
	
	{
	
	     ExtentTest test = extent.createTest("Invalid Email for Contact Us");
	 
         test.log(Status.INFO, "User has entered Invalid Email for Contact Us");
    
		 Thread.sleep(3000);
		 
		JavascriptExecutor jex = (JavascriptExecutor)driver;
		 
	     jex.executeScript("window.scrollBy(0,500)", "");
	     
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
	     
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("first_name")).sendKeys(firstname);
			
		 Thread.sleep(1000);
			
		 driver.findElement(By.id("last_name")).sendKeys(lastname);
			
		 Thread.sleep(1000);
			
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testemail");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys("0213578965");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//textarea[@id='comments']")).sendKeys("Please Let me know !!");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//button[@id='contact_submit']")).click();
		 
		 Thread.sleep(2000);
		 
		 String actual_error = driver.findElement(By.xpath("//div[@id='contact_us_err_container']")).getText();
			
		  System.out.println(actual_error);
			 
		  String actual_error1 = driver.findElement(By.xpath("//div[@id='error_contact_email']")).getText();
				
		  System.out.println(actual_error1);
		  
		  String expect = "Looks like something went wrong\n" + 
					"Please enter valid email address";
		  
		  Assert.assertTrue(actual_error.contains("Looks like something went wrong"));
			
			 Assert.assertTrue(actual_error.contains("Please enter valid email address"));

			 Assert.assertEquals(actual_error, expect);
			 
			 Assert.assertTrue(actual_error1.contains("Please enter valid email address"));
		 
		 		 
		 }
	


@Test (priority =18,enabled=false)

public void MissingFields () throws InterruptedException

{
	 
	 ExtentTest test = extent.createTest("User left some field");
	 
     test.log(Status.INFO, "User has Left some mandatory field");
	
	 Thread.sleep(3000);
	 
	JavascriptExecutor jex = (JavascriptExecutor)driver;
	 
     jex.executeScript("window.scrollBy(0,500)", "");
     
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
     
     Thread.sleep(2000);
     
	 
	 driver.findElement(By.xpath("//button[@id='contact_submit']")).click();
	 
	 Thread.sleep(2000);
	 
	 String actual_error = driver.findElement(By.xpath("//div[@id='contact_us_err_container']")).getText();
		
	  System.out.println(actual_error);
		 
	  String actual_error1 = driver.findElement(By.xpath("//div[@id='error_contact_email']")).getText();
			
	  System.out.println(actual_error1);
	  
	  String actual_error2 = driver.findElement(By.xpath("//div[@id='error_contact_comment']")).getText();
	  
	  System.out.println(actual_error2);
	  
	  
	  String expect = "Looks like something went wrong\n" + 
				"Please enter valid email address\n" + "Please leave a comment";
	  
	  Assert.assertTrue(actual_error.contains("Looks like something went wrong"));
		
		 Assert.assertTrue(actual_error.contains("Please enter valid email address"));
		 
		 Assert.assertTrue(actual_error.contains("Please leave a comment"));

		 Assert.assertEquals(actual_error, expect);
		 
		 Assert.assertTrue(actual_error1.contains("Please enter valid email address"));
		 
		 Assert.assertTrue(actual_error2.contains("Please leave a comment"));
	 
	 		 
	 }

	
	
	

}
