package com.androidframework;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.tyss.qa.androidapp.library.ListenersLib;
import com.tyss.qa.androidapp.util.Base;
import com.tyss.qa.androidapp.util.GenericMethods;

@Listeners  (ListenersLib.class)
public class SetTimer extends Base{
	
	@Test
	public void timer() throws InterruptedException
	{
		Thread.sleep(2000);
		GenericMethods.click(driver, "timer");
		Thread.sleep(2000);
		GenericMethods.click(driver, "key1");
		Thread.sleep(10000);
		GenericMethods.click(driver, "key0");
		Thread.sleep(2000);
		GenericMethods.click(driver, "startbtn");
		Thread.sleep(2000);
		
	}
}
