package org.malitcode.test;

import java.util.concurrent.TimeUnit;

import org.malitcode.elements.CustomerLoginElements;
import org.malitcode.lib.AppLib;
import org.malitcode.pages.CustomerLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseClass {
	
	WebDriver driver;
	private AppLib app;
	
	 @BeforeTest
	  public void setUp() throws Exception {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32_2\\chromedriver.exe");
		  driver = new ChromeDriver();  
		  app = new AppLib(driver);
		  
		  getApp().getFlow().navigateToUrl("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		  getApp().getFlow().maximWindow();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  }
	  
	  @AfterTest
	  public void tearDown() {
		  getApp().getFlow().close();
	  }
	  
	  public AppLib getApp() {
		  return app;
	  }
}
