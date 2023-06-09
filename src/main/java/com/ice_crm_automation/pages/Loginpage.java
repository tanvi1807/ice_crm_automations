package com.ice_crm_automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ice_crm_automation.utility.BaseClass;

public class Loginpage extends BaseClass {

	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}

	// Declare all the locators
	By username = By.name("username");
	By password = By.name("password");
	By loginButton = By.xpath("//button[contains(text(), 'Log in')]");
	By restPasswordLink = By.xpath("//a[contains(text(),'Reset Password')]");
	public By errorMsg = By.xpath("//div[contains(@class, 'alert-danger')]");

	public void login(String username, String password) {
		entertext(this.username, username);
		entertext(this.password, password);
		click(loginButton);
	}

//    @FindBy(name = "username")
//    public WebElement username;
//
//    @FindBy(name = "password")
//    public WebElement password;
//
//    @FindBy(xpath = "//button[contains(text(), 'Log in')]")
//    public WebElement loginButton;
//    public loginpage(WebDriver driver){
//        PageFactory.initElements(driver,this);
//    }

//    	 this.username.sendKeys(username);
//         this.password.sendKeys(password);
//         this.loginButton.click();
////     
}

