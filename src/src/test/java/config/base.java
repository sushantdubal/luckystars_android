package config;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import profile.about_and_help_test;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.Assert;

import utility.Log;

//on boarding class inherits base class
public class base 
{
	public static AndroidDriver driver;
	Dimension size;
	 String destDir;
	 DateFormat dateFormat;

	/* @Test
	 public void takeScreenShot() {
		  // Set folder name to store screenshots.
		  destDir = "screenshots";
		  // Capture screenshot.
		  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  // Set date format to set It as screenshot file name.
		  dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		  // Create folder under project with name "screenshots" provided to destDir.
		  new File(destDir).mkdirs();
		  // Set file name using current date time.
		  String destFile = dateFormat.format(new Date()) + ".png";

		  try {
		   // Copy paste file at destination folder location
		   FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
		  } 
		  catch (IOException e) {
		   e.printStackTrace();
		  }
	}*/
	
	 @Test (priority=1)
	 public void setUp() throws MalformedURLException, InterruptedException
	{
		DOMConfigurator.configure("log4j.xml");  
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setCapability("deviceName", "Samsung");
		// Set android deviceName desired capability. Set your device name.
		capabilities.setCapability("deviceName", config.Constants.device );
		capabilities.setCapability("app", config.Constants.Path_apk);
   		URL url = new URL("http://127.0.0.1:4723/wd/hub");
    	driver = new AndroidDriver(url, capabilities);
    	//Reporter.log("Application launched  |", true);
    	//Log.info("Application launched.");
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
    	//Sign_in(driver);
		
	}

	
	 @Test (priority=2)
	 public void Sign_in()  throws InterruptedException 
	{
		
		
		
		driver.findElement(By.id("bt_getStarted")).click();
		
		//WebElement SkipIntro= driver.findElement(By.id("bt_getStarted"));
		
		
		
		//Test will only continue, if the below statement is true
		 
	      //This is to check whether the link is displayed or not
	 
	      //Assert.assertTrue(SkipIntro.isDisplayed());
	 
	      //My Account will be clicked only if the above condition is true
	 
	      //SkipIntro.click();
		/*try
		{
	      // click on Skip Intro button
		driver.findElement(By.id("bt_getStarted")).click();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		//allow permission
		//driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();

		// click on mobile number input line & set number
		driver.findElement(By.id("et_mobile_no")).sendKeys("9561192140");
		

		driver.findElement(By.id("in.interactive.luckystars:id/cb_age_restriction")).click();

		// click on continue button
		driver.findElement(By.id("btn_signup")).click();

		// clicks on Confirm message button
		driver.findElement(By.id("button1")).click();

		driver.findElement(By.id("otpET")).sendKeys("111111");
		//Log.info("User signed in successfully");
		Reporter.log("User signed in successfully  |", true);
		
		//allow permission
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();

		// clicks on first into screen
		driver.findElement(By.id("tv_swipe_text")).click();

		// clicks on second into screen
		driver.findElement(By.id("tv_swipeview")).click();
		//Log.info("User on home screen");
		Reporter.log("User on home screen  |", true);
		Thread.sleep(10000);
		
	
		//takeScreenShot();
				
		
	}
	 
	 public void takeScreenShot() {
		  // Set folder name to store screenshots.
		  destDir = "screenshots";
		  // Capture screenshot.
		  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  // Set date format to set It as screenshot file name.
		  dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		  // Create folder under project with name "screenshots" provided to destDir.
		  new File(destDir).mkdirs();
		  // Set file name using current date time.
		  String destFile = dateFormat.format(new Date()) + ".png";

		  try {
		   // Copy paste file at destination folder location
		   FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
	 }
 public void teardown() throws Exception 
	{
	
	driver.quit();
	
	}
}
