package org.malitcode.lib;

import org.malitcode.elements.CustomerLoginElements;
import org.malitcode.pages.CustomerLoginPage;
import org.malitcode.pages.ManagerLoginPage;
import org.openqa.selenium.WebDriver;

public class PageLib {
	
	private WebDriver driver;
	
	private CustomerLoginPage custLoginPage;
	private ManagerLoginPage managerLoginPage;
	
	public PageLib(WebDriver driver) {
		this.driver = driver;
		custLoginPage =  new CustomerLoginPage(this.driver);
		managerLoginPage = new ManagerLoginPage(this.driver);
	}
	
	public CustomerLoginPage getCustLoginPage() {
		return custLoginPage;
	}
	
	public ManagerLoginPage getManagerLoginPage() {
		return managerLoginPage;
	}

}
