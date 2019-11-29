package com.tyss.qa.androidapp.Initialize;

import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.tyss.qa.androidapp.pages.HomePage;

import io.appium.java_client.android.AndroidDriver;

public class GlobalVariables {
	public AndroidDriver driver;
	public DesiredCapabilities cap=new DesiredCapabilities();
	public static final Properties capability=new Properties();
	public static final Properties 	elements=new Properties();
	//public final HomePage hpage=new HomePage(driver);
}
