package com.androidframework;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.tyss.qa.androidapp.library.ListenersLib;
import com.tyss.qa.androidapp.util.Base;

@Listeners(ListenersLib.class)
public class Zomatolauch extends Base {
	
	@Test
	public void launch() throws InterruptedException
	{
		Thread.sleep(5000);
		hpage.clickonLocation();
		Thread.sleep(5000);
		hpage.selectCurrentLocation();
		Thread.sleep(5000);
		hpage.clickSearch();
		Thread.sleep(5000);
		hpage.searchrestaurant("Roti");
		Thread.sleep(5000);
		hpage.selectRotighar();
		Thread.sleep(2000);
		hpage.selectitem();
		Thread.sleep(2000);
		hpage.viewcart();
		Thread.sleep(2000);
		hpage.payment();
		Thread.sleep(2000);
		hpage.selectgPay();
		Thread.sleep(2000);
		hpage.placeorder();
		
	}

}
