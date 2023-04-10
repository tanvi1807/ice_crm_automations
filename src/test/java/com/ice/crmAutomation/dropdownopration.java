package com.ice.crmAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownopration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.egde.driver","C:\\Users\\tanvi\\eclipse-workspace\\ice_crm_automation\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/");
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver =new FirefoxDriver();
//		driver.get("https://www.amazon.in");
		WebElement searchDropDown=driver.findElement(By.id("searchDropdownBox"));
		Select select =new Select(searchDropDown);
		List<WebElement> dropdownvalues=select.getOptions();
		for(int i=0;i<dropdownvalues.size();i++)
		{
			WebElement element= dropdownvalues.get(i);
			String dropdownvalue=element.getText();
			System.out.println(dropdownvalue);
			
		}
		select.deselectByVisibleText("Electronics");
		select.deselectByVisibleText("search-alias=electronics");
		select.selectByIndex(16);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    driver.close();
				
		
	}

	
}
