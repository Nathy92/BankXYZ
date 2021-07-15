package org.malitcode.test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.malitcode.lib.AppLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseClass {
	
	WebDriver driver;
	private AppLib app;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	
	
	
	 @BeforeMethod
	  public void setUp() throws Exception {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\workspace\\eclipse-workspace\\BankXYZ\\src\\test\\executables\\chromedriver.exe");
		  driver = new ChromeDriver();  
		  log.debug("Chrome driver Launched !");
		  app = new AppLib(driver);
		  
		  getApp().getFlow().navigateToUrl("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		  log.debug("Website Loaded !");
		  getApp().getFlow().maximWindow();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  }
	  
	  @AfterMethod
	  public void tearDown() {
		  driver.close();
		  log.debug("Test execution completed !");
		  //getApp().getFlow().close();
	  }
	  
	  public AppLib getApp() {
		  return app;
	  }
	  
	
	 
	  
}
