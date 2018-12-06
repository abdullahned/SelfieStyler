package Deployment;

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
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
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
	
	public static ExtentReports reports;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest test;
	
	

	
	
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
		  test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
          test.fail(result.getThrowable());
		    
		 // screenshot.capturescreenshot(driver, result.getName());
	  }
	  
	  else if(result.getStatus() == ITestResult.SUCCESS)
	  {	
		  test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
		  
	  }
	  
	  else 
	  {
		  
		  test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
          test.skip(result.getThrowable());
	  }
	  
	  reports.flush();
	  
	  driver.quit();
	  
  }

  
  
  
  @AfterTest
	public void endTest() {
		
		reports.flush();
	}


}
