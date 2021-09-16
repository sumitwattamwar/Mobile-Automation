package com.dns.apk.debug;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.How;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidBy;

public class Post_With_Image_From_Gallery {

	static AppiumDriver<MobileElement> driver;


	public static void main(String[] args )

	{
		try {
			openDNS_prod ();
		} catch (Exception e) {

			System.out.println(e.getCause() );
			System.out.println(e.getMessage());

			e.printStackTrace();
		}
	}

	public static void openDNS_prod () throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability("deviceName","PaddyEmulator");
		dc.setCapability("udid","emulator-5554");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("appPackage", "com.healthpole.dentists");
		dc.setCapability(  "appActivity","com.healthpole.doctors.social.views.activities.SplashActivity");


		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		  AndroidDriver <AndroidElement> driver=new  AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dc);


		System.out.println("Session- App started");
		
Thread.sleep(1000);
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout")).click(); //Flash walkt horough messgaes
Thread.sleep(1000);
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout")).click();//Flash walkt horough messgaes
Thread.sleep(1000);
driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView").click();//Click on post something here
Thread.sleep(1000);
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridLayout/android.view.ViewGroup[1]")).click();//Click on Write a Post
Thread.sleep(1000);
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")).click(); //Click on post something here
Thread.sleep(1000);
driver.findElement(By.id("com.healthpole.dentists:id/edit_text_description")).sendKeys("Dentistry is often also understood to subsume the now largely defunct medical specialty of stomatology (the study of the mouth and its disorders and diseases) for which reason the two terms are used interchangeably in certain regions"); //Description input
Thread.sleep(1000);
driver.findElement(By.id("com.healthpole.dentists:id/button_text")).click();// Click on +Add media
Thread.sleep(1000);
driver.findElement(By.id("com.healthpole.dentists:id/layout_add_photos")).click(); //CLicked on Add from gallery
Thread.sleep(1000);
driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click(); //Allow permission to access gallery
Thread.sleep(3000);
driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Photo taken on May 4, 2021 6:33:37 PM\"]")).click(); //Select photo from gallery with right mark
Thread.sleep(3000);
driver.findElement(By.id("com.google.android.apps.photos:id/photos_overflow_icon")).click(); //Done button after selecting photo
Thread.sleep(1000);




driver.findElement(By.id("com.healthpole.dentists:id/action_publish")).click(); //Done button
Thread.sleep(1000);
driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout")).click();
Thread.sleep(1000);
driver.findElement(By.id("com.healthpole.dentists:id/action_done")).click();//Publish->final Done






		
		
	}
}



