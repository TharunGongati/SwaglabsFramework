package com.Swaglabs.TestCase;

import org.testng.annotations.Test;
import org.testng.Assert;


import com.Swaglabs.BaseTest.BaseTest;
import com.Swaglabs.Pages.InventoryPage;

public class LoginPageTest extends BaseTest
{
  @Test (priority=1)
  public void ValidateUrl() 
  {
	 String url =  lp.getUrl();
	  Assert.assertTrue(url.contains("demo"), "Url is Invalid");
	  System.out.println("The Url is Valid ......");
  }
  
  
  @Test (priority=2)
  public void ValidateTitle() 
  {
	 String url =  lp.getAppTitle();
	  Assert.assertTrue(url.contains("Labs"), "Title is Invalid");
	  System.out.println("The Title is Valid ......");
  }
  
  @Test (priority=3)
  public InventoryPage Login () {
	  lp.Login("standard_user", "secret_sauce");
	  String url =  lp.getUrl();
	  Assert.assertTrue(url.contains("inventory"), " Login Failed");
	  System.out.println("Login Sucesss.......");
	  return new InventoryPage(driver);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
