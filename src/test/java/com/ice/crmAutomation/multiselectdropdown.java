package com.ice.crmAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.egde.driver","C:\\Users\\tanvi\\eclipse-workspace\\ice_crm_automation\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://mdboostrap.com/docs/standard/extended/multiselect/");
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver =new FirefoxDriver();
//		driver.get("https://www.amazon.in");
		WebElement multiselectdropdown=driver.findElement(By.xpath("//section[@id='section-basic-example']/section[1]//select"));
		Select select =new Select(multiselectdropdown);
		
		List<WebElement> multiselectDropDownValues= select.getOptions();
		for(int i =0;i<multiselectDropDownValues.size();i++)
		{
			WebElement element= multiselectDropDownValues.get(i);
			String dropdownvalue=element.getAttribute("value");
			System.out.println(dropdownvalue);
		}
		List<WebElement> selectOptions= select.getAllSelectedOptions();
		for(int i =0;i<selectOptions.size();i++)
		{
			WebElement element= selectOptions.get(i);
			String selectedvalue=element.getAttribute("value");
			System.out.println(selectedvalue);
		}
		
		
	}

}
