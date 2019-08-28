/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 26-Aug-2019
 *  FILE NAME  		: 	 FaceBookSignup.java
 *  PROJECT NAME 	:	 sumit.Webapplication.AutomationTesting
 * 
 */
package com.webApplication.Automation.FacebookTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookSignup 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/sumitkumar/Downloads/chromedriver");
		
		ChromeDriver chromDriver = new ChromeDriver();
		
		chromDriver.get("https://www.facebook.com");
		
		chromDriver.manage().window().maximize();
		
		WebElement firstName = chromDriver.findElement(By.id("u_0_l"));
		
		firstName.sendKeys("Sumit");
		
		WebElement surName = chromDriver.findElement(By.id("u_0_n"));
		
		surName.sendKeys("Kumar");
		
		WebElement mobileNumber = chromDriver.findElement(By.name("reg_email__"));
		
		mobileNumber.sendKeys("9971458090");
		
		WebElement passWord = chromDriver.findElement(By.id("u_0_x"));
		
		passWord.sendKeys("####");
		
		WebElement genderMale = chromDriver.findElement(By.id("u_0_9"));
		genderMale.click();
		
		WebElement signUpBtn = chromDriver.findElement(By.name("websubmit"));
		
		signUpBtn.click();
		
	}

}
