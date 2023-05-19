package com.sample.utils;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.sample.base.BaseUI;

public class ExtentReportManager extends BaseUI {
	
	public static ExtentReports extent;
	public static ExtentSparkReporter htmlReporter;
	
	/*******Getting report instance for Extent Report****/
	//@BeforeSuite 
	 public static ExtentReports getReportInstance() {
		 String repName = "TestReport"+BaseUI.timestamp+".html";
		 htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir")
				 +"/CustomReport/"+repName);
		 htmlReporter.config().setDocumentTitle("Automation Report");
		 htmlReporter.config().setReportName("MyContactForm Report");
		 htmlReporter.config().setTheme(Theme.DARK);
		 extent = new ExtentReports();
		 extent.attachReporter(htmlReporter);
		 return extent;
		 
		 
		 
	 }
	 
	
	
	

}
