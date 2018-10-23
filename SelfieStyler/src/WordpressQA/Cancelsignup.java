package WordpressQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import library.HighlightLocator;

public class Cancelsignup extends UnauthenticatedHomePage {
	
	 @Test (priority =4,enabled=false)
	  
	  public void cancel() throws InterruptedException 
	  {
		   	 
         ExtentTest test = extent.createTest("Cancel Sign up");
		 
	     test.log(Status.INFO, "User has cancel the sign up");
		 
	     WebElement signup = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
	     
	     HighlightLocator.highLightElement(driver, signup);
	     
	     signup.click();
		 
		 Thread.sleep(3000);
		 
	     JavascriptExecutor jss = (JavascriptExecutor)driver;
		 
	     jss.executeScript("window.scrollBy(0,500)", "");
		 
	     Thread.sleep(3000);
	     
	     WebElement Terms= driver.findElement(By.xpath("//a[contains(text(),'Terms')]"));
	     
	     HighlightLocator.highLightElement(driver, Terms);
	     
	     Terms.click();
	     
	     Thread.sleep(4000);
			
	     WebElement close =  driver.findElement(By.xpath("//button[contains(@class,'close')]"));
	     
	     HighlightLocator.highLightElement(driver, close);
	     
		close.click();
	     
		Thread.sleep(5000);
	     
		 WebElement cancel_button=driver.findElement(By.xpath("//a[contains(@class,'cancel_button')]"));
		 
		 HighlightLocator.highLightElement(driver, cancel_button);
	      
		 cancel_button.click();	
		 
		 Thread.sleep(3000);
		 
	  }
	
	
	
	
	

}
