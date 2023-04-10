package testngpackage;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ice_crm_automation.utility.BaseClass;
import com.ice_crm_automation.utility.PropertyHandling;

public class emptest extends BaseClass
{
	PropertyHandling phandling;
	
	@BeforeClass
	public void before()
	{
		phandling =new PropertyHandling();
	}
	
  @Test
  public void login() 
  {
	  String url = new String();
	  launchbrowser("chrome");
	  driver.navigate().to(url);
	  String username = new String();
	  entertext(By.id("username"), "admin");
	  String password = new String();
	  entertext(By.id("password"), "2zuzfakn");
	  click(By.xpath("//button[contains(text(),'Log in')]"));
 
  }
 
}
