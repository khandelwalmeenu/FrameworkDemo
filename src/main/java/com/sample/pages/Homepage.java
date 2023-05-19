package com.sample.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.sample.base.BaseUI;

public class Homepage extends BaseUI {
	public static ExtentReports report;
	public static ExtentTest logger;
	
	public WebDriver driver;
	
	By username=getLocator("username_id");
	By password=getLocator("password_xpath");
	By sampleforms= getLocator("sampleforms_linkText");
	
	public Homepage(WebDriver driver,ExtentTest logger) {
		
		this.driver=driver;
		this.logger = logger;
	}
	
	
	

	public void enterUsername(String user) {
		sendText(username,user);
		logger.log(Status.INFO, "usernameText is entered in usernametextbox");
	}
	public void enterPassword(String pass) {
		sendText(password,pass);
		logger.log(Status.INFO, "passwordText is entered in passwordtextbox");
	}
	public void clickSampleforms() {
		clickOn(sampleforms,Duration.ofSeconds(30));
	}
}
