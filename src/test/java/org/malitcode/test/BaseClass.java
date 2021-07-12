package org.malitcode.test;

import java.util.concurrent.TimeUnit;

import org.malitcode.lib.AppLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {
	
	WebDriver driver;
	
	private AppLib app;
	
	public static ExtentTest test;
	
	 @BeforeMethod
	  public void setUp() throws Exception {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\workspace\\eclipse-workspace\\BankXYZ\\src\\test\\executables\\chromedriver.exe");
		  driver = new ChromeDriver();  
		  app = new AppLib(driver);
		  
		  getApp().getFlow().navigateToUrl("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		  getApp().getFlow().maximWindow();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  }
	  
	  @AfterMethod
	  public void tearDown() {
		  driver.close();
		  //getApp().getFlow().close();
	  }
	  
	  public AppLib getApp() {
		  return app;
	  }
	  
	
	 
	  
}
