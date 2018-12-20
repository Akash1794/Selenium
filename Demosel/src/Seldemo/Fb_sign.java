package Seldemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_sign {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath(".//*[@id='u_0_j']")).sendKeys("Akash");
		
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("Shinde");
		driver.findElement(By.xpath(".//*[@id='u_0_o']")).sendKeys("45654668555");
		driver.findElement(By.xpath(".//*[@id='u_0_v']")).sendKeys("babs");
		
		Select sel=new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		sel.selectByIndex(15);
		Select sel1=new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel1.selectByVisibleText("Mar");
		Select sel2=new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel2.selectByValue("1994");
		driver.findElement(By.xpath(".//*[@id='u_0_a']")).click();
		driver.findElement(By.xpath(".//*[@id='u_0_11']")).click();
	}

}
