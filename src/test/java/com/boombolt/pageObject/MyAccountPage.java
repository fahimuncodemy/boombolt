package com.boombolt.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

WebDriver driver;
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//a[text()='Dashboard']")
	WebElement Dashboard;
	
	@FindBy(xpath="//a[text()='Pre-Orders']")
	WebElement Pre_orders;
	
	@FindBy(xpath="//a[text()='Coupons']")
	WebElement Coupons;
	
	@FindBy(xpath="//a[text()='Orders']")
	WebElement Orders;
	
	@FindBy(xpath="//a[text()='Addresses']")
	WebElement Addresses;
	
	@FindBy(xpath="//a[text()='Account details']")
	WebElement AccDetails;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement LogoutBtn;
	
	@FindBy(xpath="//div[@class='user-info']/span")
	WebElement ProfileMsg;
	
	public void dash()
	{
		Dashboard.click();
	}
	
	public void pre_order()
	{
		Pre_orders.click();
	}
	
	public void coupons()
	{
		Coupons.click();
	}
	
	public void orders()
	{
		Orders.click();
	}
	
	public void addresses()
	{
		Addresses.click();
	}
	
	public void accDetails()
	{
		AccDetails.click();
	}
	
	public void logoutbtn()
	{
		LogoutBtn.click();
	}
	
	public String profileMsg()
	{
		return ProfileMsg.getText();
	}
	
}
