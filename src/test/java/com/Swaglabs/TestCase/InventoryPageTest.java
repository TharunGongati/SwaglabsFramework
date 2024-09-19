package com.Swaglabs.TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;


import com.Swaglabs.BaseTest.BaseTest;

public class InventoryPageTest extends BaseTest
{
	@BeforeClass
	public void setup() {
		lp.Login("standard_user", "secret_sauce");
	}
  @Test (priority=1)
  public void ValidateProductDetails() 
  {
	 
	  ip.TotalProd();
	  System.out.println("ValidateProductDetails  success");
  }
  
  @Test (priority=2)
  public void ValidateSelection() {
	  ip.Product("Sauce Labs Bolt T-Shirt");
	  System.out.println("ValidateSelection Sucess");
  }
  @Test (priority=3)
  public void ValidateAddToCart()
  {
	  ip.addToCart();
	  System.out.println("ValidateAddToCart Success");
	  
  }
  @Test (priority=4)
  public void openCart() {
	  ip.GotoCart();
	  System.out.println("OpenCart");
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
