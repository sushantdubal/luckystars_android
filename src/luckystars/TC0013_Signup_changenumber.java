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

public class TC0013_Signup_changenumber
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

public void Signup_changenumber() 
{
	driver.findElement(By.id("in.interactive.luckystars:id/bt_getStarted")).click();

    driver.findElement(By.id("in.interactive.luckystars:id/input_layout_mobile_no")).sendKeys("9900000045");

    driver.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();

    driver.findElement(By.id("android:id/button1")).click();

    driver.findElement(By.id("in.interactive.luckystars:id/changebtn")).click();
    
    driver.findElement(By.id("in.interactive.luckystars:id/et_mobile_no")).sendKeys("9900000046");
    
    driver.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();

    driver.findElement(By.id("android:id/button1")).click();

    driver.findElement(By.id("in.interactive.luckystars:id/otpET")).sendKeys("111111");

}

@AfterTest
public void teardown() throws Exception
{
// driver.quit();
}


}