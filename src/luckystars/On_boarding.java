package luckystars;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class On_boarding
{

	AndroidDriver driver;
	
	@BeforeTest
	public void setUp() throws MalformedURLException
	{
		//Created object of DesiredCapabilities class.
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		//Set appium-version desired capability.
		capabilities.setCapability("appium-version", "1.4");
		
		//Set platformName desired capability. It's Android in our case here. 
		capabilities.setCapability("platformName", "Android");
		  
		//Set platformVersion desired capability.  
		capabilities.setCapability("platformVersion", "4.3");
		
		// Set android deviceName desired capability. Set your device name.
		capabilities.setCapability("deviceName", "ZY2224NBCM");
		
		// Set app desired capability. Set your apk path.
		capabilities.setCapability("app", "/Automation Projects/Android Apk 291116/LuckyStars.apk");

		// Created object of RemoteWebDriver will all set capabilities.
		// Set appium server address and port number in URL string.
		// It will launch calculator app in android device.
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


	}


	@Test
	public void links() 
	{
		// click on get started button
		driver.findElement(By.id("in.interactive.luckystars:id/bt_getStarted")).click();

		// click on terms & conditions
		driver.findElement(By.id("in.interactive.luckystars:id/tv_terms")).click();

		// click on back button of T & C screen
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();

		// click on privacy & policy
		driver.findElement(By.id("in.interactive.luckystars:id/tv_privacy_policy")).click();

		// click on back button of privacy & policy screen
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();

		// click on disclaimer
		driver.findElement(By.id("in.interactive.luckystars:id/tv_desc")).click();

		// click on back button of disclaimer
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();

		// click on mobile number input line & set number
		driver.findElement(By.id("in.interactive.luckystars:id/input_layout_mobile_no")).sendKeys("9561192140");
		
		// click on continue button
	    driver.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();
	    
	    // click on edit button
	    driver.findElement(By.id("android:id/button2")).click();
	    
	    // click on continue button
	    driver.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();
	    
	    // Confirm message button
	    String msg= driver.findElement(By.id("android:id/message")).getText();
	    
	   Assert.assertEquals(msg, "An SMS with a verification code will be sent to this number.");
	   
	   System.out.print("Asseration passed");
	    
	    
	    
	    
	    
	    


	}
	@AfterTest
	public void teardown() throws Exception
	{
		// driver.quit();
	}
}