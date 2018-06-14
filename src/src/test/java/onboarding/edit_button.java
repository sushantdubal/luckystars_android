package onboarding;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.base;

public class edit_button extends base
{
		

	@Test(priority = 1, groups = "Sign up")
		public void edit_button() throws InterruptedException 
		{
			
			try 
			 {
				//call setup method
				super.setUp();
			 } 
			 catch (MalformedURLException e) 
			 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
			
			// click on Skip Intro button
			driver.findElement(By.id("bt_getStarted")).click();

			//allow permission
			driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();

			// click on mobile number input line & set number
			driver.findElement(By.id("et_mobile_no")).sendKeys("9561192140");

			// click on continue button
			driver.findElement(By.id("btn_signup")).click();

			// click on continue button
			//driver.findElement(By.id("btn_signup")).click();

			// click on edit button
			driver.findElement(By.id("button2")).click();
			
			
			
			if (driver.findElements(By.id("btn_signup")).size() == 1)
			{
				driver.findElement(By.id("btn_signup")).click();
				
				
			} 	
	
			else {
				
			}
				
		
		

		try
		{
			//call tear down method
			super.teardown();
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
}
}