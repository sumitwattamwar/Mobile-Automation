//verified in ui automator
package com.drs.apk;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.drs.apk.BaseClass;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Presentation extends BaseClass

{




	@Test
	static void Presentation() throws InterruptedException
	{


		Thread.sleep(8000);
		driver.findElement(By.xpath("//android.widget.LinearLayout[@index='4']")).click();//menu

		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.view.ViewGroup[contains(@resource-id,'item_profile_menu')]")).click();//View_profile

		Thread.sleep(6000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'button_edit_profile')]")).click(); //edit profile




		Thread.sleep(6000);
		Thread.sleep(100);
		util.VScroll();

		Thread.sleep(100);
		util.VScroll();

		Thread.sleep(100);
		util.VScroll();

		Thread.sleep(100);
		util.VScrollmin();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='+Add' and (./preceding-sibling::* | ./following-sibling::*)[@text='Presentation']]")).click();//Add 


		driver.navigate().back();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='Presentation Title']")).clear(); //Auther 1


		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='Presentation Title']")).sendKeys("Presentation"); //Auther 1



		Thread.sleep(1000);


		driver.findElement(By.xpath("//*[@text='Presented At']")).sendKeys("pune"); //Presented At


		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='Presentation Year']")).sendKeys("2020"); //year to


		Thread.sleep(1000);


		driver.findElement(By.xpath("//*[@text='Brief Description']")).sendKeys("It is my presentation"); //Brief Description to

		driver.navigate().back();


		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@text='Link']")).clear();
		driver.findElement(By.xpath("//*[@text='Link']")).sendKeys("www.Itismypresentation.com"); //link






		driver.findElement(By.xpath("//*[@text='button_save']")).click(); //save
		Thread.sleep(1000);

		//driver.findElement(By.xpath("//*[@id='button_cancel']")).click(); //cancel

		//driver.findElement(By.xpath("//*[@contentDescription='Navigate up']")).click();//back
		Reporter.log("Presentation Added succceessfully",true);
	}
}
