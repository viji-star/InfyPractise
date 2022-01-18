package com.org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.base.TestBase;

public class LoginPage extends TestBase{

	//PageFactory - Object Repository
	@FindBy(id="xpath path of add mem click button")
	WebElement add_mem_click_button;
	
	
	//PageFactory - Object Repository
		@FindBy(id="xpath path of already mem click button")
		WebElement already_mem_click_button;
		
	
		
		//PageFactory - Object Repository
		@FindBy(id="xpath path of username field")
		WebElement user_name;
		
		
		//PageFactory - Object Repository
			@FindBy(id="xpath path of password field")
			WebElement pswd_name;
			
			
	WebElement login_click = driver.findElement(By.id(""));
	
	WebElement signout = driver.findElement(By.id(""));
	
	
	@FindBy(id="xpath path of firstname field")
	WebElement first_name;
	
	@FindBy(id="xpath path of lastname field")
	WebElement last_name;
	
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	

	public void add_mem_click()
	{
		add_mem_click_button.click();
	}
	
	
	public void already_mem_click()
	{
		already_mem_click_button.click();
	}
	
	public Boolean login(String un, String pwd)
	{
	user_name.sendKeys(un);
	pswd_name.sendKeys(pwd);
	login_click.click();
	return  signout.isDisplayed();
	}
	
	
}

