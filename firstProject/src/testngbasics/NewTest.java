package testngbasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	
	@BeforeMethod
	public void first1() 
	  {
		  System.out.println("hello1");
	  }
	
	@AfterMethod
	public void first2() 
	  {
		  System.out.println("hello3");
	  }
	
  @Test
  public void first() 
  {
	  System.out.println("hello5");
  }
}