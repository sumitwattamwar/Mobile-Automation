package com.orators_society.debug;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Contact_Us extends BaseClass {

	public static void contactUs() throws InterruptedException {
		// TODO Auto-generated method stub

		Thread.sleep(4000);
		driver.findElementByXPath("//*[@content-desc='Menu']").click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Contact Us\"));");
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.TextView[@text='Contact Us']").click(); 
		Thread.sleep(4000);
		driver.findElementByXPath("//*[@content-desc='Navigate up']").click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));



	}

}
