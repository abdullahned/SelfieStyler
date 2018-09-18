package mm;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInErrorHandling extends UnauthenticatedHomePage {

	
	@Test (priority =12)
	 
	 public void InvalidCredentials() throws InterruptedException 
	 {
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
	
	
	@Test (priority =13)
	 
	 public void InvalidEmail() throws InterruptedException 
	 {
		 driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		 
		 Thread.sleep(4000); 
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Forgot?')]")).click();
		 
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc.com");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//button[@id='customer_login']")).click();	
		 
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
	
	

	@Test (priority =14)
	 
	 public void EmailNotFound() throws InterruptedException 
	 {
		 driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		 
		 Thread.sleep(4000); 
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Forgot?')]")).click();
		 
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@mailinator.com");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//button[@id='customer_login']")).click();	
		 
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
	
	
	
	
		
		
	
}
