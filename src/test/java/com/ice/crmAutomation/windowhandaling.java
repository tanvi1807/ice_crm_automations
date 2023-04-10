package com.ice.crmAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class windowhandaling
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.egde.driver","C:\\Users\\tanvi\\eclipse-workspace\\ice_crm_automation\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/");
		String pWindowId =driver.getWindowHandle();
		System.out.println(pWindowId);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@id='navSwmHoliday']/a")).click();
	Set<String> allIds=driver.getWindowHandles();
	System.out.println("Print all ids");
	for(String id :allIds) 
	{
	if(!id.equals(pWindowId )) 
	{
	System.out.println(id);	
	driver.switchTo().window(id);
	System.out.println("control switch from first tab to second tab");
	String secondTabTitle=driver.getTitle();
	System.out.println(secondTabTitle);
	driver.close();
	}
	}
	driver.switchTo().window(pWindowId);
	String FirstTabTitle=driver.getTitle();
	System.out.println(FirstTabTitle);
	driver.quit();
	}
}
