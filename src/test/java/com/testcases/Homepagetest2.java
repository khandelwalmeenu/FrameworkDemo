package com.testcases;



import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.sample.base.BaseUI;
import com.sample.pages.Homepage;
import com.sample.utils.FileIO;
import com.sample.utils.ListenerUtils;

@Listeners(com.sample.utils.ListenerUtils.class)
public class Homepagetest2 extends BaseUI {
	//ExtentReports extent;
	public WebDriver driver;
           String[][]testdata;

	@BeforeMethod
	public void setup(){
		
		driver = invokeBrowser();
		navigateToUrl("websiteURL");
		
	}
	
@Test(priority = 1,dataProvider = "testdata")
public void usernametest(String user,String pass){
	//logger = report.createTest("test case 1","validation of username testecase");
	Homepage homepage  = new Homepage(driver,logger);
	
	homepage.enterUsername(user);
	homepage.enterPassword(pass);
	
}
//(dependsOnMethods = "passwordtest")



@ DataProvider (name= "testdata")

public Object[][] testdata() throws IOException{
	
	testdata = FileIO.datahandling("Sheet1");
return testdata;
		}

	


//@AfterMethod
public void getResult(ITestResult result) {
	if(result.getStatus()==ITestResult.FAILURE) {
	logger.log(Status.FAIL,result.getThrowable());
	}
	else if (result.getStatus()==ITestResult.SUCCESS) {
	logger.log(Status.PASS, result.getTestName());
}
    else {
	logger.log(Status.SKIP,result.getTestName());
	}
	

}

	@AfterTest
	public void kill() {
		driver.close();
		
	
	//	report.flush();
	
}

}

