//verified

package com.drs.apk;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Post_Job extends BaseClass  {
	@Test
    static void Edit_Bio() throws InterruptedException
    {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Post something here')]")).click();//post something
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Post Job')]")).click();//Post Job
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_text_job_title')]")).sendKeys("Appium Job Post");//title
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'text1')]")).click();//job type
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text,'Full Time')]")).click();//job type-full time
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Job description')]")).sendKeys("Job desc");//Job desc
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Experience Required')]")).sendKeys("2 years");//exp
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Degree Required')]")).sendKeys("BE");//Degre
		
		
		util.VScroll();
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Minimum (Rs.)')]")).sendKeys("2000");//min sal
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Maximum (Rs.)')]")).sendKeys("200000");//max sal
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'text1')]")).click();//Time dropdown
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text,'Per Month')]")).click();//per month
		
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Address Line1')]")).sendKeys("Appium Here");//job address
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Address Line2')]")).sendKeys("Appium Here");//job address2
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'City')]")).sendKeys("jintur");//city
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'NEXT')]")).click();
		
		
		
		//Recruiter Details
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Recruiter Name')]")).sendKeys("Appium recruiter");//job recruiter
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Recruiter Phone')]")).sendKeys("8421222768");//job recruiter phone
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Recruiter WhatsApp')]")).sendKeys("8421222768");//job recruiter wp no
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Recruiter Email')]")).sendKeys("ssw@gmail.com");//job recruiter email
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Recruiter Description')]")).sendKeys("App");//job recruiter Desc
		
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'NEXT')]")).click();//next
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'All Specialities')]")).click();//tag all spec
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'PUBLISH')]")).click();//publish
		Thread.sleep(2000);
		
		
         Reporter.log("Successfully posted job",true);
    }
}
