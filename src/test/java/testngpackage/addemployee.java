package testngpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ice_crm_automation.utility.BaseClass;

public class addemployee extends BaseClass {
	String firstname = "Tanvi";
	String middlename = "Anand";
	String lastname = "Manoli";
	String empid = "1826";

	@BeforeMethod
	public void bedoremethod() {
		System.out.println("luanching the browser");
		launchbrowser("edge");
		driver.navigate().to("https://cybersuccess.icehrm.com/");
		entertext(By.id("username"), "admin");
		entertext(By.id("password"), "2zuzfakn");
		click(By.xpath("//button[contains(text(),'Log in')]"));
		click(By.xpath("//span[text()='Employees']"));
		click(By.xpath("//ul[@id='admin_Employees']/li[1]/a"));
	}

	@Test
	public void addemp() throws AWTException {
		click(By.xpath("//span[contains(text(),'Add New')]"));
		entertext(By.id("employee_id"), empid);
		entertext(By.id("first_name"), firstname);
		entertext(By.id("middle_name"), middlename);
		entertext(By.id("last_name"), lastname);

		int BirthYear = 2002;
		// calender
		click(By.id("birthday"));
		click(By.xpath("//div[@class='ant-picker-panel']/div/div/div/button[2]"));
		List<WebElement> year = driver.findElements(By.xpath("//div[@class='ant-picker-cell-inner']"));

		for (WebElement element1 : year) {
			String year1 = element1.getText();
			Integer Year = Integer.valueOf(year1);

			if (Year > BirthYear) {

				driver.findElement(By.xpath("//span[@class='ant-picker-super-prev-icon']")).click();
			} else if (Year == BirthYear) {
				element1.click();

				List<WebElement> monthelement = driver
						.findElements(By.xpath("//table[@class='ant-picker-content']//td"));
				for (WebElement MElement : monthelement) {
				//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					String Month = MElement.getText();
					if (Month.equals("Jul")) {
						MElement.click();
						break;
					}
				}

				List<WebElement> dayelement = driver.findElements(By.xpath("//div[@class='ant-picker-cell-inner']"));
				for (WebElement DElement : dayelement) {
					String Day = DElement.getText();
					if (Day.equals("18")) {
						DElement.click();
						break;
					}
				}
				break;
			}
		}
		click(By.xpath("//span[text()='Save']"));
		
		click(By.id("rc_select_1"));
		click(By.xpath("//div[@label='Female']/div"));
	
		click(By.id("rc_select_2"));
		click(By.xpath("//div[@label='Single']/div"));
	
		entertext(By.xpath("//input[@id='rc_select_0']"),"Indian");
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		click(By.xpath("//span[text()='Save']"));
		//next page
	
		entertext(By.xpath("//input[@id='rc_select_5']"),"Full Time Internship");
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
		entertext(By.xpath("//input[@id='rc_select_6']"),"Your Company");
	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		entertext(By.xpath("//input[@id='rc_select_7']"),"QA Engineer");
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
//	
		
		// calender
		click(By.id("joined_date"));
		click(By.xpath("//div[@class='ant-picker-dropdown ant-picker-dropdown-placement-bottomLeft ']/div/div/div/div/div/button[2]"));
		click(By.xpath("//td[@title='2022']"));
		click(By.xpath("//td[@title='2022-03-22']"));
	

		click(By.xpath("//span[text()='Save']"));
		entertext(By.xpath("//input[@id='rc_select_9']"),"India");
		Robot r2= new Robot();
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);
		
		click(By.xpath("//span[text()='Save']"));
		
		
	}
		
	
	
//	@Test
//	public void verify()
//	{
//		
//	}
//
//	@AfterMethod
//	public void aftermethod()
////	{
//		driver.close();
//	}
			
	}
	
	
	
