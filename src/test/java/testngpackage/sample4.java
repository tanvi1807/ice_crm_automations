package testngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sample4 {
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class from sample4"); 
	}
	
  @Test
  public void sample4test() 
  {
	System.out.println("test from sample4"); 
  }
  
  @AfterClass
	public void afterclass()
	{
		System.out.println("after class from sample4"); 
	}
}
