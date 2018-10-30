package PageObjectModel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import library.Synchronization;

public class Forgot_Password {
	
    WebDriver driver;
	
	public Forgot_Password(WebDriver ldriver)
	{
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Forgot?')]") 
	WebElement Forgot;
	
	@FindBy(xpath="//button[@id='customer_login_forgot']") 
	WebElement customer_login_forgot;
	
	@FindBy(xpath="//input[@id='inboxfield']") 
	WebElement inboxfield;
	
	@FindBy(xpath="//button[contains(@class,'btn btn-dark')]") 
	WebElement btn;

	@FindBy(xpath="//*[contains(text(),'SelfieStyler: Password Reset')]") 
	WebElement Email_Link;
	
	@FindBy(xpath="//a[@class='button__text']") 
	WebElement button__text;
	
	@FindBy(xpath="//input[@id='password1']") 
	WebElement password1;
	
	@FindBy(xpath="//input[@id='password2']") 
	WebElement password2;
	
	@FindBy(xpath="//button[@id='reset_password']") 
	WebElement reset_password;
	
	public void Click_forgot() throws Exception
	{
		
		Synchronization.Exception_Handling(driver, Forgot, 30);
			
	}
	
	public void click_reset_button() throws Exception
	{
		Synchronization.Exception_Handling(driver, customer_login_forgot, 30);
		
	}

	
	public void mailinator() throws InterruptedException
	{
		
	     Thread.sleep(15000);
		 
		 driver.get("https://www.mailinator.com/ ");
		
	}
	
	public void inboxfield_mailinator()
	{
		Synchronization.sendKeys(driver, inboxfield, 30, "rikotest@mailinator.com");
		
	}
	
	
	public void btn_mailinator() throws Exception
	{
		Synchronization.Exception_Handling(driver, btn, 30);
		
	}
	
	public void open_email() throws Exception
	{
		Synchronization.Exception_Handling(driver, Email_Link, 30);
			
	}
	
	public void email_button() throws Exception
	{
		
		Synchronization.Exception_Handling(driver, button__text, 30);
		
		Thread.sleep(8000);
	}
	
	public void switch_to_other_page() throws Exception
	{
		
		String parent_window= driver.getWindowHandle();
		 
		Set<String> s1=driver.getWindowHandles();
		
		Iterator<String> i1=s1.iterator();
		
		while (i1.hasNext())
		{
			String child_window = i1.next();
			
			if(!parent_window.equalsIgnoreCase(child_window))
			{
				driver.switchTo().window(child_window);
				
				Synchronization.sendKeys(driver, password1, 30, "America0!");
				
				Thread.sleep(2000);
				
				Synchronization.sendKeys(driver, password2, 30, "America0!");
				
				Thread.sleep(1000);
				
				Synchronization.Exception_Handling(driver, reset_password, 30);
				
				Thread.sleep(5000);
								
		
	}
	
	
	
}
	}
	
	
	
	
	
}
