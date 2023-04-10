 package testngpackage;


import com.ice_crm_automation.utility.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class logintestcase extends BaseClass
{

    @BeforeClass
    public void beforeClass(){
        
        
   	 System.out.println("luanching the browser");
   	 launchbrowser("chrome");
	 driver.navigate().to("https://cybersuccess.icehrm.com/");
    }
    @AfterClass
    
    public void afterClass(){
       
        // close the browser instance
      driver.close();
    }

    @Test
    public void verifyLoginWithValidCred(){
        System.out.println("This is add emp test method");
        entertext(By.id("username"),"admin");
   	 entertext(By.id("password"),"2zuzfakn");
   	click(By.xpath("//button[contains(text(),'Log in')]")); // click on login button
        // verify login successfully
        click(By.xpath("//span[text()='I ']")); 
   	 click(By.xpath("//div[@class='pull-right']/a")); //logout from application
 }
    @Test
    public void verifyLoginWithInvalidUsername() throws Exception {
        entertext(By.name("username"), "test1234");  // enter invalid username
        entertext(By.name("password"), "2zuzfakn");  // enter valid password
    	click(By.xpath("//button[contains(text(),'Log in')]")); // click on login
    	WebElement errorMsg = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        if(errorMsg.isDisplayed())
        {
        System.out.println("Passed the test case for invalid username and valid password");
        }else
        {
          throw new Exception("Failed: unable to verify error message for invalid username and valid password");
      }
    }

    @Test
    public void verifyLoginWithInvalidPassword() throws Exception {
         entertext(By.name("username"), "admin");  // enter invalid username
  		entertext(By.name("password"), "mjexcvbnhgf");  // enter valid password
        click(By.id("loginButton")); // click on login
        click(By.xpath("//button[contains(text(),'Log in')]")); // click on login
	WebElement errorMsg = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
  if(errorMsg.isDisplayed())
  {
  System.out.println("Passed the test case for valid username and invalid password");
  }else
  {
    throw new Exception("Failed: unable to verify error message for invalid username and valid password");
}
}
    @Test
    public void verifyLoginWithBlankPassword() throws Exception {
         entertext(By.name("username"), "admin");  // enter invalid username
 		entertext(By.name("password"), "");  // enter blank password
        click(By.id("loginButton")); // click on login
        click(By.xpath("//button[contains(text(),'Log in')]")); // click on login
	WebElement errorMsg = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
  if(errorMsg.isDisplayed())
  {
  System.out.println("Passed the test case for valid username and Blank password");
  }else
  {
    throw new Exception("Failed: unable to verify error message for invalid username and valid password");
}
}
    @Test
    public void verifyLoginWithBlankUsername() throws Exception {
         entertext(By.name("username"), "");  // enter invalid username
 		entertext(By.name("password"), "2zuzfakn");  // enter blank password
        click(By.id("loginButton")); // click on login
        click(By.xpath("//button[contains(text(),'Log in')]")); // click on login
	WebElement errorMsg = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
  if(errorMsg.isDisplayed())
  {
  System.out.println("Passed the test case for valid username and Blank password");
  }else
  {
    throw new Exception("Failed: unable to verify error message for invalid username and valid password");
}
}
    @Test
    public void verifyLoginWithBlankcredential() throws Exception {
         entertext(By.name("username"), "");  // enter invalid username
 		entertext(By.name("password"), "");  // enter blank password
        click(By.id("loginButton")); // click on login
        click(By.xpath("//button[contains(text(),'Log in')]")); // click on login
	WebElement errorMsg = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
  if(errorMsg.isDisplayed())
  {
  System.out.println("Passed the test case for valid username and Blank password");
  }else
  {
    throw new Exception("Failed: unable to verify error message for invalid username and valid password");
  }
}
}




