package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import library.HighlightLocator;

public class Login {

	WebDriver driver;
	
	public Login(WebDriver ldriver)
	{
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Log in')]") 
	WebElement clickLogin; 
	
	@FindBy(id="email") 
	WebElement enterEmail; 
	
	@FindBy(id="password") 
	WebElement enterPassword;
	
	@FindBy(id="customer_login") 
	WebElement submit;
	
	
	public void login_selfie_styler(String uid,String pass)
	{
	
	HighlightLocator.highLightElement(driver, clickLogin);             // High lighting the web element
	
	clickLogin.click();                                                 // Click on Login
		
	HighlightLocator.highLightElement(driver,enterEmail);
	
	enterEmail.sendKeys(uid);                                   // Enter Email
	
	HighlightLocator.highLightElement(driver,enterPassword);
	
	enterPassword.sendKeys(pass);                         // Enter Password
	
	submit.click();                                  // Click on submit button
	
	}
		
	
}
