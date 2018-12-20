package windowhandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synch {

	public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
//IMPLICIT WAIT
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://accounts.google.com/ServiceLogin/identifier?service=accountsettings&passive=1209600&osid=1&continue=https%3A%2F%2Fmyaccount.google.com%2Fintro&followup=https%3A%2F%2Fmyaccount.google.com%2Fintro&csig=AF-SEnbFH-fbP4j9V3sz%3A1526556504&flowName=GlifWebSignIn&flowEntry=AddSession");
			driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("akash");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).click();
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		System.out.println("click");
		driver.close();
		
		
//Explicit wait		
		/*WebDriverWait wait = new WebDriverWait(driver, 20); 
		driver.get("https://accounts.google.com/");
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("akash");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id(""));
		*/
	}

}
