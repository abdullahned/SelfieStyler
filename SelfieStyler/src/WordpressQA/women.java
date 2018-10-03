package WordpressQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class women extends UnauthenticatedHomePage {
	
	
	 @Test(priority = 0,enabled=false)
	 
	 public void Women() throws InterruptedException  {
		  
		 
	     ExtentTest test = extent.createTest("Women Sign up");
		 
		 test.log(Status.INFO, "User is going to Sign up for women");
		   
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
			
			
		/*	WebElement  sign_up  = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
			
            Actions actions = new Actions(driver);
			
			actions.moveToElement(sign_up).click().perform(); */
			
	        driver.findElement(By.xpath("//button[contains(@class,'close')]")).click();				
						
			Thread.sleep(5000);
			
			
			WebElement terms_checkbox = driver.findElement(By.id("terms_checkbox"));
			
			Actions actions = new Actions(driver);
			
			actions.moveToElement(terms_checkbox).click().perform();
			
			Thread.sleep(5000);
			
			WebElement register_button  = driver.findElement(By.id("register_button"));
			
			actions.moveToElement(register_button).click().perform();
			
			Thread.sleep(8000);
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
		
			jse.executeScript("window.scrollBy(0,-500)", "");
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//img[@src='https://selfiestyler.com/wp-content/img/app_store.png']")).click();
			
			Thread.sleep(8000);
	 }
	 

	
	
	
	
	

}
