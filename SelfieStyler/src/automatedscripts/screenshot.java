package automatedscripts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library.utility;

public class screenshot {
	
	 WebDriver driver;
	
	@BeforeMethod
	  
	  public void setup() 
	  {
		  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.abdullah\\Downloads\\chromedriver.exe");
	  
	     driver = new ChromeDriver();
		 
		 driver.manage().window().maximize(); //maximize window
				
		 driver.manage().deleteAllCookies(); //delete all the cookies
		 
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
	    driver.get("https://www.selfiestyler.com/");
		 
		 
		  
	  }

	@Test 
	 
	 public void Signin() throws Exception 
	 {
		 driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.id("email")).sendKeys("rikotest@mailinator.com");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("assword")).sendKeys("Sindhi0!");
		 
		 Thread.sleep(1000);
		 
	     driver.findElement(By.id("customer_login")).click();
		 
		 Thread.sleep(10000);
		 
		 
		// TakesScreenshot ts= (TakesScreenshot)driver;
		// File source =ts.getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(source, new File("C:\\Users\\m.abdullah\\git\\SelfieStyler\\SelfieStyler\\Screenshots\\selfie.png"));


		
		 
	 }

	
	  
	  @AfterMethod
	  public void teardown(ITestResult result) 
	  {
		  
		  if(ITestResult.FAILURE ==result.getStatus())
			  
		  {
			  utility.capturescreenshot(driver, result.getName());
		  }
		  
		  
		 driver.quit();
		  
	  }


}
