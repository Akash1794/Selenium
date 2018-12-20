package Seldemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
/*import org.openqa.selenium.By;*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.WrapsElement;

public class Locators {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		/* BROWSER COMMANDS
		String gurl = "https://www.google.com";
		driver.get(gurl);
		driver.manage().window().maximize();
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		int len = pagetitle.length();
		System.out.println(len); 
		String source = driver.getPageSource();
		System.out.println(source);
		int sourcelength = source.length();
		System.out.println(sourcelength);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals(gurl)) {
			System.out.println("actual url"+url);
			System.out.println("expected url"+gurl);
		}
		else {
			System.out.println("url is diff");
		}
		*/
		
		//NAVIGATION COMMAND
		
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("u_0_2")).click();;
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.close();
	
		
		/*OPENING AND CLOSING TAB
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		driver.getTitle();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		driver.get("https://www.gmail.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"\t");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"w");
		driver.quit();
		*/
	
	}
}
