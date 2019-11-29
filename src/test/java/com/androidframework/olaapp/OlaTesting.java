package com.androidframework.olaapp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class OlaTesting {

	public static void main(String[] args) throws MalformedURLException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
		AppiumServiceBuilder builder=new AppiumServiceBuilder();
		builder.withIPAddress("127.0.0.1");
		AppiumDriverLocalService appium=AppiumDriverLocalService.buildService(builder);
		appium.start();
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto e3 power");
		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		cap.setCapability(MobileCapabilityType.NO_RESET, "true");
		cap.setCapability("appPackage", "com.google.android.apps.maps");
		cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Search here']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Search here']")).sendKeys("Test yantra software solutions");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
