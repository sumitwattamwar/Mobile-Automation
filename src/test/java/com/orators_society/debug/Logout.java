package com.orators_society.debug;
import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Logout extends BaseClass {

	public static void logout() throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@content-desc='Menu']").click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Logout\"));");
		Thread.sleep(3000);
        driver.findElementByXPath("//android.widget.TextView[@text='Logout']").click(); 
		Thread.sleep(2000);
        driver.findElementByXPath("//android.widget.TextView[@text='Cancel']").click(); //cancel
        Thread.sleep(3000);
		driver.findElementByXPath("//*[@content-desc='Menu']").click();
		Thread.sleep(3000);
        driver.findElementByXPath("//android.widget.TextView[@text='Logout']").click(); 
		Thread.sleep(2000);
        driver.findElementByXPath("//android.widget.TextView[@text='Logout']").click(); 

	}

}
