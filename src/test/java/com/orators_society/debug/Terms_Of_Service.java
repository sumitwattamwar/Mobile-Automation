package com.orators_society.debug;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Terms_Of_Service extends BaseClass {

	public static void TOS() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@content-desc='Menu']").click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Terms Of Service\"));");
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.TextView[@text='Terms Of Service']").click(); 
		Thread.sleep(4000);
		Dimension dimension = driver.manage().window().getSize();
		int start_x1 = (int) (dimension.width*0.5);
		int start_y1 = (int) (dimension.height*0.9);

		int end_x1 = (int) (dimension.width*0.5);
		int end_y1 = (int) (dimension.height*0.1);

		TouchAction touch1 = new TouchAction(driver);
		touch1.press(PointOption.point(start_x1,start_y1))

		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(end_x1, end_y1)).release().perform();

		driver.findElementByXPath("//*[@content-desc='Navigate up']").click();

	}

}
