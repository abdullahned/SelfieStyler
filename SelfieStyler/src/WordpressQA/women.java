package WordpressQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import library.HighlightLocator;

public class women extends UnauthenticatedHomePage {
	
	
	 @Test(priority = 0, enabled=false)
	 
	 public void Women() throws InterruptedException  {
		  
		 
	     ExtentTest test = extent.createTest("Women Sign up");
		 
		 test.log(Status.INFO, "User is going to Sign up for women");
		   
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
			
			mem_email.sendKeys(email1);
			
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
			
			confirm_mem_password.sendKeys("Pakistan0!");
			
			Thread.sleep(1000);
			
			 WebElement Terms= driver.findElement(By.xpath("//a[contains(text(),'Terms')]"));
		     
		     HighlightLocator.highLightElement(driver, Terms);
		     
		     Terms.click();
			
			Thread.sleep(5000);
			
			
		/*	WebElement  sign_up  = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
			
            Actions actions = new Actions(driver);
			
			actions.moveToElement(sign_up).click().perform(); */
			
	        driver.findElement(By.xpath("//button[contains(@class,'close')]")).click();				
						
			Thread.sleep(5000);
			
			
			WebElement terms_checkbox = driver.findElement(By.id("terms_checkbox"));
			
			HighlightLocator.highLightElement(driver, terms_checkbox);
			
			Actions actions = new Actions(driver);
			
			actions.moveToElement(terms_checkbox).click().perform();
			
			Thread.sleep(5000);
			
			WebElement register_button  = driver.findElement(By.id("register_button"));
			
			HighlightLocator.highLightElement(driver, register_button);
			
			actions.moveToElement(register_button).click().perform();
			
			Thread.sleep(8000);
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
		
			jse.executeScript("window.scrollBy(0,-500)", "");
			
			Thread.sleep(5000);
			
			WebElement AppleButton =   driver.findElement(By.xpath("//img[@alt='Apple Store Button']"));
			
			HighlightLocator.highLightElement(driver, AppleButton); 
			
			AppleButton.click();
			
			Thread.sleep(8000);
	 }
	 

	


}
