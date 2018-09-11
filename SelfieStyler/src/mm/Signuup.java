package mm;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signuup {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.abdullah\\Downloads\\chromedriver.exe");

      Random r = new Random();
      String lastname = "test"+r.nextInt(100);
      String email = "Michaeltest"+r.nextInt(100)+"@mailinator.com";
    //  int phonenumber = r.nextInt(1000000000);
      
      
		
		// Create a new instance of the chrome driver
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize(); //maximize window
				
		 driver.get("https://www.selfiestyler.com/");
		 
		 driver.manage().deleteAllCookies(); //delete all the cookies
		 
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		 
		//handle drop box:
		Select select = new Select(driver.findElement(By.id("gender")));
		
		Thread.sleep(1000);
		
		select.selectByVisibleText("Male");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("first_name")).sendKeys("Michael");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("last_name")).sendKeys(lastname);
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("mem_email")).sendKeys(email);
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("phone")).sendKeys("0213578965");
		
		driver.findElement(By.xpath("//button[contains(text(),'Notify Me')]")).click();
		
		//driver.findElement(By.xpath("//button[contains(text(),'Ok, great!')]")).click();
		
		Thread.sleep(5000);
			
	        // Close the driver
	     driver.quit();

	}

}
