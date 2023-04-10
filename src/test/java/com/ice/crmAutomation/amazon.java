package com.ice.crmAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class amazon {

	public static void main(String[] args) {
	
//		// TODO Auto-generated method stub
		System.setProperty("webdriver.egde.driver","C:\\Users\\tanvi\\eclipse-workspace\\ice_crm_automation\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.navigate().to("https://www.amazon.in/");
		d.findElement(By.xpath("//a[text()='Best Sellers']")).click();
		d.navigate().refresh();
		d.navigate().back();
		d.navigate().forward();
		d.close();
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\tanvi\\eclipse-workspace\\ice_crm_automation\\chromedriver.exe");
//		WebDriver d = new ChromeDriver();
//		d.navigate().to("https://www.amazon.in/");
//		d.findElement(By.xpath("//a[text()='Best Sellers']")).click();
//		d.navigate().refresh();
//		d.navigate().back();
//		d.navigate().forward();
//		d.close();
	}

}
