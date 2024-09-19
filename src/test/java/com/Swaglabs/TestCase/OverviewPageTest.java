package com.Swaglabs.TestCase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Swaglabs.BaseTest.BaseTest;

public class OverviewPageTest extends BaseTest
{
  
  @BeforeClass
	public void pageSetup()
	{
	  ip=lp.Login(prop.getData("Us"),prop.getData("Pas"));
		ip.Product(prop.getData("pname1"));
		ip.addToCart();
		ip.GotoCart();
		cp.checkOut();
		 cop.checkout(prop.getData("fname"), prop.getData("lname"), prop.getData("pcode"));
		
	}
	
@Test(priority=1)
public void validateSummary()
{
	  op.getSummary();
}

@Test(priority=2)
public void validateCompleteOrder() 
{
	  op.doFinish();
}
}