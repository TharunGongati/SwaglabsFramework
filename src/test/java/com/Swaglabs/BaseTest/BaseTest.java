package com.Swaglabs.BaseTest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.Swaglabs.Pages.CartPage;
import com.Swaglabs.Pages.CheckOutPage;
import com.Swaglabs.Pages.InventoryPage;
import com.Swaglabs.Pages.LoginPage;
import com.Swaglabs.Pages.OverviewPage;
import com.Swaglabs.Utilities.Properties_Reader;

public class BaseTest 
{
	public WebDriver driver ;
	public LoginPage lp;
	public InventoryPage ip;
	public CartPage cp;
	public CheckOutPage cop;
	public OverviewPage op;
	
	public Properties_Reader prop;
	@BeforeTest
	public void setUp() 
	{
		prop = new Properties_Reader();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(prop.getData("bname"));
		driver.navigate().to(prop.getData("url"));
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		cp = new CartPage(driver);
		cop=new CheckOutPage(driver);
		op= new OverviewPage(driver);
		
	}
	
	public String captureScreen(String tname)
	{
	String timestamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File source=ts.getScreenshotAs(OutputType.FILE);
		String targetFilePath=System.getProperty("user.dir")+"\\Screenshots\\"+tname+"_"+timestamp+".png";
			File targetFile=new File(targetFilePath);
			source.renameTo(targetFile);
			return targetFilePath;
		
	}

	public void addWait()
	{
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
