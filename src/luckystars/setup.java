package luckystars;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class setup
{

	AndroidDriver driver;
	
@BeforeTest
public void setUp() throws MalformedURLException {
 
 DesiredCapabilities capabilities = new DesiredCapabilities();
 capabilities.setCapability("appium-version", "1.4");
 capabilities.setCapability("platformName", "Android");
 capabilities.setCapability("platformVersion", "4.3");
 capabilities.setCapability("deviceName", "33000a46aa4b63b9");
 capabilities.setCapability("app", "/Users/Desktop/LuckyStars.apk");
 
 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 
 
 }


@Test
public void Signup_success() 
	{
	 
	    driver.findElement(By.id("in.interactive.luckystars:id/bt_getStarted")).click();

	    driver.findElement(By.id("in.interactive.luckystars:id/input_layout_mobile_no")).sendKeys("99000000460");

	    driver.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();

	    driver.findElement(By.id("android:id/button1")).click();

	    driver.findElement(By.id("in.interactive.luckystars:id/otpET")).sendKeys("111111");

	    driver.findElement(By.id("in.interactive.luckystars:id/et_first_name")).sendKeys("Sushant");

	    driver.findElement(By.id("in.interactive.luckystars:id/et_last_name")).sendKeys("Dubal");

	    driver.navigate().back();

	    driver.findElement(By.id("in.interactive.luckystars:id/et_email_id")).sendKeys("sushant2049@interactives.in");

	    driver.navigate().back();

	    driver.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();

	    driver.findElement(By.id("android:id/button1")).click();

	    driver.findElement(By.id("in.interactive.luckystars:id/btn_chkfreebies")).click();

       	System.out.println("job done");
	

    }


public void takeScreenShot()
{
	
	 Dimension size;
	 String destDir;
	 DateFormat dateFormat;


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
	  
	  catch (IOException e) 
	  {
	   e.printStackTrace();
	  }
	 }


@AfterTest
public void teardown() throws Exception
{
// driver.quit();
}


}