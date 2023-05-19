package com.sample.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browsersetup {
	public static WebDriver driver;
	public static  WebDriver getChromedriver() {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-orgins=*");
		//options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		return driver;
		
	}
	public static WebDriver getFirefoxdriver() {return null;}
	public static WebDriver getEdgedriver() {return null;}
	
	
	

}
