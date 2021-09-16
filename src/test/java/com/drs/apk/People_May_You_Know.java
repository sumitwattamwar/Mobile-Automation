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

public class People_May_You_Know {

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
		// driver.findElementByXPath("//*[@resource-id='com.healthpole.dentists:id/image_view_tab_icon']").click();
		// driver.findElement(By.xpath("//*[@index='2']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@resource-id='com.healthpole.dentists.debug:id/item_view'] [1]")).click(); //Parent-child relationship
		Thread.sleep(6000); 
		driver.findElement(By.xpath("//*[@text='Follow']")).click();//Clicked on follow
		Thread.sleep(4000); 
		driver.findElement(By.xpath("//*[@resource-id='com.healthpole.dentists.debug:id/button_follow'] [1]")).click();//Clicked on Unfollow
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Message']")).click();//Clicked on what's app
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='CANCEL']")).click();//What's app cancel button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Message']")).click();//Clicked on what's app
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='CONNECT']")).click();//Clicked on CONNECT
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='More']")).click();//Clicked on More
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Share with contacts via WhatsApp']")).click();//Clicked on Share with contacts via WhatsApp
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='More']")).click();//Clicked on More
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Share Elsewhere']")).click();//Clicked on Share Elsewhere
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='Copy to clipboard']")).click();//Clicked on Copy to clipboard
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='More']")).click();//Clicked on More
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Copy Link']")).click();//Clicked on Share anywhere outside of Indian dental network
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Pending']")).click();//Clicked on Pending 
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//*[@text='DONE']")).click();//Clicked on Pending 
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//*[@text='Add']")).click();//Clicked on +Add 
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//*[@text='View full profile']")).click();//Clicked on View full profile
		Thread.sleep(4000);
	    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Personal Information\"));");//SCROLL DOWN
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@content-desc='Navigate up']")).click();// Clicked on back
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//*[@content-desc='Navigate up']")).click();// Clicked on back
	}
}