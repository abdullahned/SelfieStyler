package WordpressQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Men extends UnauthenticatedHomePage {
	
	
	
	@Test(priority =1,enabled=false)
	  
	  public void men() throws InterruptedException  {
		  
		 
		   
		  driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
			 
			//handle drop box:
			Select select = new Select(driver.findElement(By.id("gender")));
			
			Thread.sleep(1000);
			
			select.selectByVisibleText("Male");
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("first_name")).sendKeys(firstname);
			
			Thread.sleep(1000);
			
		driver.findElement(By.id("last_name")).sendKeys(lastname);
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("mem_email")).sendKeys(email1);
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("phone")).sendKeys("0213578965");
			
			driver.findElement(By.xpath("//button[contains(text(),'Notify Me')]")).click();
			
			Thread.sleep(3000);
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			
			jse.executeScript("window.scrollBy(0,-500)", "");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[contains(text(),'Ok, great!')]")).click();
			
			Thread.sleep(2000);
		  
	  }
	 

}
