package com.ice.crmAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orange {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanvi\\eclipse-workspace\\ice_crm_automation\\chromedriver.exe");
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		 
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		 Thread.sleep(5000);
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 
		 driver.findElement(By.xpath("//button[@type='submit']")).submit();
		 Thread.sleep(5000);
		 String UrlLink=driver.getCurrentUrl();
		 System.out.println(UrlLink);
		 String DashboardText=driver.findElement(By.xpath("//span[text()='Dashboard']")).getText();
		 
		 if(DashboardText.equals("Dashboard"))
		 {
			 System.out.println("Home page display successfully"); 
		 }
		 else
		 {
			 throw new Exception("Login failed");
			// System.out.println("Login failed");
		 }
		
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(5000);
	     WebElement resetbutton =driver.findElement(By.xpath("//button[@type='reset']"));
	     
	     if(resetbutton.isDisplayed())
	     {
	    	 System.out.println("You are in PIM module");
	     }
	     else
	    	 throw new Exception("Not in PIM module");
		
		WebElement select=driver.findElement(By.xpath("//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']"));
	    select.click();
	    
		if(select.isSelected())
		{
		System.out.println("select you selected element");
		}
		
		driver.findElement(By.xpath("//p[text()='gayatri tatineni']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin");
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
		}	
		
	}