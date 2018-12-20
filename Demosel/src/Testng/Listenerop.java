package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;


@Listeners(Testng.Testnglistener.class)
public class Listenerop {
	
	@Test
	public void fblaunch() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

	@Test
	public void titlematch() {
		System.out.println("test2");
		Assert.assertTrue(false);
	}
		
}
