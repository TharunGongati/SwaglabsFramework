package com.Swaglabs.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Swaglabs.BaseTest.BaseTest;

public class CheckOutPage extends BaseTest
{
	//constructor
	public CheckOutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		
	}
	
	//locators
	@FindBy(id="first-name")
	WebElement Firstname;
	
	@FindBy(id="last-name")
	WebElement Lastname;	
	
	@FindBy(id="postal-code")
	WebElement zip;
	
	@FindBy(id="continue")
	WebElement  Btn;
	
	
	
	//actionmethods
	

	public OverviewPage checkout(String name,String lname, String zipcode) {
		Firstname.sendKeys(name);
		Lastname.sendKeys(lname);
		zip.sendKeys(zipcode);
		Btn.click();
		return new  OverviewPage(driver);
		
	}
	
	
	
	
	
	

}
