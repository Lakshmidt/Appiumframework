package com.tyss.qa.androidapp.util;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.ElementScrollBehavior;

import com.aventstack.extentreports.Status;
import com.tyss.qa.androidapp.library.ReportsLib;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class GenericMethods extends Base{
	static By by;
	
	public static WebElement findingElement(AndroidDriver driver,String elementKey)
	{
		String element=elements.getProperty(elementKey);
		
		String[] ele=element.split("->");
		if(ele[0].equalsIgnoreCase("id"))
		{
			by=By.id(ele[1]);
		}
		else if(ele[0].equalsIgnoreCase("name"))
		{
			by=By.name(ele[1]);
		}
		else if(ele[0].equalsIgnoreCase("classname"))
		{
			by=By.className(ele[1]);
		}
		else if(ele[0].equalsIgnoreCase("tagname"))
		{
			by=By.tagName(ele[1]);
		}
		else if(ele[0].equalsIgnoreCase("linktext"))
		{
			by=By.linkText(ele[1]);
		}
		else if(ele[0].equalsIgnoreCase("partiallinktext"))
		{
			by=By.partialLinkText(ele[1]);
		}
		else if(ele[0].equalsIgnoreCase("cssselector"))
		{
			by=By.cssSelector(ele[1]);
		}
		else if(ele[0].equalsIgnoreCase("xpath"))
		{
			by=By.xpath(ele[1]);
		}
		try {
			System.out.println(by);
			return driver.findElement(by);
		}
		catch(NoSuchElementException e)
		{
			System.out.println(by);
			ReportsLib.testlog.log(Status.INFO,"Element not found");
			return null;
		}
		
	}
	
	public static List<WebElement> findingElements(AndroidDriver driver,String elementKey)
	{
		String element=elements.getProperty(elementKey);
		
		String[] ele=element.split("->");
		if(ele[0].equalsIgnoreCase("id"))
		{
			by=By.id(ele[1]);
		}
		else if(ele[0].equalsIgnoreCase("name"))
		{
			by=By.name(ele[1]);
		}
		else if(ele[0].equalsIgnoreCase("classname"))
		{
			by=By.className(ele[1]);
		}
		else if(ele[0].equalsIgnoreCase("tagname"))
		{
			by=By.tagName(ele[1]);
		}
		else if(ele[0].equalsIgnoreCase("linktext"))
		{
			by=By.linkText(ele[1]);
		}
		else if(ele[0].equalsIgnoreCase("partiallinktext"))
		{
			by=By.partialLinkText(ele[1]);
		}
		else if(ele[0].equalsIgnoreCase("cssselector"))
		{
			by=By.cssSelector(ele[1]);
		}
		else if(ele[0].equalsIgnoreCase("xpath"))
		{
			by=By.xpath(ele[1]);
		}
		try {
			return driver.findElements(by);
		}
		catch(NoSuchElementException e)
		{
			ReportsLib.testlog.log(Status.INFO,"Element not found");
			return null;
		}
		
	}
	
	public static void click(AndroidDriver driver,String elementKey)
	{
		
		findingElement(driver, elementKey).click();
		//ReportsLib.testlog.log(Status.INFO,"Element is not clicked");
	}
	
	public static void sendData(AndroidDriver driver,String elementKey,String data)
	{
		findingElement(driver, elementKey).sendKeys(data);
		//ReportsLib.testlog.log(Status.INFO,"unable to send data");
	}
	public static String  getText(AndroidDriver driver,String elementKey)
	{
		if(findingElement(driver, elementKey).getText()==null) {
			return findingElement(driver, elementKey).getText();
		}
		else
		{
			ReportsLib.testlog.log(Status.INFO,"unable to get the text");
			return null;
		}
		
	}
	public static void swipeDownorUP(AndroidDriver driver,int duration,int startX,int startY,int endY)
	{
		Dimension d = driver.manage().window().getSize();
		driver.swipe(d.width*startX, d.height*startY, d.width*startX, d.height*endY, duration);
	}
	public static void swipeRightorLeft(AndroidDriver driver,int duration,int startX,int startY,int endX)
	{
		Dimension d = driver.manage().window().getSize();
		driver.swipe(d.width*startX, d.height*startY, d.width*endX, d.height*startY, duration);
	}
	
	public static boolean isAppInstalled(AndroidDriver driver,String appPackage)
	{
		return driver.isAppInstalled(appPackage);
	}
	
}
