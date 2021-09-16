package com.orators_society.debug;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Email_Us extends BaseClass {

	public static void EmailUs() throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread.sleep(4000);
		driver.findElementByXPath("//*[@content-desc='Menu']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.TextView[@text='Email Us']").click(); 
		Thread.sleep(4000);
		
// Before doing this step you have to set always in your device after click on email us	
	    driver.pressKey(new KeyEvent(AndroidKey.BACK));



	}

}
