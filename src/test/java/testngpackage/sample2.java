package testngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sample2 
{
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class from sample2"); 
	}
	
  @Test
  public void sample2test() 
  {
	System.out.println("test from sample2"); 
  }
  
  @AfterClass
	public void afterclass()
	{
		System.out.println("after class from sample2"); 
	}
}
