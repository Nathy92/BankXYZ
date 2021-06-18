package org.malitcode.pages;

import org.malitcode.elements.BankManagerLoginElements;
import org.openqa.selenium.WebDriver;

public class ManagerLoginPage {
	WebDriver driver;
	BankManagerLoginElements bankManPage;
	
	public ManagerLoginPage(WebDriver driver) {
		this.driver = driver;
		bankManPage = new BankManagerLoginElements(driver);
	}
	
	public void clickManagerLoginButton() {
		bankManPage.managerLoginBtn.click();
	}
	
	public void clickFirstAddCustomerButton() {
		bankManPage.firstAddCustomerBtn.click();
	}
	
	public void sendFirstName(String srcString) {
		bankManPage.firstNameTxt.sendKeys(srcString);
	}
	
	public void sendLasttName(String srcString) {
		bankManPage.lastNameTxt.sendKeys(srcString);
	}
	
	public void sendCode(String srcString) {
		bankManPage.postCodeTxt.sendKeys(srcString);
	}
	
	public void clickLastAddCustomerButton() {
		bankManPage.lastAddCustomerBtn.click();
	}

}
