package org.malitcode.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

public class ManagerLoginTest extends BaseClass {
	
  @Test
  public void loginManager() throws InterruptedException {
	  
	  String firstName = "Nkosinathi";
	  String lastName = "Malala";
	  String code = "CMP123";
	  
	  getApp().getPages().getManagerLoginPage().clickManagerLoginButton();
	  Thread.sleep(2000);
	  getApp().getPages().getManagerLoginPage().clickFirstAddCustomerButton();
	  Thread.sleep(2000);
	  getApp().getPages().getManagerLoginPage().sendFirstName(firstName);
	  getApp().getPages().getManagerLoginPage().sendLasttName(lastName);
	  getApp().getPages().getManagerLoginPage().sendCode(code);
	  Thread.sleep(2000);
	  getApp().getPages().getManagerLoginPage().clickLastAddCustomerButton();
	  
	  Reporter.log("Manager Login successfully executed");
	    
  }
  
  
}
