package com.boombolt.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegLogPage extends BasePage
{
	WebDriver driver;
	
	public AccountRegLogPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement regButton;
	
	@FindBy(id="username")
	WebElement logusername;
	
	@FindBy(id="password")
	WebElement logpass;
	
	@FindBy(id="rememberme")
	WebElement logrem;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Lost your password?']")
	WebElement forgotPass;
	
	@FindBy(id="reg_username")
	WebElement regusername;
	
	@FindBy(id="reg_email")
	WebElement regemail;
	
	@FindBy(id="reg_password")
	WebElement regpass;
	
	@FindBy(xpath="//input[@name='register']")
	WebElement regBtn;
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement homeButton;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement logButton;
	
	public void registerButton()
	{
		regButton.click();
	}
	
	public void registerUsername(String username)
	{
		regusername.sendKeys(username);
	}
	
	public void registerEmail(String email)
	{
		regemail.sendKeys(email);
	}
	
	public void registerPass(String password)
	{
		regpass.sendKeys(password);
	}
	
	public void registerSubmit()
	{
		regBtn.click();
	}
	
	public void homeButton()
	{
		homeButton.click();
	}
}
