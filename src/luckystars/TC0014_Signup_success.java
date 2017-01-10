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

public class TC0014_Signup_success
{

	AndroidDriver driver;
	
@BeforeTest
public void setUp() throws MalformedURLException {
 
 DesiredCapabilities capabilities = new DesiredCapabilities();
 capabilities.setCapability("appium-version", "1.4");
 capabilities.setCapability("platformName", "Android");
 capabilities.setCapability("platformVersion", "4.3");
 capabilities.setCapability("deviceName", "ZY223Q3LWX");
 capabilities.setCapability("app", "/Users/Desktop/LuckyStars.apk");
 
 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 
 
 }


@Test
public void Signup_success() 
	{
	 
	    driver.findElement(By.id("in.interactive.luckystars:id/bt_getStarted")).click();

	    driver.findElement(By.id("in.interactive.luckystars:id/input_layout_mobile_no")).sendKeys("99000000467");

	    driver.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();

	    driver.findElement(By.id("android:id/button1")).click();

	    driver.findElement(By.id("in.interactive.luckystars:id/otpET")).sendKeys("111111");

	    driver.findElement(By.id("in.interactive.luckystars:id/et_first_name")).sendKeys("Sushant");

	    driver.findElement(By.id("in.interactive.luckystars:id/et_last_name")).sendKeys("Dubal");

	    driver.navigate().back();

	    driver.findElement(By.id("in.interactive.luckystars:id/et_email_id")).sendKeys("sushant2047@interactives.in");

	    driver.navigate().back();

	    driver.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();

	    driver.findElement(By.id("android:id/button1")).click();

	    driver.findElement(By.id("in.interactive.luckystars:id/btn_chkfreebies")).click();

        driver.findElement(By.id("in.interactive.luckystars:id/img_homeintro")).click();

        driver.findElement(By.id("in.interactive.luckystars:id/img_homeintro")).click();
	
	

    }

@AfterTest
public void teardown() throws Exception
{
// driver.quit();
}


}