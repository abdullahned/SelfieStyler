package WordpressQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import library.HighlightLocator;

public class ContactUs extends UnauthenticatedHomePage {

@Test (priority =5,enabled=false)
	
	public void contactus () throws InterruptedException
	
	{
	    ExtentTest test = extent.createTest("Contact Us");
	 
        test.log(Status.INFO, "Contact Us");
	
	    Thread.sleep(3000);
		 
		JavascriptExecutor jex = (JavascriptExecutor)driver;
		 
	     jex.executeScript("window.scrollBy(0,500)", "");
	     
	     Thread.sleep(2000);
	     
	     WebElement contact =  driver.findElement(By.xpath("//a[contains(text(),'Contact')]"));
	     
	     HighlightLocator.highLightElement(driver, contact);
	     
	     contact.click();
	     
	     Thread.sleep(2000);
	     
	     WebElement first_name = driver.findElement(By.id("first_name"));
			
	     HighlightLocator.highLightElement(driver, first_name);
	     
	     first_name.sendKeys(firstname);
	     
	     Thread.sleep(1000);
			
	     WebElement last_name =driver.findElement(By.id("last_name"));
			
	     HighlightLocator.highLightElement(driver, last_name);
	     
	     last_name.sendKeys(lastname);
	     
	     Thread.sleep(1000);
			
	     WebElement email1 = driver.findElement(By.xpath("//input[@id='email']")); 
		 
	     HighlightLocator.highLightElement(driver, email1);
	     
	     email1.sendKeys(email);
	     
	     Thread.sleep(1000);
		 
	     WebElement phone_number= driver.findElement(By.xpath("//input[@id='phone_number']"));
		 
	     HighlightLocator.highLightElement(driver, phone_number);
		 
	     phone_number.sendKeys("0213578965");
	          
	     Thread.sleep(2000);
		 
         JavascriptExecutor num = (JavascriptExecutor)driver;
		 
	     num.executeScript("window.scrollBy(0,200)", "");
	     
	     
	     WebElement comments =  driver.findElement(By.xpath("//textarea[@id='comments']"));
		 
	     HighlightLocator.highLightElement(driver, comments);
	     
	     comments.sendKeys("Please Let me know !!");
	     
	     Thread.sleep(3000);
		 
	     WebElement contact_submit  = driver.findElement(By.xpath("//button[@id='contact_submit']"));
		 
	     HighlightLocator.highLightElement(driver, contact_submit);
	     
	     contact_submit.click();
	     
	     Thread.sleep(2000);
	      
         JavascriptExecutor nu = (JavascriptExecutor)driver;
		 
	     nu.executeScript("window.scrollBy(0,-500)", "");
	     
	     Thread.sleep(7000);
			 
		 }
	
	

	
	
}
