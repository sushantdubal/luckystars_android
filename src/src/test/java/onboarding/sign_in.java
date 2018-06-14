package onboarding;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

import config.base;

//on boarding class inherits base class
public class sign_in extends base
{
	
	@Test(priority = 1, dependsOnMethods = {"setUp", "Sign_in"})
	public void Sign_in_test() throws InterruptedException 
	{
		 
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