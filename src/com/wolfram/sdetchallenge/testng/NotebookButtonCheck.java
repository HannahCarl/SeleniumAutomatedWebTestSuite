//Wolfram SDET Challenge
//Hannah Carl

package com.wolfram.sdetchallenge.testng;


import org.testng.annotations.Test;

import com.wolfram.sdetchallenge.main.Driver;
import com.wolfram.sdetchallenge.main.WolframNotebookPage;

import java.io.IOException;
import java.util.ArrayList;


//NotebookButtonCheck Class
public class NotebookButtonCheck extends Driver{
	
	
	//Test will create a new notebook, click hyperlink insert button
	@Test
	public void hyperLinkTest() throws IOException, InterruptedException  {
		
		//Create web driver for wolfram alpha
		webDriver.get("http://develop.open.wolframcloud.com/app/");
		WolframNotebookPage wolframNotebookPage = new WolframNotebookPage(webDriver);
		
		//Delay
		//Thread.sleep(10);
		
		//Create notebook
		wolframNotebookPage.createNotebook();
		
		//Select correct window tab
		ArrayList<String> tabs2 = new ArrayList<String> (webDriver.getWindowHandles());
	    webDriver.switchTo().window(tabs2.get(0));
	    webDriver.close();
	    webDriver.switchTo().window(tabs2.get(1));
	    
		//Delay
		Thread.sleep(10);
		
		//Click insert
		wolframNotebookPage.insertButton();
		
		//Click hyperlink insert
		wolframNotebookPage.hyperlinkInsert();

	}
	
	//Test will create a new notebook, click special characters insert button and evaluate
	@Test
	public void specialCharactersTest() throws IOException, InterruptedException  {
		
		//Create web driver for wolfram alpha
		webDriver.get("http://develop.open.wolframcloud.com/app/");
		WolframNotebookPage wolframNotebookPage = new WolframNotebookPage(webDriver);
		
		//Delay
		//Thread.sleep(10);
		
		//Create notebook
		wolframNotebookPage.createNotebook();
		
		//Select correct window tab
		ArrayList<String> tabs2 = new ArrayList<String> (webDriver.getWindowHandles());
	    webDriver.switchTo().window(tabs2.get(0));
	    webDriver.close();
	    webDriver.switchTo().window(tabs2.get(1));
	    
		
		//Click insert
		wolframNotebookPage.insertButton();
		
		
		//Click special characters insert
		wolframNotebookPage.specialCharactersInsert();
		
		
		//Click pi button
		wolframNotebookPage.piInsert();
		
		
		//Click evaluation
		wolframNotebookPage.evalButton();
		
		//Evaluate all cells
		wolframNotebookPage.evalAllButton();
		

	}
	
	
	
}
