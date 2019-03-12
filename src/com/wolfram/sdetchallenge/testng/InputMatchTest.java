//Wolfram SDET Challenge
//Hannah Carl

package com.wolfram.sdetchallenge.testng;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Parameters;

import com.wolfram.sdetchallenge.main.Driver;
import com.wolfram.sdetchallenge.main.WolframInputPage;
import com.wolfram.sdetchallenge.main.WolframResultPage;

import java.io.IOException;

//InputMatchTest Class
public class InputMatchTest extends Driver{
	
	
	//Test will confirm that search engine read input correctly
	@Parameters({ "testInput"})
	@Test
	public void confirmTestInput(String testInput) throws IOException  {
		//Create web driver for wolfram alpha
		webDriver.get("https://www.wolframalpha.com");
		WolframInputPage wolframInputPage = new WolframInputPage(webDriver);
		
		//Enter input & submit
		wolframInputPage.enterInput(testInput);
		WolframResultPage resultPage = wolframInputPage.submit();
		
		
		//Check if results are equal
		assertEquals(testInput, resultPage.checkInput());
	
	
	}

	
	
}
