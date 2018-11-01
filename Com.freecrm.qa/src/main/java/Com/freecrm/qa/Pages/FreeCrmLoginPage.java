package Com.freecrm.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.freecrm.qa.Confi.ConstantData;
import Com.freecrm.qa.Testbase.Baseclass;

public class FreeCrmLoginPage extends Baseclass {
	
	//Page factory and OR
	
	@FindBy(name = "username")
	WebElement uname;

	@FindBy(name = "password")
	WebElement upass;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginBtn;

	
		
	public FreeCrmLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyPageTitle() {
		return driver.getTitle();
	}

	
	

	
	public Freecrmhomepage verifyFreeCrmLogin() {
		uname.clear();
		uname.sendKeys(ConstantData.uname1);
		upass.clear();
		upass.sendKeys(ConstantData.upass1);
		loginBtn.click();
		
		return new Freecrmhomepage();
	}


}
