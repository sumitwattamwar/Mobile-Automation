package com.drs.apk;

import org.openqa.selenium.By;

public class Xpaths extends BaseClass
{
	
	public static void xpath ()
	{
		driver.findElement(By.xpath("//class[@resource-id='']"));
		
		driver.findElement(By.xpath("//class[@text='']"));
		
		driver.findElement(By.xpath("//class[@index='']"));
		
		//efficient
		driver.findElement(By.xpath("//class[contains(@resource-id,'id')]"));
	}

}
