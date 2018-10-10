package WordpressQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import library.HighlightLocator;

public class Men extends UnauthenticatedHomePage {
	
	
	
	@Test(priority =1,enabled=false)
	  
	  public void men() throws InterruptedException  {
		  
		 ExtentTest test = extent.createTest("Men Sign up");
		 
		 test.log(Status.INFO, "User is going to Sign up for men");
		   
		 WebElement Signup =  driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
			 
		 HighlightLocator.highLightElement(driver, Signup);
		 
		 Signup.click();
		 
		 //handle drop box:
			Select select = new Select(driver.findElement(By.id("gender")));
			
			Thread.sleep(1000);
			
			select.selectByVisibleText("Male");
			
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
			
			WebElement notify = driver.findElement(By.xpath("//button[contains(text(),'Notify Me')]"));
			
			HighlightLocator.highLightElement(driver, notify);
			
			notify.click();
			
			Thread.sleep(3000);
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			
			jse.executeScript("window.scrollBy(0,-500)", "");
			
			Thread.sleep(2000);
			
			WebElement great = driver.findElement(By.xpath("//button[contains(text(),'Ok, great!')]"));
			
			HighlightLocator.highLightElement(driver, great);
			
			great.click();
			
			Thread.sleep(2000);
		  
	  }
	 

}
