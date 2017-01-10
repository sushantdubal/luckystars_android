package luckystars;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
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

public class CaptureScreenShot {
 AndroidDriver driver;
 Dimension size;
 String destDir;
 DateFormat dateFormat;

 @BeforeTest
 public void setUp() throws Exception {
	 DesiredCapabilities capabilities = new DesiredCapabilities();
	 capabilities.setCapability("appium-version", "1.4");
	 capabilities.setCapability("platformName", "Android");
	 capabilities.setCapability("platformVersion", "4.3");
	 capabilities.setCapability("deviceName", "0123456789ABCDEF");
	 capabilities.setCapability("app", "/Automation Projects/LuckyStars Android/Apk/LuckyStars.apk");
	 
	 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
}

 /*@Test
 public void ScrollToTab() {
	 driver.findElement(By.id("in.interactive.luckystars:id/bt_getStarted")).click();
	 
	 takeScreenShot();

     driver.findElement(By.id("in.interactive.luckystars:id/input_layout_mobile_no")).sendKeys("9561192140");
     
     takeScreenShot();

     driver.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();
     
     takeScreenShot();

     driver.findElement(By.id("android:id/button1")).click();
     
     takeScreenShot();

     driver.findElement(By.id("in.interactive.luckystars:id/otpET")).sendKeys("111111");
     
     takeScreenShot();
     
     driver.findElement(By.id("in.interactive.luckystars:id/img_homeintro")).click();
     
     takeScreenShot();

     driver.findElement(By.id("in.interactive.luckystars:id/img_homeintro")).click();

	 takeScreenShot();

 }
 */

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
  
  catch (IOException e) 
  {
   e.printStackTrace();
  }
 }

 @AfterTest
 public void End() {
  driver.quit();
 }
}