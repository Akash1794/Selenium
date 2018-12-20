package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Myapplication {
	
	WebDriver driver;
	
	
	
	@BeforeClass
	public void openbrowser() 
	{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	
	System.out.println("browser launch");
	}
	
	@Test
	public void login()
	{

		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
		String url = driver.getCurrentUrl();
		
		Assert.assertTrue(url.contains("facebook"));
		
		System.out.println("start test");
	}
	
	@Test(dependsOnMethods="login")
	public void loginfb() 
	{
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("akki3001@yahoo.in");
	driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("9921446508");
	driver.findElement(By.xpath(".//*[@id='u_0_3']")).click();
	boolean status = driver.findElement(By.xpath(".//*[@id='u_0_c']/a")).isDisplayed();
	Assert.assertTrue(status);
	System.out.println("loginfb");
		
	}
	
	@Test(dependsOnMethods="loginfb")
	public void endtest() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='js_ec']/div/div/ul/li[8]/a/span/span")).click();
		System.out.println("endtest");
		
	}
	@AfterClass
	public void closefb() {
		driver.quit();
		System.out.println("close");
		
		
		
	}
}
