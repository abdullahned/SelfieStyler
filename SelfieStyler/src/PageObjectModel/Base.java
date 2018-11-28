package PageObjectModel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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


public class Base {
	
	public ExtentReports reports;
	ExtentHtmlReporter htmlReporter;
	public ExtentTest test;
	WebDriver driver;
	
	String url = "https://selfiestyler.com/";
	
	@BeforeTest
	
	public void startTest() {
		reports = new ExtentReports();

		htmlReporter = new ExtentHtmlReporter("./Reports/learn_automation1.html");
		
		reports.attachReporter(htmlReporter);
	
	}
	
	@BeforeMethod
	
	public void startbrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.abdullah\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver(); // launch chrome
		
		driver.manage().window().maximize(); //maximize window
		
		driver.manage().deleteAllCookies(); //delete all the cookies
		 
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(url);
		
	}
	
	
	@Test (priority=0,enabled=true)
	public void verify_title()
	{
		String title = driver.getTitle();
		
		System.out.println(title);
		
	}
	
	
	
	@AfterMethod
	public void closebrowser() {

 
		driver.quit();
	}
	
	
	@AfterTest
	public void endTest() {
		
		reports.flush();
	}
	

}
