package windowhandle;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Screenshot {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("akash");
		

		driver.manage().window().maximize();
		//Screenshot.takescreenshot(driver);
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("akash123");
		//Screenshot.takescreenshot(driver);
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
		//Screenshot.takescreenshot(driver);

		
		
//TO TAKE SINGLE SCREENSHOT==========		
		//WRITE INTERFACE  THEN TYPECASTING DIVER OBJ AND STORED IT IN OBJ
TakesScreenshot ts = (TakesScreenshot)driver;
File src = ts.getScreenshotAs(OutputType.FILE);
//for storing file from one location to another//
org.apache.commons.io.FileUtils.copyFile(src, new File("G:\\Software testing\\screenshot\\screenshot"+System.currentTimeMillis()+".jpeg"));


//driver.close();
	}
	
//CREATING METHOD TO TAKE MULTIPLE SCREENSHOT========	
	
/*	
public static void takescreenshot(WebDriver driver) throws Exception
{
	TakesScreenshot ts = (TakesScreenshot)driver;
File src = ts.getScreenshotAs(OutputType.FILE);
//for storing file from one location to another//
org.apache.commons.io.FileUtils.copyFile(src, new File("G:\\Software testing\\screenshot\\screenshot"+System.currentTimeMillis()+".jpeg"));
	
	
}*/


		
	}


