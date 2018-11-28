package POM.TestCase;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Helper.BrowserFactory;
import library.screenshot;

public class Test_Base {
	
	public WebDriver driver;
	
	Random r = new Random();
		
	public String firstname = "QA"+r.nextInt(100);
	public String lastname = "test"+r.nextInt(1000);
	public String email = "Qtest"+r.nextInt(1000)+"@mailinator.com";
	public String email1 = "Qtest"+r.nextInt(1000)+"@mailinator.com";
	
	public ExtentReports reports;
	ExtentHtmlReporter htmlReporter;
	public ExtentTest test;
	
	

	
	
	@BeforeTest
	
	public void startTest() {
		reports = new ExtentReports();

		htmlReporter = new ExtentHtmlReporter("./Reports/learn_automation1.html");
		
		reports.attachReporter(htmlReporter);
	
	}
		   

  @BeforeMethod
  
    public void setup() throws Exception 
    {
		 	 
	// This will launch browser and specific url 
	 driver=BrowserFactory.startBrowser("chrome", "https://www.selfiestyler.com/");  // live Environment
	  
    }


  


  @AfterMethod
  public void teardown(ITestResult result) 
  {
	  
	  if(result.getStatus() == ITestResult.FAILURE)  
	  {
		  test.fail(result.getTestName());
		  
		  test.fail(result.getThrowable());
		  
		  
		 // screenshot.capturescreenshot(driver, result.getName());
	  }
	  
	  else if(result.getStatus() == ITestResult.SUCCESS)
	  {	
		  test.pass(result.getTestName());
		  
	  }
	  
	  else if(result.getStatus() == ITestResult.SKIP)
	  {
		  
		  test.skip("Test Case : " + result.getName() + " has been skipped");
	  }
	  
	  reports.flush();
	  
	  driver.quit();
	  
  }

  
  
  
  @AfterTest
	public void endTest() {
		
		reports.flush();
	}


}
