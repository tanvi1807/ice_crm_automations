package testngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sample5 {
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class from sample5"); 
	}
	
  @Test
  public void sample5test() 
  {
	System.out.println("test from sample5"); 
  }
  
  @AfterClass
	public void afterclass()
	{
		System.out.println("after class from sample5"); 
		
		System.out.println("Tanvi@2618");
	}
}
