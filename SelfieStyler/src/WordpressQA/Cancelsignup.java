package WordpressQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Cancelsignup extends UnauthenticatedHomePage {
	
	 @Test (priority =4,enabled=false)
	  
	  public void cancel() throws InterruptedException 
	  {
		   
		 driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		 
		 Thread.sleep(3000);
		 
	     JavascriptExecutor jss = (JavascriptExecutor)driver;
		 
	     jss.executeScript("window.scrollBy(0,500)", "");
		 
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
			
		Thread.sleep(4000);
			
		driver.findElement(By.xpath("//button[contains(@class,'close')]")).click();
		
		Thread.sleep(3000);
	     
		 WebElement element1=driver.findElement(By.xpath("//a[contains(@class,'cancel_button')]"));
		 
		 
		 Thread.sleep(3000);
		 
		 element1.click();	
		 
		 Thread.sleep(3000);
		 
	  }
	
	
	
	
	

}
