//Wolfram SDET Challenge
//Hannah Carl

package com.wolfram.sdetchallenge.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;			//chrome
//import org.openqa.selenium.firefox.FirefoxDriver;		//firefox

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//Driver class
public class Driver {
	protected static WebDriver webDriver;															//create web driver
	protected static String chromeDriverDirectory = "/Users/hannahposch/Downloads/chromedriver";	//directory to chromedriver
	
	@BeforeClass
	public static void setUp() {
		//setup new driver
		System.setProperty("webdriver.chrome.driver",chromeDriverDirectory);  	//chrome
		webDriver = new ChromeDriver();											//chrome
		//webDriver = new FirefoxDriver();										//firefox
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 	
	}
	
	
	@AfterClass
	public static void end() {
		webDriver.manage().deleteAllCookies();
		//close driver
		webDriver.close();

	}

}
