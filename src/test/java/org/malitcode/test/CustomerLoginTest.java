package org.malitcode.test;
import org.testng.annotations.Test;

public class CustomerLoginTest extends BaseClass {
	  
  @Test
  public void loginCustomer() throws InterruptedException {
	  
	  	final String amount ="1500";
	  	
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
		
		
  }
}
