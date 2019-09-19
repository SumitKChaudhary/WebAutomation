/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 19-Sep-2019
 *  FILE NAME  		: 	 MultipleVideoPlay.java
 *  PROJECT NAME 	:	 sumit.Webapplication.AutomationTesting
 * 
 */
package com.youtubeProject;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class MultipleVideoPlay 
{
	ChromeDriver driver;
	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/sumitkumar/Downloads/chromedriver");
		
		 driver = new ChromeDriver();
	}
	
	@Test
	public void playYoutubeMultipleVideos() throws InterruptedException
	{
		driver.get("http://www.youtube.com/");
		
		driver.manage().window().maximize();
		// store all video elements in the list of web elements variable 
		
		List<WebElement> allElements= driver.findElements(By.id("video-title"));
		
		//fetch one by one and store another web elements variable 
		for (WebElement onVideoelement : allElements)
		{
			// click the video element which is get on onVideoelement variable 
			onVideoelement.click();
			
			Thread.sleep(5000);// wait for a second 
			driver.navigate().back();// click the browser back button 
		}
	}
	
	//@Ignore
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.close();
	}

}
