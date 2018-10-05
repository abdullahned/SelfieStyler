package WordpressQA;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import library.utility;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;



public class UnauthenticatedHomePage {
	
	 WebDriver driver;
	 ExtentHtmlReporter htmlReports;
	 ExtentReports extent;
	ExtentTest test;

	 
	 Random r = new Random();
	 
	 String firstname = "QA"+r.nextInt(100);
	   String lastname = "test"+r.nextInt(1000);
	   String email = "Qtest"+r.nextInt(1000)+"@mailinator.com";
	   String email1 = "Qtest"+r.nextInt(1000)+"@mailinator.com";
	   String password = "Pakistan"+r.nextInt(100);
	   
	
	@BeforeTest
	public void set()
	{
		htmlReports = new ExtentHtmlReporter("./Reports/learn_automation1.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReports);
		
		
	}  
	   
	   
	        
	   
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
	 
 // driver.get("http://qa-na.selfiestyler.com/");
	 
	//driver.get("https://wpqa.selfiestyler.com/");
	 
	  
  }

  
 
 @Test (priority =3,enabled=false)
 
 public void Signin() throws InterruptedException 
 {
	 
	 ExtentTest test = extent.createTest("Sign in");
	 
	test.log(Status.INFO, "User is going to Sign in");
	 
	 driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
	 
	 Thread.sleep(5000);
	 
	 driver.findElement(By.id("email")).sendKeys("rikotest@mailinator.com");
	 
	 Thread.sleep(1000);
	 
	 driver.findElement(By.id("password")).sendKeys("Germany0!");
	 
	 Thread.sleep(1000);
 
     driver.findElement(By.id("customer_login")).click();
	 
	 Thread.sleep(10000);
	 
	// driver.findElement(By.xpath("//input[@id='password']")).sendKeys("tausto"); // comment code
	 
	//Thread.sleep(1000);
	 
	// driver.findElement(By.xpath("//input[@name='commit']")).click();
	 
	
 }
 

		 
	 @Test (priority =6,enabled=false) 
	 
	 public void Shop() throws InterruptedException 
	 {
		 
		// driver.findElement(By.xpath("//a[@href='https://shop.selfiestyler.com/collections/shop-all']//*[text()='Shop']")).click();
		 
          ExtentTest test = extent.createTest("Shop check out process");
		 
	     test.log(Status.INFO, "Shop check out process");
		 
		 Signin();
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.linkText("Shop")).click();
		 Thread.sleep(10000);
		 
		
		 WebElement product_image= driver.findElement(By.xpath("//a[@class='product-grid-image']"));
		 
		 Actions actionss = new Actions(driver);
			
		 actionss.moveToElement(product_image).click().perform();
			
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='product-add-to-cart']")).click(); 
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//button[@class='btn-secondary btn-go-to-cart']")).click(); 
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//input[@name='checkout']")).click(); 
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//input[@id='checkout_shipping_address_address1']")).sendKeys("Test"); 
		 
		 Thread.sleep(1000);
		 
		 
		 driver.findElement(By.xpath("//input[@id='checkout_shipping_address_city']")).sendKeys("Karachi");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@id='checkout_shipping_address_zip']")).sendKeys("12345");
		 
		 Thread.sleep(5000);
		 
		 WebElement element4= driver.findElement(By.xpath("//*[contains(text(),'Continue to shipping method')]"));
		 
		 Actions actions = new Actions(driver);

		 actions.moveToElement(element4).click().perform();
		 
		 Thread.sleep(5000);
		 
		 WebElement element5= driver.findElement(By.xpath("//*[contains(text(),'Continue to payment method')]"));

		 actions.moveToElement(element5).click().perform();
		 
		 Thread.sleep(5000);
		 
		 
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
	  

		 @AfterTest
		 public void tear()
		 {
			 extent.flush();
		 }  
		 

   
  
}

