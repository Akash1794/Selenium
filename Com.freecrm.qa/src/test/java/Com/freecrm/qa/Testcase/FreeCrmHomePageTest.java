package Com.freecrm.qa.Testcase;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.freecrm.qa.Pages.Contactspage;
import Com.freecrm.qa.Pages.FreeCrmLoginPage;
import Com.freecrm.qa.Pages.Freecrmhomepage;
import Com.freecrm.qa.Testbase.Baseclass;

public class FreeCrmHomePageTest extends Baseclass {
	
	public FreeCrmLoginPage freeCrmLogin;
	public Freecrmhomepage homePage;
	
	public FreeCrmHomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		driver=new FirefoxDriver();
		freeCrmLogin = new FreeCrmLoginPage();
		homePage = freeCrmLogin.verifyFreeCrmLogin();
			
	}
	@Test
	public void ClickonContactListTest(){
		Contactspage contactpage=homePage.ClickOnContactsLink();
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}

}
