package com.orators_society.debug;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Speech_Camera extends BaseClass {
	public static void SpeechCam() throws InterruptedException {

		Thread.sleep(6000);
		driver.findElementByXPath("//android.widget.Button[@text='Add Speech']").click(); 
		Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.EditText[@text='Speech Title']").sendKeys("Appium Speech Without Toastmaster");
		Thread.sleep(2000);
		driver.findElementById("com.cultivity.orators_society.debug:id/layout_button_add_images").click();
		Thread.sleep(2000);
		driver.findElementById("com.cultivity.orators_society.debug:id/option_capture_video").click();
		Thread.sleep(3000);
		driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();
		Thread.sleep(2000);
		driver.findElementById("com.android.camera2:id/bottom_bar").click();
		Thread.sleep(10000);
		driver.findElementById("com.android.camera2:id/shutter_button").click();
		Thread.sleep(4000);
		driver.findElementById("com.android.camera2:id/done_button").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.Button[@text='SAVE']").click(); 
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.TextView[@text='Publish Speech']").click();
		Thread.sleep(7000);

	}


}
