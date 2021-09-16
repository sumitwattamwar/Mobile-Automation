package com.dns.apk.debug;



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

public class GroupAdminTool_GroupRules {

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
		
		
		driver.findElementByXPath("//*[@content-desc='Community']").click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@resource-id='com.healthpole.dentists.debug:id/image_view_3']")).click(); //Clicked on groups
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='Cr-07']")).click();//CLicked on Cr-07 named group
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@resource-id='com.healthpole.dentists.debug:id/action_admin_tools']")).click(); //Clicked on Admin tool
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Group Rules']")).click();////CLicked on Group Rules
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='ADD RULE']")).click();//CLicked in ADD RULE
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Title']")).sendKeys("Precious Rule");//Clicked on Title
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//*[@text='Description']")).sendKeys("We are not intersted to describe");//Clicked on Description
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//*[@text='Save']")).click();//CLicked on Save
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@resource-id='com.healthpole.dentists.debug:id/image_view_icon']")).click(); //Clicked on More
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Edit']")).click();//CLicked on Edit
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@resource-id='com.healthpole.dentists.debug:id/edit_text_title']")).sendKeys("My Rule");//Clicked on Edit
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//*[@text='Save']")).click();//CLicked on Save
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@resource-id='com.healthpole.dentists.debug:id/image_view_icon']")).click(); //Clicked on More
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Delete']")).click();//CLicked on Delete
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='DELETE']")).click();//CLicked on Delete
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@content-desc='Navigate up']")).click();// Clicked on back
		Thread.sleep(2000);
		
		
	}}