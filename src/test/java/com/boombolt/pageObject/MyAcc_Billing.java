package com.boombolt.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAcc_Billing extends BasePage{

WebDriver driver;
	
	public MyAcc_Billing(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="billing_first_name")
	WebElement First_Name;
	
	@FindBy(id="billing_last_name")
	WebElement Last_Name;
	
	@FindBy(id="billing_company")
	WebElement BillComOpt;
	
	@FindBy(id="select2-billing_country-result-qkr7-IN")
	WebElement India;
	
	@FindBy(id="select2-billing_country-container")
	WebElement CountryDrop;
	
	@FindBy(id="billing_address_1")
	WebElement Address_1;
	
	@FindBy(id="billing_address_2")
	WebElement Address_2opt;
	
	@FindBy(id="billing_city")
	WebElement AddCity;
	
	@FindBy(id="select2-billing_state-container")
	WebElement StateDrop;
	
	@FindBy(id="select2-billing_state-result-z9ta-MH")
	WebElement Maharashtra;
	
	@FindBy(id="billing_postcode")
	WebElement PinCode;
	
	@FindBy(id="billing_phone")
	WebElement PhoneNo;
	
	@FindBy(xpath="//button[text()='Save address']")
	WebElement SaveAdd;
	
//	public void firstName(String firstname)
//	{
//		First_Name.sendKeys(username);
//	}
//	
//	public void lastName(String lastname)
//	{
//		Last_Name.sendKeys(username);
//	}
//	
//	public void registerUsername(String username)
//	{
//		regusername.sendKeys(username);
//	}
}
