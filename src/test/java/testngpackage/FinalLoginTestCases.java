package testngpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ice_crm_automation.utility.BaseClass;

public class FinalLoginTestCases extends BaseClass{
	 @BeforeClass
	    public void beforeClass(){
	        
	        
	   	 System.out.println("luanching the browser");
	   	 launchbrowser("edge");
		 driver.navigate().to("https://cybersuccess.icehrm.com/");
	    }
	    @AfterClass
	    
//	    public void afterClass(){
//	       
//	        // close the browser instance
//	      driver.close();
//	    }

	    @Test
	    public void verifyLoginWithValidCred() throws AWTException{
	        System.out.println("This is add emp test method");
	        entertext(By.id("username"),"admin");
	   	 entertext(By.id("password"),"2zuzfakn");
	   	click(By.xpath("//button[contains(text(),'Log in')]")); // click on login button
	        // verify login successfully
//	        click(By.xpath("//span[text()='I ']")); 
//	   	 click(By.xpath("//div[@class='pull-right']/a")); //logout from application
	 
	//    admin=dashboard
	    	
	    	click(By.xpath("//*[@id=\"admin_Admin\"]/li[1]/a"));
	    	//dashboard=admin
	    	click(By.id("employeeLink"));
	    	driver.navigate().back();
	    	//dashboard=company status
	    	click(By.id("companyLink"));
	    	//addingcompany
	    	click(By.xpath("//*[@id=\"CompanyStructureTable\"]/div/div/div[1]/div[1]/div/div/button/span[2]"));
	    	Robot r3 =new Robot();
		    entertext(By.xpath("//input[@id='title']"),"Tanvi");
		    entertext(By.xpath("//*[@id=\"description\"]"),"qwwtgydbjj");
		    
	//	    rc_select_0
		    	
	    	 
	    	//user
	    	click(By.id("usersLink"));
	    //adding user 
	    	click(By.xpath("//button[@class='btn btn-small btn-primary']"));
	    	//enterusername
	    	entertext(By.xpath("//input[@id='username']"),"Useradmins");
    	
//	    	r3.keyPress(KeyEvent.VK_ENTER);
//			r3.keyRelease(KeyEvent.VK_ENTER);
	    	//enterpassword
	    	entertext(By.xpath("//input[@id='email']"),"w6ttt718@gmail.com");
	    	r3.keyPress(KeyEvent.VK_ENTER);
			r3.keyRelease(KeyEvent.VK_ENTER); 
			driver.navigate().back();
	    } 	
	    
}
