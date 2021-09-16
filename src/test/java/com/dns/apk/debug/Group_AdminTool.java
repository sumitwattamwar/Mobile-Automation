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

public class Group_AdminTool {

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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@resource-id='com.healthpole.dentists.debug:id/image_view_3']")).click(); //Clicked on groups
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='Cr-07']")).click();//CLicked on Cr-07 named group
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@resource-id='com.healthpole.dentists.debug:id/action_admin_tools']")).click(); //Clicked on Admin tool
		Thread.sleep(2000);
		
		// ################# @1st tab- join requests ######################################
		driver.findElement(By.xpath("//*[@text='Join Requests']")).click();//Clicked on Join Requests
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@resource-id='com.healthpole.dentists.debug:id/image_view_more_option']")).click(); //Clicked on More button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='View IDN Profile']")).click();//Clicked on View IDN Profile
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@content-desc='Navigate up']")).click();// Clicked on back
		Thread.sleep(3000);
		//Need requests in join requests to accept and Decline
	/*  driver.findElement(By.xpath("//*[@text='ADD AS MEMBER']")).click();//Clicked on ADD AS MEMBER
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='DECLINE']")).click();//Clicked on DECLINE
		Thread.sleep(2000); */
		driver.findElement(By.xpath("//*[@content-desc='Navigate up']")).click();// Clicked on back from join requests
		Thread.sleep(5000);
		
		// ################# @2nd tab- Invite to join######################################
		driver.findElement(By.xpath("//*[@resource-id='com.healthpole.dentists.debug:id/action_admin_tools']")).click(); //Clicked on Admin tool
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Invite to Join Group']")).click();//Clicked on Invite to Join Group
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Search from all connections']")).sendKeys("sumit");//Clicked on Search from all connections
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@resource-id='com.healthpole.dentists.debug:id/check_box_add']")).click();//Check-Box selected
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@text='SEND INVITES']")).click();//Clicked on SEND INVITES
		Thread.sleep(5000);
		
		//#################### @3rd tab- Members ###############################
		driver.findElement(By.xpath("//*[@resource-id='com.healthpole.dentists.debug:id/action_admin_tools']")).click(); //Clicked on Admin tool
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Members']")).click();//Clicked on Members
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Members']")).click();//Clicked on Invited
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@resource-id='com.healthpole.dentists.debug:id/image_view_more_option']")).click(); //Clicked on More button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='View IDN Profile']")).click();//Clicked on View IDN Profile
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@content-desc='Navigate up']")).click();// Clicked on back
		Thread.sleep(3000);
		//There should be requests pending to withdraw
		/*
		driver.findElement(By.xpath("//*[@text='Withdraw Invite']")).click();//Clicked on Withdraw request
		Thread.sleep(3000);
		*/
		driver.findElement(By.xpath("//*[@content-desc='Navigate up']")).click();// Clicked on back
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Search from all connections']")).sendKeys("Prasad");//Clicked on Search from all connections
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='View IDN Profile']")).click();//Clicked on View IDN Profile
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@content-desc='Navigate up']")).click();// Clicked on back
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@content-desc='Navigate up']")).click();// Clicked on back
		Thread.sleep(3000);
	
		
		
		
		
	
	}
	}