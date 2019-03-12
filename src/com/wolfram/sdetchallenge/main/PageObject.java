//Wolfram SDET Challenge
//Hannah Carl

package com.wolfram.sdetchallenge.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//PageObject class
public class PageObject {
	
	protected WebDriver webDriver;				//create new web driver
	
	//Constructor
	public PageObject(WebDriver webDriver) {
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

}
