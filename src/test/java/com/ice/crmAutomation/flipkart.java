package com.ice.crmAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class flipkart {

	

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.edge.driver", "C:\\Users\\tanvi\\eclipse-workspace\\ice_crm_automation\\msedgedriver.exe");
				WebDriver driver1=new EdgeDriver();
			driver1.navigate().to("https://www.flipkart.com/");		
	
driver1.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();















//fashion
//driver1.findElement(By.xpath("//div[@class='_37M3Pb']/div[3]/a/div/div/img)")).click();






////mobile
driver1.findElement(By.xpath(" //div[text()='Mobiles']")).click();
driver1.navigate().back();


////grocery
driver1.findElement(By.xpath(" //div[text()='Grocery']")).click();

driver1.navigate().refresh();

driver1.navigate().forward();

driver1.navigate().back();

//driver1.findElement(By.xpath(" //div[text()='Mobiles']")).click();


//chromedriver
//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanvi\\eclipse-workspace\\ice_crm_automation\\chromedriver.exe");
//			WebDriver driver1=new ChromeDriver();
//			
//			driver1.navigate().to("https://www.flipkart.com/");
//			
//			
//driver1.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//
//driver1.navigate().refresh();
//driver1.navigate().back();
//driver1.navigate().forward();



	}

}