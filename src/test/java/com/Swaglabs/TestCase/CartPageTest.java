package com.Swaglabs.TestCase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Swaglabs.BaseTest.BaseTest;


public class CartPageTest extends BaseTest
{
	@BeforeClass
	public void setup() {
		ip = lp.Login(prop.getData("Us"),prop.getData("Pas") );
		ip.Product(prop.getData("pname1"));
		ip.addToCart();
		ip.GotoCart();
		
	}
  @Test(priority =1)
  public void ValidateRemove() 
  {
	  cp.doremove();
  }
  
  @Test(priority =2)
  public void validatecontinueShoping() {
	ip =   cp.continueShop();
	  ip.Product(prop.getData("pname2"));
	  ip.addToCart();
	  ip.GotoCart();
  
  }
  
  @Test(priority =3)
  public void navigateToCheckoutPage()
  {
	  cp.checkOut();
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
