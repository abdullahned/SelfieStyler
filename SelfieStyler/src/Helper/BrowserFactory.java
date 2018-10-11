package Helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String url)
	
	{
		if (browserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.abdullah\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver(); // launch chrome
		} 
		
		else if(browserName.equals("FF"))
		{
			
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equals("IE"))
		{
			
			driver = new InternetExplorerDriver();
		}
		
		
		 driver.manage().window().maximize(); //maximize window
			
		 driver.manage().deleteAllCookies(); //delete all the cookies
		 
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 driver.get(url);
		 
		 
		return driver;
		
	}
	
	
}
