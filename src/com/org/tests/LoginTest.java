package com.org.tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.org.base.TestBase;
import com.org.pages.HomePage;
import com.org.pages.LoginPage;
import com.org.utility.TestUtil;


public class LoginTest extends TestBase{
	
LoginPage logpag ;
HomePage home;

	public LoginTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		TestBase.initialization();
		logpag = new LoginPage();
	}
	
	@Test(priority = 1)
	public void add_mem()
	{
	logpag.add_mem_click();
	}
	
	@Parameters({ "ivs_bob", "illumination" })
	@Test(priority = 2)
	public void already_mem(String user, String passwd)
	{
	logpag.already_mem_click();
	Boolean var = logpag.login(user,passwd);
	Assert.assertTrue(var);
	}
	@Test(priority = 3)
	public void add_course()
	{
	
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
}
