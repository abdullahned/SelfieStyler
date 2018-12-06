package POM.TestCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import PageObjectModel.Login;
import PageObjectModel.Shop_Checkout;

public class Product_verification {
	
    Login Login_obj;
	
	Shop_Checkout Shop_Checkout_obj;
	
	
	@Test
	public void validate_product() throws Exception
	{
		
	    // This will launch browser and specific url 
		WebDriver driver=BrowserFactory.startBrowser("chrome", "https://selfiestyler.com");  // live Environment
			   
		Login_obj = new Login(driver); // create the object of login class
		
		Shop_Checkout_obj = new Shop_Checkout(driver); // create the object of shop_checkout class
			
	    Login_obj.login_selfie_styler("qa-women@mailinator.com", "Germany0!");
		   
		Thread.sleep(5000);
		   
	    driver.findElement(By.linkText("Brands")).click();
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.linkText("Acrobat")).click();
	    
	    
	    
	/*    List<WebElement> list = driver.findElements(By.xpath("//div[@id='shopify-section-collection-template-fit']"));
	    
        System.out.println("total number of suggestions in search box:::===>" + list.size());
		
        List<String> strings = new ArrayList<String>();
	    
      		for(int i=0; i<list.size(); i++){
      			strings.add(list.get(i).getText());
      	    	 System.out.println("value  --  "+strings.get(i)+   "    "+strings.get(i).toString());
      			
      		} */
      		
      		
   //  List<WebElement>  list1 = driver.findElements(By.xpath("//div[@class='product-collection products-grid row']"));
      		
      	//	List<String> strings1 = new ArrayList<String>();
    	    
      		//for(int i=0; i<list1.size(); i++){
      			
      		//System.out.println(list1.get(i).getText());
      			
      		//} 
      		
	     
	   
	    

		   
	 /*     File src=new File("C://Users//m.abdullah//Desktop//abc.xlsx");
			
			FileInputStream fis=new FileInputStream(src);
			
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			 
		    XSSFSheet sheet1 =wb.getSheetAt(0);
			
		    int rowcount= sheet1.getLastRowNum();
		    
		    System.out.println("Total rows is "+rowcount);
		    
		     for(int i=1;i<=rowcount;i++)
		     {
		    	 
		    	String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
		    	 
		    	//System.out.println("Data from Row"+i+" is "+data0);
		    	
		    	 if(!strings.toString().toLowerCase().contains(data0.toLowerCase())) {
		    		  System.out.println("\n"+ data0 +"  not found \n");
		    	 
		    	    sheet1.getRow(i).createCell(1).setCellValue("Not Found");
		    	 }
		    	 
		    	 
		    	
		    	
		    	
		     }
		     
		     
	    	    FileOutputStream fout=new FileOutputStream(src);
	    	    
	    	    wb.write(fout);
		    
		    wb.close(); */
	      
	    //  driver.quit();
	    
	    List<WebElement> Elements = driver.findElements(By.xpath("//*[@class='product-collection products-grid row']"));
	    
	    for(int i=0; i < Elements.size(); i++)
	    {
	    	System.out.println("Abdullah"+Elements.get(i).getText());
	    }
	    
	    
	    
	    //System.out.println("Abdullah"+Elements);
	    
	    
	    
	    for(int i=0; i < Elements.size(); i++)
        {
     //  	WebElement linkElement = driver.findElement(By.xpath("//*[@class='btn-fav' AND @data-fav='add']/div/div[1]/div[1]/div/a"));
        	System.out.println(Elements.get(i).getText());   
        	System.out.println(Elements.get(i).getAttribute("class"));   
        	System.out.println(Elements.get(i).getAttribute("id"));   
       
       }

	}
}