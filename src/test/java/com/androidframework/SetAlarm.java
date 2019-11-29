package com.androidframework;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.tyss.qa.androidapp.library.ListenersLib;
import com.tyss.qa.androidapp.util.Base;
import com.tyss.qa.androidapp.util.GenericMethods;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Connection;

@Listeners(ListenersLib.class)
public class SetAlarm extends Base{
	@Test
	public void alarm() throws InterruptedException
	{
		Thread.sleep(2000);
		GenericMethods.click(driver, "alarm");
		Thread.sleep(2000);
		GenericMethods.click(driver, "alarmplus");
		Thread.sleep(2000);
		GenericMethods.click(driver, "entertime");
		Thread.sleep(2000);
		GenericMethods.findingElement(driver, "hour").clear();
		Thread.sleep(1000);
		GenericMethods.sendData(driver, "hour","5");
		Thread.sleep(2000);
		GenericMethods.findingElement(driver, "minute").clear();
		Thread.sleep(1000);
		GenericMethods.sendData(driver, "minute", "45");
		Thread.sleep(2000);
		GenericMethods.click(driver, "okbtn");
		Dimension d = driver.manage().window().getSize();
		TouchAction t=new TouchAction((MobileDriver)driver);
		
		
	}

}
