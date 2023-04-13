package com.ice_crm_automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeePage {


//	public EmployeePage(WebDriver driver) {
//		this.driver=driver;
//	}
	  public By employeeMenu = By.xpath("//li[@ref='admin_Employees']//span");
	    public By empSubMenu = By.xpath("//ul[@id='admin_Employees']/li[1]/a");
	    public By allEmpInfo = By.xpath("//tbody[@class='ant-table-tbody']/tr/td[3]");
	    public By searchBox = By.id("advanced_search_searchTerm");
	    public By searchButton = By.xpath("//span[text()='Search']");



}
