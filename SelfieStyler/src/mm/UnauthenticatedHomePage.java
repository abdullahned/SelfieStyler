package mm;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class UnauthenticatedHomePage {
	
	WebDriver driver;

	 Random r = new Random();
	 
	 String firstname = "QA"+r.nextInt(100);
	   String lastname = "test"+r.nextInt(1000);
	   String email = "QA"+r.nextInt(1000)+"@mailinator.com";
	
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
	 
	 //driver.get("http://qa-na.selfiestyler.com/");
	  
  }

  
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
	 
	// flash(element1, driver); //highlight the element
	 
	 Thread.sleep(3000);
	 
	 element1.click();	
	 
	 Thread.sleep(3000);
	 
  }
 
  
  
 @Test(priority =1,enabled=false)
  
  public void Men() throws InterruptedException  {
	  
	 
	// Random r = new Random();
	  // String lastname = "test"+r.nextInt(1000);
	  // String email = "QAtest3"+r.nextInt(100)+"@mailinator.com";
	   
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
		
		driver.findElement(By.id("mem_email")).sendKeys(email);
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("phone")).sendKeys("0213578965");
		
		driver.findElement(By.xpath("//button[contains(text(),'Notify Me')]")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Ok, great!')]")).click();
		
		Thread.sleep(2000);
	  
  }
 
  
 @Test(priority = 0,enabled=false)
 
 public void women() throws InterruptedException  {
	  
	   
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
 
 
 
 
 @Test (priority =3,enabled=false)
 
 public void Signin() throws InterruptedException 
 {
	 driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
	 
	 Thread.sleep(5000);
	 
	 driver.findElement(By.id("email")).sendKeys("rikotest@mailinator.com");
	 
	 Thread.sleep(1000);
	 
	 driver.findElement(By.id("password")).sendKeys("Sindhi0!");
	 
	 Thread.sleep(1000);
	 
     driver.findElement(By.id("customer_login")).click();
	 
	 Thread.sleep(10000);
	 
 }
 
@Test (priority =2,enabled=false)
 
 public void ForgotPassword() throws InterruptedException 
 {
	 driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
	 
	 Thread.sleep(4000); 
	 
	 driver.findElement(By.xpath("//a[contains(text(),'Forgot?')]")).click();
	 
	 Thread.sleep(4000);
	 
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rikotest@mailinator.com");
	 
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("//button[@id='customer_login']")).click();	
	 
	 Thread.sleep(15000);
	 
	 driver.get("https://www.mailinator.com/ ");
	 
	 Thread.sleep(3000);
	 
	 driver.findElement(By.xpath("//input[@id='inboxfield']")).sendKeys("rikotest@mailinator.com");
	 
	 Thread.sleep(4000);
	 
	 driver.findElement(By.xpath("//button[contains(@class,'btn btn-dark')]")).click();
	 
	 Thread.sleep(4000);
	 
	 driver.findElement(By.xpath("//*[contains(text(),'SelfieStyler: Password Reset')]")).click();
	 
	 Thread.sleep(6000);
	 
	 driver.switchTo().frame("msg_body");
	 
	 Thread.sleep(4000);
	 
	 driver.findElement(By.xpath("//a[@class='button__text']")).click();
	 
	 Thread.sleep(8000);
	 
	 String parent_window= driver.getWindowHandle();
	 
	Set<String> s1=driver.getWindowHandles();
	
	Iterator<String> i1=s1.iterator();
	
	while (i1.hasNext())
	{
		String child_window = i1.next();
		
		if(!parent_window.equalsIgnoreCase(child_window))
		{
			driver.switchTo().window(child_window);
			
			driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("Sindhi0!");
			
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//input[@id='password2']")).sendKeys("Sindhi0!");
			 
		     Thread.sleep(1000);
			 
			 driver.findElement(By.xpath("//button[@id='reset_password']")).click();
			 
		      Thread.sleep(8000);
			
		      driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		      
		      Thread.sleep(5000);
			
		}
	}
	
 }
	 
	@Test (priority =5,enabled=false)
	
	public void Contactus () throws InterruptedException
	
	{
		 Thread.sleep(3000);
		 
		JavascriptExecutor jex = (JavascriptExecutor)driver;
		 
	     jex.executeScript("window.scrollBy(0,500)", "");
	     
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
	     
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("first_name")).sendKeys(firstname);
			
		 Thread.sleep(1000);
			
		 driver.findElement(By.id("last_name")).sendKeys(lastname);
			
		 Thread.sleep(1000);
			
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys("0213578965");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//textarea[@id='comments']")).sendKeys("Please Let me know !!");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//button[@id='contact_submit']")).click();
		 
		 Thread.sleep(2000);
			 
		 }
		 
	 @Test (priority =6) 
	 
	 public void Shop() throws InterruptedException 
	 {
		 driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.id("email")).sendKeys("rikotest@mailinator.com");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("password")).sendKeys("Sindhi0!");
		 
		 Thread.sleep(1000);
		 
	     driver.findElement(By.id("customer_login")).click();
		 
		 Thread.sleep(10000);
		 
		// driver.findElement(By.xpath("//a[text()='Shop']")).click();
		 
		// driver.findElement(By.xpath("//a[@href='https://shop.selfiestyler.com/collections/shop-all']//*[text()='Shop']")).click();
		 
		 driver.findElement(By.linkText("Shop")).click();
		 Thread.sleep(10000);
		 
		
		 driver.findElement(By.xpath("//a[@class='product-grid-image']")).click();
			
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='product-add-to-cart']")).click(); 
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//button[@class='btn-secondary btn-go-to-cart']")).click(); 
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//input[@name='checkout']")).click(); 
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//input[@id='checkout_shipping_address_address1']")).sendKeys("Test"); 
		 
		 Thread.sleep(1000);
		 
		 
		 driver.findElement(By.xpath("//input[@id='checkout_shipping_address_city']")).sendKeys("Karachi");
		 
		 
		 
	}
	
      

 
 
  
  @AfterMethod
  public void teardown() 
  {
	  
	 //driver.quit();
  }

  
 
  
}

