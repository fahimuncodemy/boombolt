package com.boombolt.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAcc_Addresses extends BasePage{

WebDriver driver;
	
	public MyAcc_Addresses(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//header[@class='woocommerce-Address-title title']/a")
	List<WebElement> AddAddress;
	
	public void addBilling()
	{
		AddAddress.get(0).click();
	}
	
	public void addShipping()
	{
		AddAddress.get(1).click();
	}
}
