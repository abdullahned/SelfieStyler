package WordpressQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpErrorHandling extends UnauthenticatedHomePage {
	
	
 @Test (priority =7,enabled=false)
	 
	 public void InvalidEmail () throws InterruptedException
	 
	 {
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		 
			//handle drop box:
			Select select = new Select(driver.findElement(By.id("gender")));
			
			Thread.sleep(1000);
			
			select.selectByVisibleText("Female");
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("first_name")).sendKeys(firstname);
			
			Thread.sleep(1000);
			
		driver.findElement(By.id("last_name")).sendKeys(lastname);
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("mem_email")).sendKeys("QAtest");
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("phone")).sendKeys("0213578965");
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("mem_password")).sendKeys("Pakistan0!");
			
			driver.findElement(By.id("confirm_mem_password")).sendKeys("Pakistan0!");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
			
			Thread.sleep(5000);
			

			WebElement  sign_up  = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
			
            Actions actions = new Actions(driver);
			
			actions.moveToElement(sign_up).click().perform();
			
			Thread.sleep(5000);			
			
			
			
			WebElement element = driver.findElement(By.id("terms"));
			
			
			actions.moveToElement(element).click().perform();
			
			Thread.sleep(1000);
			
	        driver.findElement(By.id("register_button")).click();
			
			Thread.sleep(3000);
			
			JavascriptExecutor jq = (JavascriptExecutor)driver;
			
			jq.executeScript("window.scrollBy(0,-500)", "");
			
			Thread.sleep(3000);
			
		String actual_error = driver.findElement(By.xpath("//div[@id='top-error']")).getText();
		
		System.out.println(actual_error);
		String expect = "Looks like something went wrong\n" + 
				"Email address is not valid";
		 
		String actual_error1 = driver.findElement(By.xpath("//div[@id='error_mem_email']")).getText();
		
		System.out.println(actual_error1);
		
		// String expected_error = "Looks like something went wrong";
		 
		// Assert.assertEquals(actual_error, expected_error);
		
		Assert.assertTrue(actual_error.contains("Looks like something went wrong"));
		
		Assert.assertTrue(actual_error.contains("Email address is not valid"));
		
		Assert.assertEquals(actual_error, expect);
		
		Assert.assertTrue(actual_error1.contains("Please enter a valid email address"));
		
		
	
	 }

	 
 @Test (priority =8,enabled=false)
	 
	 public void InvalidPassword () throws InterruptedException
	 
	 {
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		 
			//handle drop box:
			Select select = new Select(driver.findElement(By.id("gender")));
			
			Thread.sleep(1000);
			
			select.selectByVisibleText("Female");
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("first_name")).sendKeys(firstname);
			
			Thread.sleep(1000);
			
		driver.findElement(By.id("last_name")).sendKeys(lastname);
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("mem_email")).sendKeys(email);
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("phone")).sendKeys("0213578965");
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("mem_password")).sendKeys("Pakistan");
			
			driver.findElement(By.id("confirm_mem_password")).sendKeys("Pakistan");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
			
			Thread.sleep(5000);
			

			WebElement  sign_up  = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
			
            Actions actions = new Actions(driver);
			
			actions.moveToElement(sign_up).click().perform();
			
			Thread.sleep(5000);
			
			
			WebElement element = driver.findElement(By.id("terms"));
			
			
			actions.moveToElement(element).click().perform();
			
			Thread.sleep(1000);
			
	        driver.findElement(By.id("register_button")).click();
			
			Thread.sleep(3000);
			
			JavascriptExecutor jw = (JavascriptExecutor)driver;
			
			jw.executeScript("window.scrollBy(0,-500)", "");
			
			Thread.sleep(3000);
			
		String actual_error = driver.findElement(By.xpath("//div[@id='top-error']")).getText();
		
		System.out.println(actual_error);
		 
		String expect = "Looks like something went wrong\n" + 
				"Password is not valid";
		
        String actual_error1 = driver.findElement(By.xpath("//div[@id='error_mem_password']")).getText();
		
		System.out.println(actual_error1);
		
		Assert.assertTrue(actual_error.contains("Looks like something went wrong"));
		
		Assert.assertTrue(actual_error.contains("Password is not valid"));
	
		Assert.assertEquals(actual_error, expect);
		
		Assert.assertTrue(actual_error1.contains("Please enter a valid password."));
		
	 }

	 
 @Test (priority =9,enabled=false)
 
 public void PasswordNotMatch () throws InterruptedException
 
 {
	 
	 driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
	 
		//handle drop box:
		Select select = new Select(driver.findElement(By.id("gender")));
		
		Thread.sleep(1000);
		
		select.selectByVisibleText("Female");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		
		Thread.sleep(1000);
		
	driver.findElement(By.id("last_name")).sendKeys(lastname);
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("mem_email")).sendKeys(email);
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("phone")).sendKeys("0213578965");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("mem_password")).sendKeys("Pakistan0!");
		
		driver.findElement(By.id("confirm_mem_password")).sendKeys("Pakistan");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
		
		Thread.sleep(5000);
		

		WebElement  sign_up  = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
		
        Actions actions = new Actions(driver);
		
		actions.moveToElement(sign_up).click().perform();
		
		Thread.sleep(5000);
		
		
		WebElement element = driver.findElement(By.id("terms"));
		
		
		actions.moveToElement(element).click().perform();
		
		Thread.sleep(1000);
		
        driver.findElement(By.id("register_button")).click();
		
		Thread.sleep(3000);
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		
		je.executeScript("window.scrollBy(0,-500)", "");
		
		Thread.sleep(3000);
		
	String actual_error = driver.findElement(By.xpath("//div[@id='top-error']")).getText();
	
	System.out.println(actual_error);
	
	String actual_error1 = driver.findElement(By.xpath("//div[@id='error_confirm_mem_password']")).getText();
	
	System.out.println(actual_error1);
	
	 
	String expect = "Looks like something went wrong\n" + 
			"Passwords do not match";
	
	Assert.assertTrue(actual_error.contains("Looks like something went wrong"));
	
	Assert.assertTrue(actual_error.contains("Passwords do not match"));

	Assert.assertEquals(actual_error, expect);
	
	Assert.assertTrue(actual_error1.contains("Passwords entered do not match."));
		
	
 }
 
 
	
	@Test(priority = 10,enabled=false)
	 
	 public void TermsNotChecked() throws InterruptedException  {
		  
		   
		  driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
			 
			//handle drop box:
			Select select = new Select(driver.findElement(By.id("gender")));
			
			Thread.sleep(1000);
			
			select.selectByVisibleText("Female");
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("first_name")).sendKeys(firstname);
			
			Thread.sleep(1000);
			
		driver.findElement(By.id("last_name")).sendKeys(lastname);
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("mem_email")).sendKeys(email);
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("phone")).sendKeys("0213578965");
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("mem_password")).sendKeys("Pakistan0!");
			
			driver.findElement(By.id("confirm_mem_password")).sendKeys("Pakistan0!");
			
			Thread.sleep(5000);
			
			
	        driver.findElement(By.id("register_button")).click();
			
			Thread.sleep(8000);
			

			JavascriptExecutor jkk = (JavascriptExecutor)driver;
		
			jkk.executeScript("window.scrollBy(0,-500)", "");
			
			Thread.sleep(3000);
			
			String actual_error = driver.findElement(By.xpath("//div[@id='top-error']")).getText();
			
			System.out.println(actual_error);
			
			String actual_error1 = driver.findElement(By.xpath("//div[@id='error_terms']")).getText();
			
			System.out.println(actual_error1);
			
					 
			String expect = "Looks like something went wrong\n" + 
					"Read Terms and Privacy Policy not checked";
			
			Assert.assertTrue(actual_error.contains("Looks like something went wrong"));
			
			Assert.assertTrue(actual_error.contains("Read Terms and Privacy Policy not checked"));

			Assert.assertEquals(actual_error, expect);
			
			Assert.assertTrue(actual_error1.contains("Please check that you have read our Terms and Privacy Policy."));
							
				
	 }

	 
	@Test(priority = 11,enabled=false)
	 
	 public void MissingField() throws InterruptedException  {
		  
		   
		  driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
			 
			//handle drop box:
			Select select = new Select(driver.findElement(By.id("gender")));
			
			Thread.sleep(1000);
			
			select.selectByVisibleText("Female");
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("first_name")).sendKeys(firstname);
			
			Thread.sleep(1000);
			
		driver.findElement(By.id("last_name")).sendKeys(lastname);
			
			Thread.sleep(1000);
			
			//driver.findElement(By.id("mem_email")).sendKeys(email);
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("phone")).sendKeys("0213578965");
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("mem_password")).sendKeys("Pakistan0!");
			
			driver.findElement(By.id("confirm_mem_password")).sendKeys("Pakistan0!");
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
			
			Thread.sleep(5000);
			

			WebElement  sign_up  = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
			
            Actions actions = new Actions(driver);
			
			actions.moveToElement(sign_up).click().perform();
			
			Thread.sleep(5000);
			
			
			WebElement element = driver.findElement(By.id("terms"));
			
			
			actions.moveToElement(element).click().perform();
			
			
	        driver.findElement(By.id("register_button")).click();
			
			Thread.sleep(3000);
				

			JavascriptExecutor ji = (JavascriptExecutor)driver;
		
			ji.executeScript("window.scrollBy(0,-500)", "");
			
			Thread.sleep(3000);
			
			String actual_error = driver.findElement(By.xpath("//div[@id='top-error']")).getText();
			
			System.out.println(actual_error);
			
            String actual_error1 = driver.findElement(By.xpath("//div[@id='error_all_fields']")).getText();
			
			System.out.println(actual_error1);
			
				 
			String expect = "Looks like something went wrong\n" + 
					"Missing required fields";
			
			Assert.assertTrue(actual_error.contains("Looks like something went wrong"));
			
			Assert.assertTrue(actual_error.contains("Missing required fields"));

			Assert.assertEquals(actual_error, expect);
			
			Assert.assertTrue(actual_error1.contains("Please fill out all required fields"));
							
				
	 }

}
