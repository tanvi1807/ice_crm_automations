package testngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sample6 {
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class from sample6"); 
	}
	
  @Test
  public void sample6test() 
  {
	System.out.println("test from sample6"); 
  }
  
  @AfterClass
	public void afterclass()
	{
		System.out.println("after class from sample6"); 
	}
}
