package WordpressQA;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import library.HighlightLocator;


public class Favourite extends UnauthenticatedHomePage {
	
	//JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	@Test
	public void AddFavourite () throws InterruptedException
	
	{
     
	    Signin();
		
		Thread.sleep(5000);
		 
		WebElement shop =  driver.findElement(By.linkText("Shop"));
		
		HighlightLocator.highLightElement(driver, shop);
		
		shop.click();
			
		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath("//*[@data-product-id='529743904822']")).click(); // need to change if product change
		
		 Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@data-product-id='529743839286']")).click(); // need to change if product change
		
		Thread.sleep(5000);
		
		WebElement favorite = driver.findElement(By.xpath("//a[contains(text(),'Favorites')]"));
		
		HighlightLocator.highLightElement(driver, favorite);
		
		favorite.click();
		
		Thread.sleep(3000);
		
		WebElement remove_prod = driver.findElement(By.xpath("//a[@class='fav-remove-list btn-remove-wishlist']")); // // need to change if product change
		
		HighlightLocator.highLightElement(driver, remove_prod);
		
		remove_prod.click();
		
		Thread.sleep(3000);
		
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		if(text.equals("Are you sure you want to remove?")){
			System.out.println("correct alert messg");
			
			alert.accept();
		}
		
		else{
			System.out.println("in-correct alert messg");
			
			alert.dismiss();
		}
		
		Thread.sleep(5000);
			
		
			 WebElement shop1 =  driver.findElement(By.linkText("Shop"));
			 
			 HighlightLocator.highLightElement(driver, shop1);
			 
			 shop1.click();
					
			Thread.sleep(5000);
			
			WebElement favorite1 = driver.findElement(By.xpath("//a[contains(text(),'Favorites')]"));
			
			HighlightLocator.highLightElement(driver, favorite1);
			
			favorite1.click();
			
			WebElement accept_prod = driver.findElement(By.xpath("//a[@class='btn add-to-cart-btn']")); // // need to change if product change
			
			HighlightLocator.highLightElement(driver, accept_prod);
			
			accept_prod.click();
			
			Thread.sleep(5000);
		
		
		
      /*  WebElement product_image= driver.findElement(By.xpath("//a[@class='product-grid-image']"));
		 
		 Actions fav = new Actions(driver);
			
		 fav.moveToElement(product_image).click().perform();
			
			
		 Thread.sleep(3000);
		
		 //driver.findElement(By.xpath("//div[@class='fav-529743904822']")).click();
		 
		
	//	fav.click();
		
		Thread.sleep(1000);
		
		JavascriptExecutor jkl = (JavascriptExecutor)driver;
		
		jkl.executeScript("window.scrollBy(0,200)", "");
		
		 driver.findElement(By.xpath("//a[contains(text(),'Add Fav')]")).click();
		
		Thread.sleep(5000);
		
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy(0,-500)", "");
		
		driver.findElement(By.xpath("//a[contains(text(),'Favorites')]")).click();
		
		Thread.sleep(5000);  */
		
	}
	
	 
}
