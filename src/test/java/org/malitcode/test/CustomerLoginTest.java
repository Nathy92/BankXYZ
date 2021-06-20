package org.malitcode.test;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class CustomerLoginTest extends BaseClass {
	  
  @Test
  public void loginCustomer() throws InterruptedException {
	  
	  	final String amount ="1500";
	  	System.setProperty("org.uncommons.reportng.escape-output", "false");
	  	
	  	
	  	
	  	//TODO
		getApp().getPages().getCustLoginPage().clickLoginButton();
		Thread.sleep(2000);
		getApp().getPages().getCustLoginPage().selectCustomerDrop();
		Thread.sleep(2000);
		getApp().getPages().getCustLoginPage().clickInsideLoginButton();
		Thread.sleep(2000);
		
		getApp().getPages().getCustLoginPage().clickDepositButton();
		Thread.sleep(2000);
		getApp().getPages().getCustLoginPage().sendAmountKeys(amount);
		Thread.sleep(2000);
		getApp().getPages().getCustLoginPage().clickInsideDepButton();
		Thread.sleep(2000);
		getApp().getPages().getCustLoginPage().clickLogoutButton();
		Thread.sleep(2000);
		
		Reporter.log("Customer Login successfully executed");
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\workspace\\Documents\\screenshot\\error.jpg\">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\workspace\\Documents\\screenshot\\error.jpg\"><img src=\"C:\\Users\\workspace\\Documents\\screenshot\\error.jpg\" height=200 width=200></img></a>");
		
		 
		
		
  }
}
