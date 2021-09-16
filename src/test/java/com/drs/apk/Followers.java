package com.drs.apk;
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

public class Followers {

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
		dc.setCapability("appPackage", "com.healthpole.dentists.debug");
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
		  
		  driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Menu\"]/android.widget.LinearLayout/android.widget.FrameLayout")).click();//Clicked on menu
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView")).click(); //Clicked on followers
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView")).click();// Unfollow button
		  
		  
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();//Back arrow button on followers page

		  Thread.sleep(1000);
		  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView")).click();
		  
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView")).click();//+Follow button
		  


		
	}
}