package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AllAnnotation {
	
	@Test(priority=2)
  public void login() {
	  System.out.println("login -1");
  }
	
	@Test(priority=1)
	public void check() {
		System.out.println("check -2");
		
	} 
	@Test(priority=0)
	public void signout() {
		System.out.println("signout 0");
		
	}
	@Test
	public void a2() {
		System.out.println("signout 2");
		
	}
	
	
  @BeforeMethod
  public void beforeMethod() {
	  
	 System.out.println("before");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterclass");
	
  }
  @org.testng.annotations.BeforeSuite
  public void BeforeSuite() {
	  System.out.println("beforesuite");
  }
 
  

}
