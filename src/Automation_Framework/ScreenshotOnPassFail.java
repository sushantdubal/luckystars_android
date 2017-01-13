package Automation_Framework;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ ScreenshotUtility.class })
public class ScreenshotOnPassFail 
{
 static AndroidDriver driver;

 @BeforeClass
 public void setUp() throws Exception {
	 DesiredCapabilities capabilities = new DesiredCapabilities();
	 capabilities.setCapability("appium-version", "1.4");
	 capabilities.setCapability("platformName", "Android");
	 capabilities.setCapability("platformVersion", "4.3");
	 capabilities.setCapability("deviceName", "ZY2224NBCM");
	 capabilities.setCapability("app", "/Automation Projects/Android Apk 291116/LuckyStars.apk");
	 
	 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
}

 @Test(priority=2)
 public void TestForFailure() throws IOException {
	 
	 	driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
		
	    driver.findElement(By.id("in.interactive.luckystars:id/iv_user_image")).click();
	    
	    driver.findElement(By.id("in.interactive.luckystars:id/et_first_name")).sendKeys("1");
	    
	    driver.navigate().back();
	    
	    driver.findElement(By.id("in.interactive.luckystars:id/submitBtn")).click();
	   
	    driver.findElement(By.name("CONFRIM1")).click();
	   
  }

 @Test(priority=1)
 public void TestForPass() throws IOException {
	 
	 driver.findElement(By.id("in.interactive.luckystars:id/bt_getStarted")).click();

     driver.findElement(By.id("in.interactive.luckystars:id/input_layout_mobile_no")).sendKeys("9561192140");
  
     driver.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();
     
     driver.findElement(By.id("android:id/button1")).click();
    
     driver.findElement(By.id("in.interactive.luckystars:id/otpET")).sendKeys("111111");
     
     driver.findElement(By.id("in.interactive.luckystars:id/img_homeintro")).click();
   
     driver.findElement(By.id("in.interactive.luckystars:id/img_homeintro")).click();

 }

 @AfterClass
 public void End() {
  driver.quit();
 }
}
