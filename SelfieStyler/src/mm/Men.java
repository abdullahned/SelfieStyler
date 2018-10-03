package mm;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Men extends UnauthenticatedHomePage {
	
	ExtentReports report;
	
	ExtentTest test;
	 
	
	@Test(priority =1)
	  
	  public void men() throws InterruptedException  {
		
		
		    
        
		// ExtentTest logger=extent.createTest("men");
	   

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
			
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//button[contains(text(),'Ok, great!')]")).click();
			
			Thread.sleep(2000);

	   
	   
            // Flush method will write the test in report- This is mandatory step  
	    
			
		
	  }
	 

}
