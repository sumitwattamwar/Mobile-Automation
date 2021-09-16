package com.drs.apk;

import java.time.Duration;

import javax.naming.Context;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class util extends BaseClass {

	//Scrolling Vertically up 160%
		public static void VScroll() throws InterruptedException
		{
			Thread.sleep(3000);
			Dimension dimension = driver.manage().window().getSize();

			int start_x = (int) (dimension.width*0.5);
			int start_y = (int) (dimension.height*0.9);

			int end_x = (int) (dimension.width*0.5);
			int end_y = (int) (dimension.height*0.1);

			TouchAction touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x,start_y))

			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
			.moveTo(PointOption.point(end_x, end_y)).release().perform();
		}
	
	//Scrolling Vertically up 
	public static void VScrollmin() throws InterruptedException
	{
		Thread.sleep(3000);
		Dimension dimension = driver.manage().window().getSize();

		int start_x = (int) (dimension.width*0.5);
		int start_y = (int) (dimension.height*0.7);

		int end_x = (int) (dimension.width*0.5);
		int end_y = (int) (dimension.height*0.2);

		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x,start_y))

		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(end_x, end_y)).release().perform();
	}

	//Scrolling Vertically down in popup
		public static void PopScroller() throws InterruptedException
		{
			Thread.sleep(3000);
			Dimension dimension = driver.manage().window().getSize();

			int start_x = (int) (dimension.width*0.70);
			int start_y = (int) (dimension.height*0.5);

			int end_x = (int) (dimension.width*0.70);
			int end_y = (int) (dimension.height*0.53);

			TouchAction touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x,start_y))

			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
			.moveTo(PointOption.point(end_x, end_y)).release().perform();
		}
	
	//Back
		public static void back()
		{
			((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.BACK));
			
		}
		
	
		//HOME
		public static void home()
		{
			((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.HOME));
			
		}
		

	
	
	
	

//Scrolling Horizontally right to left of screen
	public void HScroll() throws InterruptedException
	{
		Thread.sleep(3000);
		Dimension dimension = driver.manage().window().getSize();
		int start_x1 = (int) (dimension.width*0.80);
		int start_y1 = (int) (dimension.height*0.5);

		int end_x1 = (int) (dimension.width*0.20);
		int end_y1 = (int) (dimension.height*0.5);

		TouchAction touch1 = new TouchAction(driver);
		touch1.press(PointOption.point(start_x1,start_y1))

		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(end_x1, end_y1)).release().perform();
		
	}

	
	public static void VScrollmiddle() throws InterruptedException
	{
		Thread.sleep(3000);
		Dimension dimension = driver.manage().window().getSize();

		int start_x = (int) (dimension.width*0.5);
		int start_y = (int) (dimension.height*0.5);

		int end_x = (int) (dimension.width*0.5);
		int end_y = (int) (dimension.height*0.2);

		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x,start_y))

		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(end_x, end_y)).release().perform();
	}
	
	
	
	public static void  VerticalScroll()
	{
		
		
	
	//capturing all elements in list
		AndroidElement list=(AndroidElement)driver.findElement(By.xpath("//class[@resource-id='com.healthpole.doctors.debug:id/text_view_edit']"));
		  
		             
	//VerticalScroll upto element  
		
		MobileElement listitem = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new Uiscrollable(new Uiselector()).scrollIntoView("+"new UiSelector().description(\"Presentation\"));"));
		
		
		System.out.println(listitem.getLocation());
		listitem.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	

