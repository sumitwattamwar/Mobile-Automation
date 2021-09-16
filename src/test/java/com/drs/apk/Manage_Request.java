package com.drs.apk;


import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.How;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Manage_Request {

	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args)

	{
		try {
			openDNS_prod();
		} catch (Exception e) {

			System.out.println(e.getCause());
			System.out.println(e.getMessage());

			e.printStackTrace();
		}
	}

	public static void openDNS_prod() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability("deviceName", "PaddyEmulator");
		dc.setCapability("udid", "emulator-5554");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("appPackage", "com.healthpole.dentists.debug");// staging package 
		dc.setCapability("appActivity", "com.healthpole.doctors.social.views.activities.SplashActivity");
		dc.setCapability(MobileCapabilityType.NO_RESET, true);
		dc.setCapability( MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), dc);

		System.out.println("Session- App started");

		Thread.sleep(3000);
		
		driver.findElementByXPath("//*[@content-desc='Network']").click(); // Click on NETWORK TAB
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@text='Manage Request']").click();//Click on Manage Request
		Thread.sleep(3000);
	/*	/////////////////NOTE:There should be One request in manage requests to click on and to run code ////////////////////
		
		
		Thread.sleep(4000);
		driver.findElementByXPath("//*[@text='ACCEPT']").click();//Click on Manage Request
		Thread.sleep(4000); */
		
		driver.findElementByXPath("//*[@text='SENT']").click();//Click on SENT
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@text='WITHDRAW']").click();	//Click on WITHDRAW
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@text='CANCEL']").click();// Click on CANCEL
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@text='WITHDRAW']").click();	//Click on WITHDRAW
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@text='DONE']").click();	//Click on WITHDRAW
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@content-desc='Navigate up']")).click();// Clicked on back
		
	}
}