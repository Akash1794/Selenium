package Seldemo;
	
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/i.html");
		List<WebElement> list_frame = driver.findElements(By.tagName("iframe"));
		int total = list_frame.size();
		System.out.println("total frames on page=="+total);
		//driver.switchTo().frame("html");
		driver.switchTo().frame(2);
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("sel");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='menu_projects']/a")).click();
	
	
	}

}
