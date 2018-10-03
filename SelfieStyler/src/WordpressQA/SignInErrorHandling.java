package WordpressQA;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class SignInErrorHandling extends UnauthenticatedHomePage {

	
	@Test (priority =12,enabled=false)
	 
	 public void InvalidCredentials() throws InterruptedException 
	  {
		
		 ExtentTest test = extent.createTest("Invalid Crdential for Sign in");
		 
		test.log(Status.INFO, "User has entered invalid credentials for Sign in ");
		
		
		 driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("password")).sendKeys("Sindhi0!");
		 
		 Thread.sleep(1000);
		 
	     driver.findElement(By.id("customer_login")).click();
		 
		 Thread.sleep(6000);
		 
		 String actual_error = driver.findElement(By.xpath("//div[@id='top_error_para']")).getText();
			
		 System.out.println(actual_error);
		 
		 String actual_error1 = driver.findElement(By.xpath("//div[@id='bottom_error_para']")).getText();
			
		 System.out.println(actual_error1);
			 	
		 String expect = "Looks like something went wrong\n" + 
					"User name and/or password is not valid";
			
    	 Assert.assertTrue(actual_error.contains("Looks like something went wrong"));
			
		 Assert.assertTrue(actual_error.contains("User name and/or password is not valid"));

		 Assert.assertEquals(actual_error, expect);
			
		 Assert.assertTrue(actual_error1.contains("Please enter valid user name and password."));
						
									 
		 		
	 }
	
	
	@Test (priority =13,enabled=false)
	 
	 public void InvalidEmail() throws InterruptedException 
	 {
		
		 ExtentTest test = extent.createTest("Invalid Email for Password Reset");
		 
		test.log(Status.INFO, "User has entered Invalid Email for Password Reset");
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		 
		 Thread.sleep(4000); 
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Forgot?')]")).click();
		 
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc.com");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//button[@id='customer_login_forgot']")).click();	
		 
		 Thread.sleep(5000);
		 
		 String actual_error = driver.findElement(By.xpath("//div[@id='top_error_para']")).getText();
			
		 System.out.println(actual_error);
		 
		 String actual_error1 = driver.findElement(By.xpath("//div[@id='bottom_error_para']")).getText();
			
		 System.out.println(actual_error1);
			                                           		 
		 String expect = "Looks like something went wrong\n" + 
					"Email address is not valid.";
			
		 Assert.assertTrue(actual_error.contains("Looks like something went wrong"));
			
		 Assert.assertTrue(actual_error.contains("Email address is not valid."));

		 Assert.assertEquals(actual_error, expect);
		 
		 Assert.assertTrue(actual_error1.contains("Please enter valid email address."));
		 
			
}
	
	

	@Test (priority =14,enabled=false)
	 
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
	
	
	
	@Test (priority =15,enabled=false)
	
	 public void InvalidPwdCriteria () throws InterruptedException 
	 {
		 
		 ExtentTest test = extent.createTest("Invalid Password for Password Reset");
		 
		 test.log(Status.INFO, "User has entered Invalid Password for Password Reset");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		 
		 Thread.sleep(4000); 
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Forgot?')]")).click();
		 
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rikotest@mailinator.com");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//button[@id='customer_login_forgot']")).click();	
		 
		 Thread.sleep(15000);
		 
		 driver.get("https://www.mailinator.com/ ");
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='inboxfield']")).sendKeys("rikotest@mailinator.com");
		 
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//button[contains(@class,'btn btn-dark')]")).click();
		 
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//*[contains(text(),'SelfieStyler: Password Reset')]")).click();
		 
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
				
				driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("Sindhi");
				
				 Thread.sleep(2000);
				 
				 driver.findElement(By.xpath("//input[@id='password2']")).sendKeys("Sindhi");
				 
			     Thread.sleep(1000);
				 
				 driver.findElement(By.xpath("//button[@id='reset_password']")).click();
				 
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
			      
	      
				
				
			}
		}
				
		
	 }
		 

	@Test (priority =16,enabled=false)
	 
	 public void PasswordNotMatched () throws InterruptedException 
	 {
		 
		ExtentTest test = extent.createTest("Password and Confirmed Password");
		 
		 test.log(Status.INFO, "User has entered mismatched password");
		
			
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		 
		 Thread.sleep(4000); 
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Forgot?')]")).click();
		 
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rikotest@mailinator.com");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//button[@id='customer_login_forgot']")).click();	
		 
		 Thread.sleep(15000);
		 
		 driver.get("https://www.mailinator.com/ ");
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='inboxfield']")).sendKeys("rikotest@mailinator.com");
		 
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//button[contains(@class,'btn btn-dark')]")).click();
		 
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//*[contains(text(),'SelfieStyler: Password Reset')]")).click();
		 
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
				
				driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("Sindhi0!");
				
				 Thread.sleep(2000);
				 
				 driver.findElement(By.xpath("//input[@id='password2']")).sendKeys("Sindhi");
				 
			     Thread.sleep(1000);
				 
				 driver.findElement(By.xpath("//button[@id='reset_password']")).click();
				 
			      Thread.sleep(8000);
			      
			      String actual_error = driver.findElement(By.xpath("//div[@id='top_error_para']")).getText();
					
				  System.out.println(actual_error);
					 
				  String actual_error1 = driver.findElement(By.xpath("//div[@id='bottom_error_para']")).getText();
						
				  System.out.println(actual_error1);
				  
				  String expect = "Looks like something went wrong\n" + 
							"Passwords entered do not match.";
				  
				  Assert.assertTrue(actual_error.contains("Looks like something went wrong"));
					
					 Assert.assertTrue(actual_error.contains("Passwords entered do not match."));

					 Assert.assertEquals(actual_error, expect);
					 
					 Assert.assertTrue(actual_error1.contains("Passwords must match."));
			      
	      
				
				
			}
		}
				
		
	 }
		 

	
	
	
	
		
		
	
}
