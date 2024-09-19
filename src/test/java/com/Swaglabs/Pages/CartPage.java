package com.Swaglabs.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Swaglabs.BaseTest.BaseTest;

public class CartPage extends BaseTest
{
	WebDriver driver ;
	
	
	//constructor
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	//Locator
	@FindBy(xpath="//button[text()='Remove']")
	WebElement remove;
	

	@FindBy(id="continue-shopping")
	WebElement cbtn;
	
	@FindBy(id="checkout")
	WebElement checkbtn;
	
	
	
	
	//ActionMethods
	
	public void doremove() {
		
		remove.click();
		System.out.println("Product removed from cart!");
		
	}
	
	public InventoryPage continueShop() {
		cbtn.click();
		return new InventoryPage(driver);
	}
	
	public CheckOutPage checkOut() {
		checkbtn.click();
		return new CheckOutPage(driver);
	}
	
	
	
	
	
	
	

}
