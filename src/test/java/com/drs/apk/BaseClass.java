package com.drs.apk;
import java.net.MalformedURLException;
import java.net.URL;

import javax.naming.Context;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public  class BaseClass {
	static AndroidDriver<MobileElement> driver;
	public  void main(String[] args )
	{
		try {
			Setup ();
		} catch (Exception e) {
			System.out.println(e.getCause() );
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	@BeforeMethod
	public static void Setup () throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName","Android Emulator");
		dc.setCapability("udid","emulator-5554");
		/*dc.setCapability("deviceName","Redmi 7A");
		dc.setCapability("udid","3ab2542f0106");*/
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "8.1");
		Thread.sleep(1000);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.healthpole.doctors.debug");
		dc.setCapability( AndroidMobileCapabilityType.APP_ACTIVITY,"com.healthpole.doctors.social.views.activities.SplashActivity");
		dc.setCapability( MobileCapabilityType.NO_RESET,true);
		dc.setCapability( MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url,dc);
		
      //Prerequisites
		Thread.sleep(100);
		System.out.println("Session- App started");
		
		
		
		
		
		/*Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='NEXT']")).click(); //next
		 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='NEXT']")).click(); //next
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='NEXT']")).click(); //next
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='DONE']")).click();//Done
        
		*/
	}
	
	/*@AfterMethod
	public static void teardown()
	{
		driver.quit();
	}*/
}
