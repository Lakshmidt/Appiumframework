package com.tyss.qa.androidapp.util;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class ScreenActions extends GenericMethods {
	
	
	public static void longPressAction(AndroidDriver driver,String elementKey)
	{
		TouchAction ta=new TouchAction((MobileDriver)driver);
		WebElement ele = findingElement(driver, elementKey);
		ta.longPress(ele).perform();
	}
	public static void longPressAction(AndroidDriver driver,int x,int y)
	{
		Dimension d = driver.manage().window().getSize();
		TouchAction ta=new TouchAction((MobileDriver)driver);
		ta.longPress(d.width*x, d.height*y).perform();
	}
	public static void longPressAction(AndroidDriver driver,String elementKey,int x,int y,int duration)
	{
		TouchAction ta=new TouchAction((MobileDriver)driver);
		Dimension d = driver.manage().window().getSize();
		WebElement ele = findingElement(driver, elementKey);
		ta.longPress(ele, x, y, duration).perform();
	}
	public static void longPressAction(AndroidDriver driver,String elementKey,int duration)
	{
		TouchAction ta=new TouchAction((MobileDriver)driver);
		Dimension d = driver.manage().window().getSize();
		WebElement ele = findingElement(driver, elementKey);
		ta.longPress(ele, duration).perform();
	}
	public static void dragAndDrop(AndroidDriver driver,String elementKey1,String elementKey2,int duration)
	{
		TouchAction ta=new TouchAction((MobileDriver)driver);
		WebElement ele1 = findingElement(driver, elementKey1);
		WebElement ele2 = findingElement(driver, elementKey2);
		ta.longPress(ele1).moveTo(ele2).waitAction(duration).perform();
	}
	public static void multiTouch(AndroidDriver driver,TouchAction action1,TouchAction action2)
	{
		MultiTouchAction mt=new MultiTouchAction((MobileDriver)driver);
		mt.add(action1).add(action2).perform();
	}
	public static void tap(AndroidDriver driver,int x,int y)
	{
		TouchAction ta=new TouchAction((MobileDriver)driver);
		Dimension d = driver.manage().window().getSize();
		ta.tap(d.width*x, d.height*y);
	}
	public static void tap(AndroidDriver driver,String elementKey)
	{
		TouchAction ta=new TouchAction((MobileDriver)driver);
		WebElement ele = findingElement(driver, elementKey);
		ta.tap(ele);
	}
	public static void tap(AndroidDriver driver,String elementKey,int x,int y)
	{
		TouchAction ta=new TouchAction((MobileDriver)driver);
		WebElement ele = findingElement(driver, elementKey);
		Dimension d = driver.manage().window().getSize();
		ta.tap(ele, d.width*x, d.height*y);
	}
}
