package WordpressQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

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
	     
	     driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
	     
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("first_name")).sendKeys(firstname);
			
		 Thread.sleep(1000);
			
		 driver.findElement(By.id("last_name")).sendKeys(lastname);
			
		 Thread.sleep(1000);
			
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys("0213578965");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//textarea[@id='comments']")).sendKeys("Please Let me know !!");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//button[@id='contact_submit']")).click();
		 
		 Thread.sleep(8000);
			 
		 }
	
	

	
	
}
