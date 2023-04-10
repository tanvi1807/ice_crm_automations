package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ice_crm_automation.utility.BaseClass;

public class orangehrmloginpage extends BaseClass
{

	By username= By.name("username");
	By password= By.name("password");
	By loginButton= By.xpath("//button[@type='submit']");
	
	public orangehrmloginpage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void login (String username,String password)
	{
		entertext(this.username,username);
		entertext(this.password,password);
		click(loginButton);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
}
