//Wolfram SDET Challenge
//Hannah Carl

package com.wolfram.sdetchallenge.main;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//WolframResultPage class
public class WolframResultPage extends PageObject{
	
	
	List<WebElement> links = webDriver.findElements(By.xpath("//img[contains(@class,'ng-isolate-scope')]")); //find results images
	
	
	public WolframResultPage(WebDriver webDriver) {
		super(webDriver);
	}
	
	//method to return input from result page
	public String checkInput() {
		return ((WebElement) links.get(0)).getAttribute("alt");
		
	}
	
	//method to return result from result page
	public String getResult() {
		return ((WebElement) links.get(1)).getAttribute("alt");
	}
	
	

}
