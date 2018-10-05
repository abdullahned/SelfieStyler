package mm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class women extends UnauthenticatedHomePage {
	

	 @Test(priority = 0)
	 
	 public void Women() throws InterruptedException  {
		  
		 
		// ExtentTest logger=extent.createTest("women");
	   
		 
		  driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
			 
			//handle drop box:
			Select select = new Select(driver.findElement(By.id("gender")));
			
			Thread.sleep(1000);
			
			select.selectByVisibleText("Female");
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("first_name")).sendKeys(firstname);
			
			Thread.sleep(1000);
			
		driver.findElement(By.id("last_name")).sendKeys(lastname);
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("mem_email")).sendKeys(email);
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("phone")).sendKeys("0213578965");
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("mem_password")).sendKeys("Pakistan0!");
			
			driver.findElement(By.id("confirm_mem_password")).sendKeys("Pakistan0!");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//button[contains(@class,'close')]")).click();				
			
			Thread.sleep(5000);
			
			
			WebElement element = driver.findElement(By.id("terms"));
			
			Actions actions = new Actions(driver);
			
			actions.moveToElement(element).click().perform();
			
			Thread.sleep(1000);
			
	        driver.findElement(By.id("register_button")).click();
			
			Thread.sleep(8000);
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
		
			jse.executeScript("window.scrollBy(0,-500)", "");
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//img[@src='img/app_store.png']")).click();
			
			Thread.sleep(8000);
			
		
		
			
	 }
	 

	
	
	
	
	

}
