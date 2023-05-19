package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sample.base.BaseUI;
import com.sample.pages.Homepage;
import com.sample.utils.FileIO;


public class Homepagetest extends BaseUI {
	public WebDriver driver;
String[][]testdata;

	@BeforeTest
	public void setup(){
		driver = invokeBrowser();
		navigateToUrl("websiteURl");
		
	}
	
@Test
public void usernametest(){
	Homepage homepage = new Homepage (driver);
	homepage.enterUsername();
	
	
}
@Test
public void passwordtest(){
	Homepage homepage = new Homepage (driver);
	homepage.enterPassword();
}
@Test
public void sampleformstest(){
	Homepage homepage = new Homepage (driver);
	homepage.clickSampleforms();
	
}

	


@AfterTest
public void teardown() {
	driver.close();
}

}

