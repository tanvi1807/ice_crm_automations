package testngpackage;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class sample1
{
	@BeforeGroups(groups= {"sanity"})
	public void beforegroup()
	{
		System.out.println("Before gruop from sample1");
	}
	
	@AfterGroups(groups= {"sanity"})
	public void aftergroup()
	{
		System.out.println("after gruop from sample1");
	}
	@BeforeSuite
	
	 public void beforeSuite() 
	{
		System.out.println("Before suite from sample1");
	}

	@BeforeMethod
	 public void beforMethod()
	{
		System.out.println("Before Method from sample1");
	}
	
 
	@Test(groups= {"sanity"})
public void test()
  {
	System.out.println("test from sample1");
  }

	@Test(groups= {"sanity"})
  public void sample2test() 
  {
	System.out.println("test from sample2"); 
  }
	  
	 @Test(groups= {"sanity"})
	  public void sample3test() 
	  {
		System.out.println("test from sample3"); 
	  }
	  
	  @Test(groups= {"Regression"})
	  public void sample4test() 
	  {
		System.out.println("test from sample4"); 
	  }
	  
	  @Test(groups= {"Regression"})
	  public void sample5test() 
	  {
		System.out.println("test from sample5"); 
	  }
	  @Test(groups= {"Regression"})
	  public void sample6test() 
	  {
		System.out.println("test from sample6"); 
	  }
	  
	  @AfterMethod
		 public void afterMethod()
		{
			System.out.println("After Method from sample1");
		}
	  
	  @AfterSuite
		public void aftersuite()
		{
			System.out.println("After suite from sample1");
		}
}


