package automatedscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class demo {

	public static void main(String[] args) throws InterruptedException, Exception {
		
		
		   /* String data0=sheet1.getRow(1).getCell(0).getStringCellValue();

	    System.out.println("Data from Excel is "+data0);
	    
	    String data1=sheet1.getRow(2).getCell(0).getStringCellValue();

	    System.out.println("Data from Excel is "+data1); */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.abdullah\\Downloads\\chromedriver.exe");
		
		// Create a new instance of the chrome driver
		 WebDriver driver = new ChromeDriver();
					 
		 driver.manage().window().maximize(); //maximize window
		 
		 driver.manage().deleteAllCookies(); //delete all the cookies
		 
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		 driver.get("http://qa-na.selfiestyler.com/");
		 
		 driver.get("http://selfiestyler.com/");
		 
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.id("email")).sendKeys("rikotest@mailinator.com");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("password")).sendKeys("Sindhi0!");
		 
		 Thread.sleep(1000);
	 
	     driver.findElement(By.id("customer_login")).click();
		 
		 Thread.sleep(5000);
		 
		// driver.findElement(By.xpath("//input[@id='password']")).sendKeys("tausto"); // comment code
		 
		// Thread.sleep(1000);
		 
		// driver.findElement(By.xpath("//input[@name='commit']")).click();
		 
		 driver.findElement(By.linkText("Brands")).click();
		 
		 Thread.sleep(10000);
		 
		 List<WebElement> liElements = driver.findElements(By.xpath("//*[@class='container brands-list']"));
	    
               
	      
	      for(int i=1; i <= liElements.size(); i++)
	        {
	            WebElement linkElement = driver.findElement(By.xpath("//*[@class='container brands-list']"));
	            
	           System.out.println(linkElement.getText()); 
	          

	        } 
	      
	      
	  	
	        File src=new File("C://Users//m.abdullah//Desktop//brands.xlsx");
			
			FileInputStream fis=new FileInputStream(src);
			
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			 
		    XSSFSheet sheet1 =wb.getSheetAt(0);
			
		    int rowcount= sheet1.getLastRowNum();
		    
		    System.out.println("Total rows is "+rowcount);
		    
		     for(int i=1;i<=rowcount;i++)
		     {
		    	 
		    	String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
		    	 
		    	System.out.println("Data from Row"+i+" is "+data0);
		    	
		     }
	   
	      
	    String data8=sheet1.getRow(1).getCell(0).getStringCellValue();
	    
	    System.out.println(data8);
	    
	    WebElement linkElement = driver.findElement(By.xpath("//*[@class='container brands-list']"));
	    
		Assert.assertTrue(data8.contains(linkElement.getText()));  
	
	      wb.close();

}
}
