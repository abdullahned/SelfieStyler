package mm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrandListonLeftbar {

	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.abdullah\\Downloads\\chromedriver.exe");
		
		
		 WebDriver driver = new ChromeDriver();
					 
		 driver.manage().window().maximize(); 
		 
		 driver.manage().deleteAllCookies(); 
		 
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		 //driver.get("http://qa-na.selfiestyler.com/");
		 
		 driver.get("http://selfiestyler.com/");
		 
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.id("email")).sendKeys("qa-women@mailinator.com");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("password")).sendKeys("Germany0!");
		 
		 Thread.sleep(1000);
	 
	     driver.findElement(By.id("customer_login")).click();
		 
		 Thread.sleep(5000);
		 
	    /* driver.findElement(By.xpath("//input[@id='password']")).sendKeys("tausto"); // comment code
		 
		 Thread.sleep(1000);
		 
		driver.findElement(By.xpath("//input[@name='commit']")).click(); */
		
		Thread.sleep(3000);
		
		 
		 driver.findElement(By.linkText("Women")).click();
		 
		 Thread.sleep(5000);
		 
         JavascriptExecutor jex = (JavascriptExecutor)driver;
		 
	     jex.executeScript("window.scrollBy(0,1300)", "");
	     
		
	     WebElement linkElement = driver.findElement(By.xpath("//*[@class='widget sidebar-custom sidebar-tag brands_filter']"));
	            
	    // System.out.println(linkElement.getText());
	     
	     String wholeText = linkElement.getText();
	     
	     System.out.println(wholeText);
	     
	      /* 
		   
		   if(wholeText.contains(row1))
			   System.out.println("element found ");
		   else
			   System.out.println(row1 +"not found ");
			   		  
	      */
	      
	      
	      
	      File src=new File("C://Users//m.abdullah//Desktop//brandss.xlsx");
			
			FileInputStream fis=new FileInputStream(src);
			
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			 
		    XSSFSheet sheet1 =wb.getSheetAt(0);
			
		    int rowcount= sheet1.getLastRowNum();
		    
		    System.out.println("Total rows is "+rowcount);
		    
		     for(int i=1;i<=rowcount;i++)
		     {
		    	 
		    	String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
		    	 
		    	//System.out.println("Data from Row"+i+" is "+data0);
		    	
		    	 if(!wholeText.contains(data0)) {
		    		  System.out.println("\n"+ data0 +"  not found \n");
		    	 
		    	    sheet1.getRow(i).createCell(1).setCellValue("Not Found");
		    	 }
		    	 
		     }
		     
		     
	    	    FileOutputStream fout=new FileOutputStream(src);
	    	    
	    	    wb.write(fout);
		    
		    wb.close(); 
	     
	     Thread.sleep(5000);
	       
	      driver.quit();
	      
	      

	}

}
