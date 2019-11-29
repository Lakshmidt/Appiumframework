package com.androidframework;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumStartthroughJavaCode {

	public static void main(String[] args) throws InterruptedException {
	
		AppiumDriverLocalService appium=AppiumDriverLocalService.buildDefaultService();
		appium.start();
		Thread.sleep(1000);
	//	appium.stop();
		
		AppiumServiceBuilder builder=new AppiumServiceBuilder();
		builder.withIPAddress("127.0.0.1");
		builder.usingPort(4733);
		AppiumDriverLocalService appium1=AppiumDriverLocalService.buildService(builder);
		appium1.start();
		Thread.sleep(1000);
		//appium.stop();
		
	}
}
