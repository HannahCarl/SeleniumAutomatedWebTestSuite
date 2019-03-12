//Wolfram SDET Challenge
//Hannah Carl

package com.wolfram.sdetchallenge.main;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//WolframInputPage Class
public class WolframInputPage extends PageObject{
	
	@FindBy(id="query")
	private WebElement input;						//create input WebElement
	
	@FindBy(name="equal")
	private WebElement submitButton;				//create submitButton WebElement
	
	@FindBy(linkText= "Browse Examples")
	private WebElement browseExamplesButton;		//create browseExampleButton WebElement
	
	@FindBy(linkText = "Mathematics")
	private WebElement mathematicsButton;			//create mathematicsButton WebElement
	
	@FindBy(linkText = "Science & Technology")
	private WebElement scienceTechButton;			//create mathematicsButton WebElement

	
	public WolframInputPage(WebDriver webDriver) {
		super(webDriver);
	}
	
	//method will enter input
	public void enterInput(String input) {
		this.input.clear();
		this.input.sendKeys(input);	
	}
	
	//method will click submit and return result page
	public WolframResultPage submit() {
		submitButton.click();
		return new WolframResultPage(webDriver);
	}
	
	//method will click browse examples
	public void browseExamples() {
		browseExamplesButton.click();	
	}
	
	//method will click mathematics
	public void mathematics() {
		mathematicsButton.click();
	}
	
	//method will click science & technology
		public void scienceTech() {
			scienceTechButton.click();
		}

}
