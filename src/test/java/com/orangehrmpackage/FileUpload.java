package com.orangehrmpackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ice_crm_automation.utility.BaseClass;
import com.ice_crm_automation.utility.PropertyHandling;
import com.orangehrm.pages.MyInfoPage;
import com.orangehrm.pages.orangehrmloginpage;

public class FileUpload extends BaseClass {

	orangehrmloginpage loginpage;
	MyInfoPage myinfopage;
	PropertyHandling phandling;
	
	@BeforeClass
	public void beforeclass()
	{
	
	myinfopage=new MyInfoPage();
	phandling=new PropertyHandling();
	String username=phandling.getProperty("orangeun");
	String password=phandling.getProperty("orangepw");
	String browser=phandling.getProperty("browser");
	String url=phandling.getProperty("orabgehrmurl");
	launchbrowser(browser);
	driver.get(url);
	loginpage =new orangehrmloginpage(driver);
	loginpage.login(username, password);
	}

	@Test
	public void fileupload()
	{
		click(myinfopage.myinfoMenu);
		click(myinfopage.profileImg);
		click(myinfopage.addImg);
		try {
	    	PropertyHandling phandling=new PropertyHandling();
	    	String autoitscript =phandling.getProperty("autoitscript"); 
	    	Thread.sleep(1000);
	    	Runtime.getRuntime().exec(autoitscript+" "+"C:\\fileupload.exe");
	    	click(myinfopage.saveButton);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    }
//		this.fileupload("C:\\fileupload.exe");
		
		
		
		
	}
	
	

