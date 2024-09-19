package com.Swaglabs.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	
	//constrctor
	public LoginPage(WebDriver driver){
		this.driver = driver;
		//initialize the webelements
		PageFactory.initElements(driver, this);
		
	}
	//Locators
	
	@FindBy(id = "user-name")
	WebElement User ;
	@FindBy(id="password")
	WebElement Pass ;
	@FindBy(id="login-button")
	WebElement btn;
	
	
	
	
	//ActionMethods
	public String getAppTitle() {
		return driver.getTitle();
		
	}
	
public String getUrl() {
	return driver.getCurrentUrl();
	
}


public InventoryPage Login(String Username,String PassWord) {
	User.sendKeys(Username);
	Pass.sendKeys(PassWord);
	btn.click();
	//after login we will go to inventory return object of same page
	return new  InventoryPage(driver);
	
}





}
