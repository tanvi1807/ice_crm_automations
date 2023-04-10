package com.ice.crmAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ice_crm_automation.utility.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//navigate to the website with the use of webdrivermanager
		WebDriverManager.firefoxdriver().setup();//set the driver of the browser
		WebDriver driver =new FirefoxDriver();//instance of firefox browser
		driver.get("https://tutorialshut.com/demo-website-for-selenium-automation-practic e/ ");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("alert('alert box');");
		
		Alert alert =driver.switchTo().alert();
		alert.accept();
		
		js.executeScript("prompt('hello');");
		alert.accept();
		 driver.close();
}
}
