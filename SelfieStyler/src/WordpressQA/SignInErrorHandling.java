package WordpressQA;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import library.HighlightLocator;

public class SignInErrorHandling extends UnauthenticatedHomePage {

	
	@Test (priority =9,enabled=false)
	 
	 public void InvalidCredentials() throws InterruptedException 
	  {
		
		 ExtentTest test = extent.createTest("Invalid Crdential for Sign in");
		 
		test.log(Status.INFO, "User has entered invalid credentials for Sign in ");
		
		
		WebElement clickLogin = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
		 
		HighlightLocator.highLightElement(driver, clickLogin);
		
		clickLogin.click();
		 
		 Thread.sleep(3000);
		  
		 WebElement enterEmail = driver.findElement(By.id("email")); 
		 
		 HighlightLocator.highLightElement(driver,enterEmail );
		 
		 enterEmail.sendKeys("abc@gmail.com");
		 
		 Thread.sleep(1000);
		 
		 WebElement enterPassword = driver.findElement(By.id("password"));
		 
		 HighlightLocator.highLightElement(driver,enterPassword );
		 
		 enterPassword.sendKeys("Germany0!");
		 
		 Thread.sleep(1000);
		 
		 WebElement submit =  driver.findElement(By.id("customer_login"));
		 
		 HighlightLocator.highLightElement(driver,submit );
		 
		 submit.click();
		 
		 Thread.sleep(6000);
		 
		 String top_error_para = driver.findElement(By.xpath("//div[@id='top_error_para']")).getText();
			
		 System.out.println(top_error_para);
		 
		 String bottom_error_para = driver.findElement(By.xpath("//div[@id='bottom_error_para']")).getText();
			
		 System.out.println(bottom_error_para);
			 	
		 String expect = "Looks like something went wrong\n" + 
					"User name and/or password is not valid";
			
    	 Assert.assertTrue(top_error_para.contains("Looks like something went wrong"));
			
		 Assert.assertTrue(top_error_para.contains("User name and/or password is not valid"));

		 Assert.assertEquals(top_error_para, expect);
			
		 Assert.assertTrue(bottom_error_para.contains("Please enter valid user name and password."));
						
		 driver.navigate().refresh();
		 
         WebElement Forgot = driver.findElement(By.xpath("//a[contains(text(),'Forgot?')]"));  // Invalid Email
		 
		 HighlightLocator.highLightElement(driver, Forgot);
		 
		 Forgot.click();
		 
		 Thread.sleep(2000);
		 
		 WebElement enterEmail1 = driver.findElement(By.id("email")); 
		 
		 HighlightLocator.highLightElement(driver,enterEmail1 );
		 
		 enterEmail1.sendKeys("abc.com");
		 	   	 
			 
         WebElement customer_login_forgot = driver.findElement(By.xpath("//button[@id='customer_login_forgot']"));	
		 
		 HighlightLocator.highLightElement(driver,customer_login_forgot );
		 
		 customer_login_forgot.click();
		 
	     Thread.sleep(5000);
		 
		 String top_error_para1 = driver.findElement(By.xpath("//div[@id='top_error_para']")).getText();
			
		 System.out.println(top_error_para1);
		 
		 String bottom_error_para1 = driver.findElement(By.xpath("//div[@id='bottom_error_para']")).getText();
			
		 System.out.println(bottom_error_para1);
			                                           		 
		 String expect1 = "Looks like something went wrong\n" + 
					"Email address is not valid.";
			
		 Assert.assertTrue(top_error_para1.contains("Looks like something went wrong"));
			
		 Assert.assertTrue(top_error_para1.contains("Email address is not valid."));

		 Assert.assertEquals(top_error_para1, expect1);
		 
		 Assert.assertTrue(bottom_error_para1.contains("Please enter valid email address."));
		
		 
		 
	 }
	


	@Test (priority =10,enabled=false)
	 
	 public void EmailNotFound() throws InterruptedException
	 {
		 ExtentTest test = extent.createTest("Incorrect Email for Password Reset");
		 
		test.log(Status.INFO, "User has entered Incorrect Email for Password Reset");
		
			
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		 
		 Thread.sleep(4000); 
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Forgot?')]")).click();
		 
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@mailinator.com");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//button[@id='customer_login_forgot']")).click();	
		 
		 Thread.sleep(5000);
		 
		 String actual_error = driver.findElement(By.xpath("//div[@id='top_error_para']")).getText();
			
		 System.out.println(actual_error);
		 
		 String actual_error1 = driver.findElement(By.xpath("//div[@id='bottom_error_para']")).getText();
			
		 System.out.println(actual_error1);
			                                           		 
		 String expect = "Looks like something went wrong\n" + 
					"Email address not found.";
			
		 Assert.assertTrue(actual_error.contains("Looks like something went wrong"));
			
		 Assert.assertTrue(actual_error.contains("Email address not found."));

		 Assert.assertEquals(actual_error, expect);
		 
		 Assert.assertTrue(actual_error1.contains("Sorry, we could not find an account for this email."));
		 
			
}
	
	
	
	@Test (priority =11,enabled=false)
	
	 public void InvalidPwdCriteria () throws InterruptedException 
	 {
		 
		 ExtentTest test = extent.createTest("Invalid Password for Password Reset");
		 
		 test.log(Status.INFO, "User has entered Invalid Password for Password Reset");
		
		
		 WebElement clickLogin = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
		 
			HighlightLocator.highLightElement(driver, clickLogin);
			
			clickLogin.click();
			 
			 Thread.sleep(4000); 
			 
			 WebElement Forgot =   driver.findElement(By.xpath("//a[contains(text(),'Forgot?')]"));
			 
			 HighlightLocator.highLightElement(driver, Forgot);
			 
			 Forgot.click();
			 
			 Thread.sleep(4000);
			  

			 WebElement enterEmail = driver.findElement(By.xpath("//input[@id='email']")); 
			 
			 HighlightLocator.highLightElement(driver,enterEmail );
			 
			 enterEmail.sendKeys("rikotest@mailinator.com");
			 
			 Thread.sleep(1000);
			 
			 WebElement customer_login_forgot = driver.findElement(By.xpath("//button[@id='customer_login_forgot']"));	
			 
			 HighlightLocator.highLightElement(driver,customer_login_forgot );
			 
			 customer_login_forgot.click();
		 
		 Thread.sleep(15000);
		 
		 driver.get("https://www.mailinator.com/ ");
		 
		 Thread.sleep(3000);
		 
		 WebElement inboxfield  = driver.findElement(By.xpath("//input[@id='inboxfield']"));
		 
		 HighlightLocator.highLightElement(driver,inboxfield );
		 
		 inboxfield.sendKeys("rikotest@mailinator.com");
		 
		 Thread.sleep(4000);
		 
         WebElement btn   =  driver.findElement(By.xpath("//button[contains(@class,'btn btn-dark')]"));
		 
		 HighlightLocator.highLightElement(driver,btn);
		 
		 btn.click();
		 
		 Thread.sleep(4000);
		 
         WebElement link = driver.findElement(By.xpath("//*[contains(text(),'SelfieStyler: Password Reset')]"));
		 
		 HighlightLocator.highLightElement(driver,link);
		 
		 link.click();
		 
		 Thread.sleep(6000);
		 
		 driver.switchTo().frame("msg_body");
		 
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//a[@class='button__text']")).click();
		 
		 Thread.sleep(8000);
		 
		 String parent_window= driver.getWindowHandle();
		 
		Set<String> s1=driver.getWindowHandles();
		
		Iterator<String> i1=s1.iterator();
		
		while (i1.hasNext())
		{
			String child_window = i1.next();
			
			if(!parent_window.equalsIgnoreCase(child_window))
			{
				driver.switchTo().window(child_window);
				
                WebElement password1 = driver.findElement(By.xpath("//input[@id='password1']"));
				
				HighlightLocator.highLightElement(driver,password1 );
				
				password1.sendKeys("Germany");
				
				Thread.sleep(2000);
				 
                WebElement password2 = driver.findElement(By.xpath("//input[@id='password2']"));
				
				HighlightLocator.highLightElement(driver,password2);
				
				password2.sendKeys("Germany");
				 
				 System.out.println(password);
				 
			     Thread.sleep(1000);
				 
			     WebElement reset_password = driver.findElement(By.xpath("//button[@id='reset_password']"));
				 
			     HighlightLocator.highLightElement(driver,reset_password);
			     
			     reset_password.click();
				 
			      Thread.sleep(8000);
			      
			      String actual_error = driver.findElement(By.xpath("//div[@id='top_error_para']")).getText();
					
				  System.out.println(actual_error);
					 
				  String actual_error1 = driver.findElement(By.xpath("//div[@id='bottom_error_para']")).getText();
						
				  System.out.println(actual_error1);
				  
				  String expect = "Looks like something went wrong\n" + 
							"Password is not valid.";
				  
				  Assert.assertTrue(actual_error.contains("Looks like something went wrong"));
					
					 Assert.assertTrue(actual_error.contains("Password is not valid."));

					 Assert.assertEquals(actual_error, expect);
					 
					 Assert.assertTrue(actual_error1.contains("Please enter valid password."));
			      
	      driver.navigate().refresh();
	      
	      WebElement password3 = driver.findElement(By.xpath("//input[@id='password1']"));    // Entered password must match
			
			HighlightLocator.highLightElement(driver,password3 );
			
			password3.sendKeys("Germany0!");
			
			Thread.sleep(2000);
			 
          WebElement password4 = driver.findElement(By.xpath("//input[@id='password2']"));
			
			HighlightLocator.highLightElement(driver,password4);
			
			password4.sendKeys("Germany");
			 
			 System.out.println(password);
			 
		     Thread.sleep(1000);
			 
		     WebElement reset_password1 = driver.findElement(By.xpath("//button[@id='reset_password']"));
			 
		     HighlightLocator.highLightElement(driver,reset_password1);
		     
		     reset_password1.click();
			 
		      Thread.sleep(8000);
		      
		      String actual1 = driver.findElement(By.xpath("//div[@id='top_error_para']")).getText();
				
			  System.out.println(actual1);
				 
			  String actual2 = driver.findElement(By.xpath("//div[@id='bottom_error_para']")).getText();
					
			  System.out.println(actual2);
			  
			  String exp = "Looks like something went wrong\n" + 
						"Passwords entered do not match.";
			  
			  Assert.assertTrue(actual1.contains("Looks like something went wrong"));
				
				 Assert.assertTrue(actual1.contains("Passwords entered do not match."));

				 Assert.assertEquals(actual1, exp);
				 
				 Assert.assertTrue(actual2.contains("Passwords must match."));
	      
	      			
				
			}
		}
				
		
	 }
		 

	
		
	
}
