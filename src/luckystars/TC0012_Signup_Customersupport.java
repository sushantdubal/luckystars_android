package luckystars;



import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import luckystars.*;


public class TC0012_Signup_Customersupport
{

	AndroidDriver driver;
	
@BeforeTest
public void setUp() throws MalformedURLException {
 
 DesiredCapabilities capabilities = new DesiredCapabilities();
 capabilities.setCapability("appium-version", "1.4");
 capabilities.setCapability("platformName", "Android");
 capabilities.setCapability("platformVersion", "4.3");
 capabilities.setCapability("deviceName", "0123456789ABCDEF");
 capabilities.setCapability("app", "/Users/Desktop/Lucky_Stars.apk");
 
 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 
 
 }


@Test 

public void Signup_Customersupport() 
{
	driver.findElement(By.id("in.interactive.luckystars:id/bt_getStarted")).click();

    driver.findElement(By.id("in.interactive.luckystars:id/input_layout_mobile_no")).sendKeys("9561192140");

    driver.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();

    driver.findElement(By.id("android:id/button1")).click();

    driver.findElement(By.id("in.interactive.luckystars:id/otpET")).sendKeys("");
    
    driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    
    driver.findElement(By.id("in.interactive.luckystars:id/resentBtn")).click();
    
    driver.hideKeyboard();
    
    driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    
    driver.findElement(By.id("in.interactive.luckystars:id/tv_customer_support")).click();
    
    driver.findElement(By.id("in.interactive.luckystars:id/et_feedback_message")).sendKeys("Facing issues with sign up");
    
    driver.navigate().back();
    
    driver.findElement(By.id("in.interactive.luckystars:id/iv_screen_shot")).click();
    
    //Left menu-Winners-Feedback-Permission-allow
	driver.findElement(By.name("OK")).click();
	    
	    //Permission- read & write
    driver.findElement(By.name("Allow")).click();
	    
	    //Permissions-
	driver.findElement(By.name("Allow")).click();
	    
	  //Left menu-Winners-Feedback-screenshot from gallery
	 driver.findElement(By.name("Gallery")).click();
	    
	  //Left menu-Winners-Feedback-screenshot from gallery- click on gallery
	 driver.findElement(By.name("Gallery")).click();
	    
	    ////Left menu-Winners-Feedback-screenshot from gallery- click on cancel
	 driver.findElement(By.name("Cancel")).click();
	    
	 driver.findElement(By.name("in.interactive.luckystars:id/btn_submit")).click();
	    
	 driver.findElement(By.name("in.interactive.luckystars:id/action_edit")).click();
	
  }

@AfterTest
public void teardown() throws Exception
{
// driver.quit();
}
}
