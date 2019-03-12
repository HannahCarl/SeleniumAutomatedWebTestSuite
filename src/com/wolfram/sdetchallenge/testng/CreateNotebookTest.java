//Wolfram SDET Challenge
//Hannah Carl

package com.wolfram.sdetchallenge.testng;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Parameters;

import com.wolfram.sdetchallenge.main.Driver;
import com.wolfram.sdetchallenge.main.WolframNotebookPage;

import java.io.IOException;
import java.util.ArrayList;


//CreateNotebookTest Class
public class CreateNotebookTest extends Driver{
	
	
	//Test will create a new notebook and compare title to check
	@Parameters({ "notebookTitle"})
	@Test
	public void createNotebookTest(String notebookTitle) throws IOException, InterruptedException  {
		String actualNotebookTitle = "";
		
		//Create web driver for wolfram alpha
		webDriver.get("http://develop.open.wolframcloud.com/app/");
		WolframNotebookPage wolframNotebookPage = new WolframNotebookPage(webDriver);
		
		
		//Create notebook
		wolframNotebookPage.createNotebook();
		
		//Select correct window tab
		ArrayList<String> tabs2 = new ArrayList<String> (webDriver.getWindowHandles());
	    webDriver.switchTo().window(tabs2.get(0));
	    webDriver.close();
	    webDriver.switchTo().window(tabs2.get(1));
		
	    //Get title
		actualNotebookTitle = webDriver.getTitle();
		
		//Delay
		Thread.sleep(50);
		
		//Verify create notebook was clicked by comparing page title
		assertEquals(notebookTitle,actualNotebookTitle);

	}
	
	
	
}
