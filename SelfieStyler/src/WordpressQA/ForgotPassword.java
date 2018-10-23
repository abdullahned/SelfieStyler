package WordpressQA;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import library.HighlightLocator;

public class ForgotPassword extends UnauthenticatedHomePage {

	
	@Test (priority =2,enabled=false)
	 
	 public void ForgotPwd() throws InterruptedException 
	 {
		 
		ExtentTest test = extent.createTest("Forgot Password");
		 
	    test.log(Status.INFO, "User forgot the sign in credentials");
		
		WebElement clickLogin = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
		 
		HighlightLocator.highLightElement(driver, clickLogin);
		
		clickLogin.click();
		 
		 Thread.sleep(4000); 
		 
		 WebElement Forgot =   driver.findElement(By.xpath("//a[contains(text(),'Forgot?')]"));
		 
		 HighlightLocator.highLightElement(driver, Forgot);
		 
		 Forgot.click();
		 
		 Thread.sleep(4000);
		  

		 WebElement enterEmail = driver.findElement(By.xpath("//input[@id='email']")); 
		 
		 HighlightLocator.highLightElement(driver,enterEmail );
		 
		 enterEmail.sendKeys("rikodemo@mailinator.com");
		 
		 Thread.sleep(1000);
		 
		 WebElement customer_login_forgot = driver.findElement(By.xpath("//button[@id='customer_login_forgot']"));	
		 
		 HighlightLocator.highLightElement(driver,customer_login_forgot );
		 
		 customer_login_forgot.click();
		 
		// driver.findElement(By.xpath("//button[@id='customer_login']")).click();
		 
		 
		 Thread.sleep(15000);
		 
		 driver.get("https://www.mailinator.com/ ");
		 
		 Thread.sleep(3000);
		 
		 WebElement inboxfield  = driver.findElement(By.xpath("//input[@id='inboxfield']"));
		 
		 HighlightLocator.highLightElement(driver,inboxfield );
		 
		 inboxfield.sendKeys("rikodemo@mailinator.com");
		 
		 Thread.sleep(4000);
		 
		 WebElement btn   =  driver.findElement(By.xpath("//button[contains(@class,'btn btn-dark')]"));
		 
		 HighlightLocator.highLightElement(driver,btn);
		 
		 btn.click();
		 
		 Thread.sleep(4000);
		 
		 WebElement link = driver.findElement(By.xpath("//*[contains(text(),'SelfieStyler: Password Reset')]"));
		 
		 HighlightLocator.highLightElement(driver,link);
		 
		 link.click();
		 
		 Thread.sleep(6000);
		 
		 driver.switchTo().frame("msg_body");
		 
		 Thread.sleep(4000);
		 
		 WebElement button__text  =  driver.findElement(By.xpath("//a[@class='button__text']"));
		 
		 HighlightLocator.highLightElement(driver,button__text );
		 
		 button__text.click();
		 
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
				
				WebElement password1 = driver.findElement(By.xpath("//input[@id='password1']"));
				
				HighlightLocator.highLightElement(driver,password1 );
				
				password1.sendKeys("Germany0!");
				
				Thread.sleep(2000);
				 
                WebElement password2 = driver.findElement(By.xpath("//input[@id='password2']"));
				
				HighlightLocator.highLightElement(driver,password2);
				
				password2.sendKeys("Germany0!");
				 
				 System.out.println(password);
				 
			     Thread.sleep(1000);
				 
			     WebElement reset_password = driver.findElement(By.xpath("//button[@id='reset_password']"));
				 
			     HighlightLocator.highLightElement(driver,reset_password);
			     
			     reset_password.click();
			     
			      Thread.sleep(8000);
				
			      WebElement log = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
			      
			      HighlightLocator.highLightElement(driver,log);
			      
			      log.click();
			      
			      Thread.sleep(5000);
				
			}
		}
		
	 }
		 

	
	
	
	
	
}
