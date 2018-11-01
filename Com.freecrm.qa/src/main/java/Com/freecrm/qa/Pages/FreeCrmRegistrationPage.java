
package Com.freecrm.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.freecrm.qa.Testbase.Baseclass;

public class FreeCrmRegistrationPage extends Baseclass {
	
	//OR or Page Factory
	
		@FindBy()
		WebElement editionDd;
		
		@FindBy()
		WebElement fName;
		
		@FindBy()
		WebElement lName;
		
		@FindBy()
		WebElement email;
		
		@FindBy()
		WebElement confirmEmail;
		
		@FindBy()
		WebElement userName;
		
		@FindBy()
		WebElement userPassw;
		
		@FindBy(xpath="//img[@class='img-responsive']")
		WebElement freeCrmImg;
		
		@FindBy()
		WebElement confirmuPassword;
		
		
		public FreeCrmRegistrationPage(){
			
			PageFactory.initElements(driver, this);
		}
		
		
		public boolean verifyFreeCrmImg(){
			
			return freeCrmImg.isDisplayed();
			
		}
		
		public void fillSignUpForm(){
			
		}

}
