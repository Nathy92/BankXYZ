package org.malitcode.listeners;

import org.malitcode.test.BaseClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;



public class CustomListeners extends BaseClass implements ITestListener{
	
	
	
	
	public void onTestStart(ITestResult arg0) {
		//test.log(LogStatus.FAIL, arg0.getName().toUpperCase() + "FAIL");
		
	 	System.setProperty("org.uncommons.reportng.escape-output","false");
		Reporter.log("Capturing screenshot");
		Reporter.log("Customer Login successfully executed");
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\workspace\\Documents\\screenshot\\error.jpg\">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\workspace\\Documents\\screenshot\\error.jpg\"><img src=\"C:\\Users\\workspace\\Documents\\screenshot\\error.jpg\" height=200 width=200></img></a>");
	
	}
	
	public void onTestSuccess(ITestResult arg0) {
		//test.log(LogStatus.PASS, arg0.getName().toUpperCase() + "PASS");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

//	public void onTestFailure(ITestResult arg0) {
//		test.log(LogStatus.FAIL, arg0.getName().toUpperCase() + "FAIL");
//		
//	 	System.setProperty("org.uncommons.reportng.escape-output","false");
//		Reporter.log("Capturing screenshot");
//		Reporter.log("Customer Login successfully executed");
//		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\workspace\\Documents\\screenshot\\error.jpg\">Screenshot</a>");
//		Reporter.log("<br>");
//		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\workspace\\Documents\\screenshot\\error.jpg\"><img src=\"C:\\Users\\workspace\\Documents\\screenshot\\error.jpg\" height=200 width=200></img></a>");
//		
//	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
}
