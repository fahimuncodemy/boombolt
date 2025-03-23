package com.boombolt.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.boombolt.pageObject.AccountRegLogPage;
import com.boombolt.pageObject.MyAccountPage;
import com.github.javafaker.Faker;

public class TC_Register extends BaseClass{

	@Test
	public void account_Reg()
	{
		AccountRegLogPage arlp= new AccountRegLogPage(driver);
		MyAccountPage map= new MyAccountPage(driver);
		Faker fake= new Faker();
		
		String username=fake.name().username();
		String email=fake.internet().emailAddress();
		String password= fake.internet().password();
		
		arlp.registerButton();
		arlp.registerUsername(username);
		arlp.registerEmail(email);
		arlp.registerPass(password);
		arlp.registerSubmit();
		
		System.out.println(username+"\t"+email+"\t"+password);
		
		Assert.assertTrue(map.profileMsg().contains(username));
		
		
	}
	
	
}
