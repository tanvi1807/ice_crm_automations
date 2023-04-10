package com.ice_crm_automation.loginpage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ice_crm_automation.pages.EmployeePage;
import com.ice_crm_automation.pages.loginpage;
import com.ice_crm_automation.utility.BaseClass;
import com.ice_crm_automation.utility.PropertyHandling;

public class EmployeeTest extends BaseClass
{

	    PropertyHandling property;
	    loginpage loginPage;
	    EmployeePage employeePage;
 
	   EmployeeTest()
	    {
	      PageFactory.initElements(driver,this);    	    
	    }
	    @BeforeClass
	    public void beforeClass() {
	        property = new PropertyHandling();
	        launchbrowser(property.getProperty("browser"));
	        driver.get(property.getProperty("icecrmurl"));
	        loginPage = new loginpage(driver);
	        employeePage = new EmployeePage();
	        String username = property.getProperty("username");
	        String password = property.getProperty("password");
	        loginPage.login(username, password);
	    }

	    @Test
	    public void verifySearchEmp() throws InterruptedException {
	        click(employeePage.employeeMenu);
	        click(employeePage.empSubMenu);
	        waitUntilElementIsClickable(employeePage.searchButton);
	        List<String> allEmpFNames = new ArrayList<>();
	        Thread.sleep(5000);
	        List<WebElement> allEmpDetails = driver.findElements(employeePage.allEmpInfo);
	        for (WebElement element : allEmpDetails) {
	            String firstName = element.getText();
	            allEmpFNames.add(firstName);
	            System.out.println(firstName);
	        }
	        String lastEmpName = allEmpFNames.get(allEmpDetails.size()- 1);
	        entertext(employeePage.searchBox, lastEmpName);
	        click(employeePage.searchButton);
	        Thread.sleep(5000);
	        List<WebElement> searchEmpDetails = driver.findElements(employeePage.allEmpInfo);
	        for (WebElement element : searchEmpDetails) {
	            String firstName = element.getText();
	            Assert.assertEquals(firstName, lastEmpName);
	        }
	    }

//	    @AfterClass
//	    public void afterClass() {
//	        driver.close();
//	    }
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	