import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Speech_Gallery extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		Thread.sleep(6000);
		driver.findElementByXPath("//android.widget.Button[@text='Add Speech']").click(); 
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.EditText[@text='Speech Title']").sendKeys("Appium Speech Without Toastmaster");
		Thread.sleep(2000);
		driver.findElementById("com.cultivity.orators_society.debug:id/text_view").click();
		Thread.sleep(2000);
        driver.findElementByXPath("//android.widget.TextView[@text='Gallery']").click(); 
		Thread.sleep(3000);
		driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
		Thread.sleep(3000);
	    driver.findElementByXPath("//*[@content-desc='Show roots']").click();
	    Thread.sleep(3000);
	    driver.findElementsByClassName("android.widget.LinearLayout").get(2).click();  //Depends on device
   	    Thread.sleep(2000);
	    driver.findElementById("com.google.android.documentsui:id/icon_mime_sm").click();
        Thread.sleep(3000);
        driver.findElementByXPath("//android.widget.TextView[@text='VID-20210826-WA0000.mp4']").click(); 
        Thread.sleep(3000);
        driver.findElementByXPath("//android.widget.Button[@text='SAVE']").click(); 
        Thread.sleep(3000);
        driver.findElementByXPath("//android.widget.TextView[@text='Publish Speech']").click();
        Thread.sleep(7000);

	
		//driver.findElementByXPath("//*)



	}

}

