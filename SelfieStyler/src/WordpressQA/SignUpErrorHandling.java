package WordpressQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import library.HighlightLocator;

public class SignUpErrorHandling extends UnauthenticatedHomePage {
	
	
 @Test (priority =7, enabled=false)
	 
	 public void InvalidEmail () throws InterruptedException                  // Invalid email , Invalid password , Terms not check
	 
	 {
		 
	     ExtentTest test = extent.createTest("Invalid Email for Sign Up");
	 
	     test.log(Status.INFO, "User has entered Invalid Email for Sign Up");
	 
	 
         WebElement Signup =  driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
		 
		 HighlightLocator.highLightElement(driver, Signup);
		 
		 Signup.click();
		 
			//handle drop box:
		  WebElement gender = driver.findElement(By.id("gender")); 
		 
		    HighlightLocator.highLightElement(driver, gender);
		 
			Select select = new Select(gender);
			
			Thread.sleep(1000);
			
			select.selectByVisibleText("Female");
			
			Thread.sleep(1000);
			
	      WebElement first_name = driver.findElement(By.id("first_name"));
			
			HighlightLocator.highLightElement(driver, first_name);
			
			first_name.sendKeys(firstname);
			
			Thread.sleep(1000);
			
            WebElement last_name =  driver.findElement(By.id("last_name"));
			
			HighlightLocator.highLightElement(driver, last_name);
			
			last_name.sendKeys(lastname);
			
			Thread.sleep(1000);
			
            WebElement mem_email = driver.findElement(By.id("mem_email"));
			
			HighlightLocator.highLightElement(driver, mem_email);
			
			mem_email.sendKeys("abc.com");
			
			Thread.sleep(1000);
			
			WebElement phone = driver.findElement(By.id("phone"));
				
			HighlightLocator.highLightElement(driver, phone);
				
			phone.sendKeys("0213578965");
			
			Thread.sleep(1000);
			
            WebElement mem_password = driver.findElement(By.id("mem_password"));
			
			HighlightLocator.highLightElement(driver, mem_password);
			
			mem_password.sendKeys("Pakistan");
			
			WebElement confirm_mem_password = driver.findElement(By.id("confirm_mem_password"));
			
			HighlightLocator.highLightElement(driver, confirm_mem_password);
			
			confirm_mem_password.sendKeys("Pakistan");
			
			Thread.sleep(1000);
			
			WebElement Terms= driver.findElement(By.xpath("//a[contains(text(),'Terms')]"));
		     
		    HighlightLocator.highLightElement(driver, Terms);
		     
		    Terms.click();
			
			Thread.sleep(5000);
			
			
			driver.findElement(By.xpath("//button[contains(@class,'close')]")).click();	
			
			Thread.sleep(5000);			
			
	       WebElement register_button  = driver.findElement(By.id("register_button"));
			
			HighlightLocator.highLightElement(driver, register_button);
			
			Actions actions = new Actions(driver);
			
			actions.moveToElement(register_button).click().perform();
			
			Thread.sleep(3000);
			
			JavascriptExecutor jq = (JavascriptExecutor)driver;
			
			jq.executeScript("window.scrollBy(0,-500)", "");
			
			Thread.sleep(3000);
			
		String top_error = driver.findElement(By.xpath("//div[@id='top-error']")).getText();
		
		System.out.println(top_error);
		
		
		String expected = "Looks like something went wrong\r\n" + 
				"Email address is not valid\r\n" + 
				"Password is not valid\r\n" + 
				"Read Terms and Privacy Policy not checked";
		
		
		String error_mem_email = driver.findElement(By.xpath("//div[@id='error_mem_email']")).getText();
		
		System.out.println(error_mem_email);
		
        String error_mem_password = driver.findElement(By.xpath("//div[@id='error_mem_password']")).getText();
		
		System.out.println(error_mem_password);
		
		String error_terms = driver.findElement(By.xpath("//div[@id='error_terms']")).getText();
		
		System.out.println(error_terms);
		
		
		Assert.assertTrue(top_error.contains("Looks like something went wrong"));
		
		Assert.assertTrue(top_error.contains("Email address is not valid"));
		
		Assert.assertTrue(top_error.contains("Password is not valid"));
		
		Assert.assertTrue(top_error.contains("Read Terms and Privacy Policy not checked"));
		
		
		Assert.assertTrue(error_mem_email.contains("Please enter a valid email address"));
		
		Assert.assertTrue(error_mem_password.contains("Please enter a valid password."));
		
		Assert.assertTrue(error_terms.contains("Please check that you have read our Terms and Privacy Policy."));
		
		Assert.assertEquals(top_error, expected);
	
	 }

	 
 @Test (priority =9, enabled=false)                                      // Missing field, Password do not match
 
 public void PasswordNotMatch () throws InterruptedException
 
 {
	 ExtentTest test = extent.createTest("Missing fields and passwords do not match");
	 
     test.log(Status.INFO, "User has entered mismatched password and missed some fields");
	 
     WebElement Signup =  driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
	 
	  HighlightLocator.highLightElement(driver, Signup);
		 
	  Signup.click();
	 
		//handle drop box:
	  WebElement gender = driver.findElement(By.id("gender")); 
		 
	    HighlightLocator.highLightElement(driver, gender);
	 
		Select select = new Select(gender);
		
		Thread.sleep(1000);
		
		select.selectByVisibleText("Female");
		
		Thread.sleep(1000);
		
    WebElement first_name = driver.findElement(By.id("first_name"));
		
		HighlightLocator.highLightElement(driver, first_name);
		
		first_name.sendKeys(firstname);
		
		Thread.sleep(1000);
		
      WebElement last_name =  driver.findElement(By.id("last_name"));
		
		HighlightLocator.highLightElement(driver, last_name);
		
		last_name.sendKeys(lastname);
		
		Thread.sleep(1000);
		
		//driver.findElement(By.id("mem_email")).sendKeys(email);
		
		Thread.sleep(1000);
		
		WebElement phone = driver.findElement(By.id("phone"));
		
		HighlightLocator.highLightElement(driver, phone);
			
		phone.sendKeys("0213578965");
		
		Thread.sleep(1000);
		
        WebElement mem_password = driver.findElement(By.id("mem_password"));
		
		HighlightLocator.highLightElement(driver, mem_password);
		
		mem_password.sendKeys("Pakistan0!");
		
		WebElement confirm_mem_password = driver.findElement(By.id("confirm_mem_password"));
		
		HighlightLocator.highLightElement(driver, confirm_mem_password);
		
		confirm_mem_password.sendKeys("Pakistan");
		
		Thread.sleep(1000);
		
		WebElement Terms= driver.findElement(By.xpath("//a[contains(text(),'Terms')]"));
	     
	    HighlightLocator.highLightElement(driver, Terms);
	     
	    Terms.click();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//button[contains(@class,'close')]")).click();	
				
		Thread.sleep(3000);
		
		
		WebElement element = driver.findElement(By.id("terms"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(element).click().perform();
		
		Thread.sleep(1000);
		
		WebElement register_button  = driver.findElement(By.id("register_button"));
		
		HighlightLocator.highLightElement(driver, register_button);
		
		actions.moveToElement(register_button).click().perform();
		
		Thread.sleep(5000);
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		
		je.executeScript("window.scrollBy(0,-500)", "");
		
		Thread.sleep(3000);
		
	String toperror = driver.findElement(By.xpath("//div[@id='top-error']")).getText();
	
	System.out.println(toperror);
	
	String error_confirm_mem_password = driver.findElement(By.xpath("//div[@id='error_confirm_mem_password']")).getText();
	
	System.out.println(error_confirm_mem_password);
	
	String error_all_fields = driver.findElement(By.xpath("//div[@id='error_all_fields']")).getText();
		
	System.out.println(error_all_fields);
	
	 
	String expect = "Looks like something went wrong\r\n" + 
			"Missing required fields\r\n" + 
			"Passwords do not match";
	
	
	
	
	Assert.assertTrue(toperror.contains("Looks like something went wrong"));
	
	Assert.assertTrue(toperror.contains("Passwords do not match"));
	
	Assert.assertTrue(toperror.contains("Missing required fields"));
	
	Assert.assertTrue(error_confirm_mem_password.contains("Passwords entered do not match."));
	
	Assert.assertTrue(error_all_fields.contains("Please fill out all required fields"));
	
    Assert.assertEquals(toperror, expect);
	
 }
 
	 

}
