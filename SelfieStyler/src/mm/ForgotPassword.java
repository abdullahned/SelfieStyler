package mm;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ForgotPassword extends UnauthenticatedHomePage {

	
	@Test (priority =2,enabled=false)
	 
	 public void ForgotPwd() throws InterruptedException 
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
		 

	
	
	
	
	
}
