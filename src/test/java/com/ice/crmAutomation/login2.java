package com.ice.crmAutomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class login2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanvi\\eclipse-workspace\\ice_crm_automation\\chromedriver.exe");
				// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				driver.get("https://cybersuccess.icehrm.com/");

				WebElement username=driver.findElement(By.id("username"));
				username.sendKeys("admin");

				WebElement password= driver.findElement(By.id("password"));
				password.sendKeys("2zuzfakn");

				WebElement loginButton= driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
				loginButton.click();
			

					String homeText = driver.findElement(By.xpath("//header[@id='delegationDiv']/a")).getText();
						System.out.println(homeText);


						//valid username & password
						//if (homeText.equals("Home"))
						//{
							//System.out.println("Test Case is passed");
						//} 
						//else
						//{
							//System.out.println("failed to login to application");
							//// throw new Exception("failed to login to application");
						//}
						
						//valid username & invalid password 

//					driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[5]/a/span")).click();
//					driver.findElement(By.xpath("//a[text()='Sign out']")).click();
//						
//					username=driver.findElement(By.id("username"));
//					username.sendKeys("admin");
//						
//					password= driver.findElement(By.id("password"));
//					password.sendKeys("12t482384");
//						
//					loginButton= driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
//					loginButton.click();
//						
//					if (homeText.equals("Home234"))
//					{
//						System.out.println("Test Case is passed");
//					} 
//					else 
//					{
//						System.out.println("failed to login to application");
//						 //throw new Exception("failed to login to application");
//					}
					
					//invalid username& passwaord
					
				driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[5]/a/span")).click();
				driver.findElement(By.xpath("//a[text()='Sign out']")).click();
//					
		username=driver.findElement(By.id("username"));
username.sendKeys("");
//					
password= driver.findElement(By.id("password"));
password.sendKeys("");
//					
loginButton= driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
loginButton.click();
//					
System.out.println("please enter valid username & password");
				if (homeText.equals("Homewww")) 
				{					System.out.println("Test Case is passed");
		} 
	else 
{
					System.out.println("failed to login to application");
						//throw new Exception("failed to login to application");
					}


						//invalid password and invalid username
						
//						driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[5]/a/span")).click();
//						driver.findElement(By.xpath("//a[text()='Sign out']")).click();
//						
//						username=driver.findElement(By.id("username"));
//						username.sendKeys("fdfdf");
//						
//						password= driver.findElement(By.id("password"));
//						password.sendKeys("12t482384");
//						
//						loginButton=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
//						loginButton.click();
//						
//						if (homeText.equals("Hellow"))
//						{
//							System.out.println("Test Case is passed");
//						} 
//						else
//						{
//							System.out.println("failed to login to application");
//						// throw new Exception("failed to login to application");
//						}
			} 

		

	}


