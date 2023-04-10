package testngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sample3 {
	 
	
		@BeforeClass
		public void beforeclass()
		{
			System.out.println("before class from sample3"); 
		}
		
	  @Test
	  public void sample3test() 
	  {
		System.out.println("test from sample3"); 
	  }
	  
	  @AfterClass
		public void afterclass()
		{
			System.out.println("after class from sample3"); 
		}
	}
