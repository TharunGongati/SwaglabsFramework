package com.Swaglabs.TestCase;

import org.testng.annotations.*;

import com.Swaglabs.BaseTest.BaseTest;

public class CheckOutPageTest extends BaseTest
{
	@BeforeClass
	public void setup() {
		ip=lp.Login(prop.getData("Us"),prop.getData("Pas"));
		ip.Product(prop.getData("pname1"));
		ip.addToCart();
		ip.GotoCart();
		cp.checkOut();
		
	}
  @Test
  public void ValidateOverview() 
  {
	  cop.checkout(prop.getData("fname"), prop.getData("lname"), prop.getData("pcode"));
	  
	  
  }
}
