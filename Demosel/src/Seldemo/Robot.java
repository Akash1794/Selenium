package Seldemo;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Robot {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.olx.in//posting//");
		driver.findElement(By.xpath(".//*[@id='add-file-1']/div/a/span")).click();
		

		StringSelection sel=new StringSelection("G:\\AKASH\\wallpaper\\virat.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		java.awt.Robot rob = new java.awt.Robot();
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_C);
		Thread.sleep(2000);
		
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
	
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
