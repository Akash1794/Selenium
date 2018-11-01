package Com.freecrm.qa.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.freecrm.qa.Pages.FreeCrmLoginPage;
import Com.freecrm.qa.Testbase.Baseclass;

public class FreeCrmLoginPageTest extends Baseclass {

	FreeCrmLoginPage loginCrm;
	
	public FreeCrmLoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		setBrowser();
		loginCrm= new FreeCrmLoginPage();
	}
	
	@Test(priority=1)
	public void verifyPageTitleTest(){
		String expTitle="CRMPRO-CRM software for customer relationship management, sales, and support.";
		String pageTitle = loginCrm.VerifyPageTitle();
		
		Assert.assertEquals(pageTitle, expTitle,"Title doesn't matching");
	}
	
	@Test(priority=2)
	public void verifyFreeCrmLoginTest(){
		
		loginCrm.verifyFreeCrmLogin();
		
		Assert.assertEquals(driver.getTitle(), "CRMPRO","title Doesn't matching");
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}

}
