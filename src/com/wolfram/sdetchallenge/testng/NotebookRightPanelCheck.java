//Wolfram SDET Challenge
//Hannah Carl

package com.wolfram.sdetchallenge.testng;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import com.wolfram.sdetchallenge.main.Driver;
import com.wolfram.sdetchallenge.main.WolframNotebookPage;


import java.io.IOException;
import java.util.ArrayList;


//NotebookButtonCheck Class
public class NotebookRightPanelCheck extends Driver{
	
	
	//Test will create a new notebook, check things to try button
	@Parameters({ "thingsToTryURL"})
	@Test
	public void thingsToTryCheck(String thingsToTryURL) throws IOException, InterruptedException  {
		
		//Create web driver for wolfram alpha
		webDriver.get("http://develop.open.wolframcloud.com/app/");
		WolframNotebookPage wolframNotebookPage = new WolframNotebookPage(webDriver);
		
		//Delay
	  	Thread.sleep(10);
		
		//Hit pause on video
		wolframNotebookPage.pauseButton();
		
	
		//Create notebook
		wolframNotebookPage.createNotebook();
		
		//Select correct window tab
		ArrayList<String> tabs2 = new ArrayList<String> (webDriver.getWindowHandles());
	    webDriver.switchTo().window(tabs2.get(0));
	    webDriver.close();
	    webDriver.switchTo().window(tabs2.get(1));
	    
	    //Delay
	  	Thread.sleep(10);

	    
	    //Click things to try
	  	wolframNotebookPage.thingsToTry();
	  	
	  	//Select correct window tab
	  	ArrayList<String> tabs3 = new ArrayList<String> (webDriver.getWindowHandles());
	  	webDriver.switchTo().window(tabs3.get(0));
	  	webDriver.close();
	  	webDriver.switchTo().window(tabs3.get(1));
	  	
	  	//Delay
	  	Thread.sleep(10);
	  	
	  	//Get URL of new page
	  	String actualURL = webDriver.getCurrentUrl();
	    
		
	  	//Verify try new things was clicked by comparing page URL
		assertEquals(thingsToTryURL,actualURL);
		
	}
	
	
	
	
	
}
