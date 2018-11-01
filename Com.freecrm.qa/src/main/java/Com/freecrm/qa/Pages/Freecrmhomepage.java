package Com.freecrm.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.freecrm.qa.Testbase.Baseclass;

public class Freecrmhomepage extends Baseclass {
	
	 
	//Pagefactory and OR
	
	@FindBy(xpath="//a[text()='Contacts']")
	WebElement ContactsLink;
	
	
	@FindBy(xpath="//a[text()='Deals']")
	WebElement DealsLink;
	
	@FindBy(xpath="//a[text()='Tasks']")
	WebElement TasksLink;
	
	public Freecrmhomepage() {
		PageFactory.initElements(driver, this);
	}
	
	public Contactspage ClickOnContactsLink() {
		ContactsLink.click();
		return Contactspage();
	}

	private Contactspage Contactspage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
