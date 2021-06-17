package org.malitcode.lib;

import org.malitcode.elements.CustomerLoginElements;
import org.malitcode.pages.CustomerLoginPage;
import org.openqa.selenium.WebDriver;

public class PageLib {
	
	private WebDriver driver;
	
	private CustomerLoginPage custLoginPage;
	
	public PageLib(WebDriver driver) {
		this.driver = driver;
		custLoginPage =  new CustomerLoginPage(this.driver);
	}
	
	public CustomerLoginPage getCustLoginPage() {
		return custLoginPage;
	}
	

}
