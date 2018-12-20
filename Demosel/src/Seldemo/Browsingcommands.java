package Seldemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Browsingcommands {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver=new FirefoxDriver();
	
		driver.get("https://www.facebook.com");
		 /*WebElement email = driver.findElement(By.cssSelector("#email"));
		 email.sendKeys("akash");
	WebElement pass = driver.findElement(By.cssSelector("#pass"));
	 pass.sendKeys("akask123");
	 driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	// WebElement inn = driver.findElement(By.id("u_0_8"));
	// inn.click();
// WebElement acc = driver.findElement(By.linkText("Forgotten account?"));
	 //acc.click();
	 WebElement femalerd = driver.findElement(By.xpath("//label[text()='Female']"));
	 
	 boolean fes = femalerd.isSelected();
	 System.out.println(fes);
	 femalerd.click();
	boolean fedd = femalerd.isSelected();
	System.out.println(fedd);
	 
	 boolean fed = femalerd.isDisplayed();
	 System.out.println(fed);
	 //dropdown list*/
	 
	   WebElement mss = driver.findElement(By.id("day"));
	  Select mks = new Select(mss);
	  mks.selectByVisibleText("6");
	  Thread.sleep(1000);
	  mks.selectByIndex(8);
	  mks.selectByValue("10");
	  
	  WebElement aks = driver.findElement(By.xpath(".//*[@id='month']"));
	  Select abk = new Select(aks);
	  abk.selectByValue("0");
	  WebElement abc = abk.getFirstSelectedOption();
	  System.out.println(abc);
	  Thread.sleep(2000);
	  abk.selectByIndex(5);
	  WebElement abb = abk.getFirstSelectedOption();
	  System.out.println(abb);
	  abk.selectByVisibleText("Mar");
	  WebElement abf = abk.getFirstSelectedOption();
	  System.out.println(abf.getText());
	  
	//  driver.findElement(arg0)
	  
	  
	  List<WebElement> mon = abk.getOptions();
	  int month = mon.size();     //list size month
	  System.out.println(month);
	  
	  
	  
	  
	  
	 
	 
	}

}