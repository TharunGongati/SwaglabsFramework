package com.Swaglabs.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage 
{
	WebDriver driver ;
	
	//constructor
	public InventoryPage(WebDriver driver) {
		this.driver=driver;
		//intialize
		PageFactory.initElements(driver, this);
	}
	//locator
	
	
	
	
	@FindBy(xpath="//div//div[@class='inventory_item_name ']")
	List<WebElement> TotalProducts;
	
	@FindBy(id="add-to-cart")
	WebElement AddtoCart;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement Cart;
	
	
	
	//ActionMethods
	public void TotalProd() {
		System.out.println("******************Total Products*****************");
		for(WebElement i :TotalProducts) {
			System.out.println(i.getText());
		}
	}
	public void Product(String Pname) {
		for(WebElement i :TotalProducts) {
			if (i.getText().equals(Pname)) {
				i.click();
				break;
			}
		}
		
	}
	
	public void addToCart() {
		AddtoCart.click();
	}
	
	public CartPage GotoCart() {
		Cart.click();
		return new CartPage(driver);
	}
	

}
