package com.tyss.qa.androidapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class HomePage {
	//String name="Roti Ghar";
	@FindBy (xpath="//android.widget.TextView[@text='Your Location']")
	private WebElement location;
	
	@FindBy (xpath="//android.widget.TextView[@text='Use current location']")
	private WebElement currentlocation;
	
	@FindBy (id="com.application.zomato:id/et_final")
	private WebElement searchbar;
	
	@FindBy (xpath="//android.widget.EditText[@text='Search for restaurants, dishes...']")
	private WebElement searchele;
	
	@FindBy (xpath="//android.widget.TextView[@text='Roti Ghar']")
	private WebElement restaurant;

	@FindBy (xpath="//android.widget.TextView[@text='Fruit Salad']/../../..//android.widget.FrameLayout[@resource-id='com.application.zomato:id/stepper_menu_item']")
	private WebElement item;
	
	@FindBy (id="com.application.zomato:id/tv_view_cart")
	private WebElement viewcart;
	
	@FindBy (xpath="(//android.widget.TextView[@resource-id=\"com.application.zomato:id/title\"])[2]")
	private WebElement paymethod;
	
	@FindBy (xpath="//android.widget.TextView[@text='Google Pay']")
	private WebElement gpay;
	
	@FindBy (xpath="//android.widget.TextView[@text='Place Order']")
	private WebElement placeorder;
	
	public HomePage(AndroidDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickonLocation()
	{
		location.click();
	}
	public void selectCurrentLocation()
	{
		currentlocation.click();
	}
	public void clickSearch()
	{
		searchbar.click();
	}
	public void searchrestaurant(String name)
	{
		searchele.sendKeys(name);
	}
	public void selectRotighar()
	{
		restaurant.click();
	}
	public void selectitem()
	{
		item.click();
	}
	public void viewcart()
	{
		viewcart.click();
	}
	public void payment()
	{
		paymethod.click();
	}
	public void selectgPay()
	{
		gpay.click();
	}
	public void placeorder()
	{
		placeorder.click();
	}
}
