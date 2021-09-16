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

public class Account_Setting {

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
		dc.setCapability("appPackage", "com.healthpole.dentists");
		dc.setCapability("appActivity", "com.healthpole.doctors.social.views.activities.SplashActivity");
		dc.setCapability(MobileCapabilityType.NO_RESET, true);

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), dc);

		System.out.println("Session- App started");

		//driver.findElement(By.xpath("(//android.widget.LinearLayout)[2]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(("//*[@content-desc='Menu']"))).click(); // Click on menu
		Thread.sleep(4000);
		// Scroll vertically from bottom to top
		org.openqa.selenium.Dimension dimension = driver.manage().window().getSize();
		int start_x1 = (int) (dimension.width * 0.5);
		int start_y1 = (int) (dimension.height * 0.9);
		int end_x1 = (int) (dimension.width * 0.5);
		int end_y1 = (int) (dimension.height * 0.2);

		TouchAction touch1 = new TouchAction(driver);
		touch1.press(PointOption.point(start_x1, start_y1))

				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x1, end_y1))
				.release().perform();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Account Settings']")).click();// Clicked on Account setting
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='General']")).click();// Click on General
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@resource-id='com.healthpole.dentists:id/layout_name']")).click();// Clicked on
																											// Name
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@resource-id='com.healthpole.dentists:id/edit_text_first_name']"))
				.sendKeys("Paddy");
		Thread.sleep(3000); //
		driver.findElement(By.xpath("//*[@resource-id='com.healthpole.dentists:id/edit_text_middle_name']"))
				.sendKeys("Pradip");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@resource-id='com.healthpole.dentists:id/edit_text_lase_name']"))
				.sendKeys("Dhumal-Patil");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@content-desc='Navigate up']")).click();// Clicked on back
		Thread.sleep(3000);

		///// Password///

		driver.findElement(By.xpath("//*[@text='Password']")).click();//click on password

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@text='Current Password']")).sendKeys("9764790479");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='New Password']")).sendKeys("9764790479");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Re-type New Password']")).sendKeys("9764790479");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='SUBMIT']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@content-desc='Navigate up']")).click();// Clicked on back
		Thread.sleep(3000);

	}
}