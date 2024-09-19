package com.Swaglabs.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage 
{
	public WebDriver driver;
	//constructor
	public OverviewPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	//locators
	@FindBy(id="checkout_summary_container")
	WebElement summary;
	
	@FindBy(id="finish")
	WebElement fbtn;
	
	@FindBy(tagName="h2")
	WebElement text;
	
	//action methods
	
	public void getSummary()
	{
		System.out.println("*******Order Summary is*********");
		System.out.println(summary.getText());
	}
	
	public void doFinish()
	{
		fbtn.click();
		System.out.println("Final Order status: "+text.getText());
	}
	
	
	

}
