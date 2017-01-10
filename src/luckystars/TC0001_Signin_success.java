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

public class TC0001_Signin_success extends setup  {

	AndroidDriver driver;
	
	
	    @BeforeTest
	    public void setUp() throws MalformedURLException
	    {
	    	super.setUp();
	    }
	    
	    
	    
	    
				
	    @Test
		public void Signup_success() 
	    
		{
	    	super.Signup_success();
	    	
	    	 		    
    	}
	    
	    public void takeScreenShot()
	    {
	    super.takeScreenShot();	
	    	 
	    }
	    				

 @AfterTest
		public void teardown() throws Exception
				 {
	 			super.teardown();
				 }



 }



