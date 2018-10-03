package WordpressQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Cancelsignup extends UnauthenticatedHomePage {
	
	 @Test (priority =4,enabled=false)
	  
	  public void cancel() throws InterruptedException 
	  {
		   	 
         ExtentTest test = extent.createTest("Cancel Sign up");
		 
	     test.log(Status.INFO, "User has cancel the sign up");
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		 
		 Thread.sleep(3000);
		 
	     JavascriptExecutor jss = (JavascriptExecutor)driver;
		 
	     jss.executeScript("window.scrollBy(0,500)", "");
		 
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
			
		Thread.sleep(4000);
			
		WebElement  sign_up  = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
		
        Actions actions = new Actions(driver);
		
		actions.moveToElement(sign_up).click().perform();
		
		Thread.sleep(5000);
	     
		 WebElement element1=driver.findElement(By.xpath("//a[contains(@class,'cancel_button')]"));
		 
		 
		 Thread.sleep(3000);
		 
		 element1.click();	
		 
		 Thread.sleep(3000);
		 
	  }
	
	
	
	
	

}
