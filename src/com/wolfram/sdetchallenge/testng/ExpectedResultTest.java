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


//ExpectedResultTest Class
public class ExpectedResultTest extends Driver{
	

	//Test will check the expected results of the input given
	@Parameters({ "testInput", "testExpectedResult"})
	@Test
	public void checkExpectedResult(String testInput, String testExpectedResult) throws IOException  {
		//Create web driver for wolfram alpha
		webDriver.get("https://www.wolframalpha.com");
		WolframInputPage wolframInputPage = new WolframInputPage(webDriver);
		
		//Enter input & submit
		wolframInputPage.enterInput(testInput);
		WolframResultPage resultPage = wolframInputPage.submit();
		
		//Check if results are equal
		assertEquals(testExpectedResult, resultPage.getResult());
	
	
	}
}
