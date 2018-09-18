package automatedscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.abdullah\\Downloads\\chromedriver.exe");
		
		// Create a new instance of the chrome driver
		 WebDriver driver = new ChromeDriver();
				
		 driver.get("https://www.selfiestyler.com/");
		 
		 driver.manage().window().maximize(); //maximize window
		 
		 driver.manage().deleteAllCookies(); //delete all the cookies
		        // Print a Log In message to the screen
		        System.out.println("Successfully opened the website www.Store.Demoqa.com");
		 
				//Wait for 5 Sec
				Thread.sleep(5000);
				
		        // Close the driver
		        driver.quit();
		

	}

}
