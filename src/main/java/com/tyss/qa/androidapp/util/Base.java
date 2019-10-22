package com.tyss.qa.androidapp.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.tyss.qa.androidapp.Initialize.GlobalVariables;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base extends GlobalVariables{
	//public DesiredCapabilities cap;
	@BeforeClass
	
	public void desiredcap() throws FileNotFoundException, IOException
	{
		init();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability(MobileCapabilityType.UDID, capability.getProperty("UDID"));
		//cap.setCapability("app",capability.getProperty("app"));
		cap.setCapability("appPackage",capability.getProperty("appPackage"));
		cap.setCapability("appActivity",capability.getProperty("appActivity"));
		cap.setCapability("noReset",false);
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	}
	
	public void init() throws FileNotFoundException, IOException
	{
		capability.load(new FileInputStream("C:\\Users\\TYSS\\Desktop\\appium\\AndroidFramework\\src\\main\\resources\\Capability.properties"));
		elements.load(new FileInputStream("C:\\Users\\TYSS\\Desktop\\appium\\AndroidFramework\\src\\main\\resources\\Elements.properties"));
	}
}
