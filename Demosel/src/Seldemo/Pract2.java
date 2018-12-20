package Seldemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Pract2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement dd = driver.findElement(By.id("day"));
		WebElement md = driver.findElement(By.id("month"));
		WebElement yd = driver.findElement(By.id("year"));
        Select date = new Select(dd);
        date.selectByIndex(25);
        Select month = new Select(md);
        month.selectByValue("5");
        Select year = new Select(yd);
        year.selectByValue("2016");
        Thread.sleep(3000);
        
        
        /*List<WebElement> month_list = month_date.getOptions();
        int total_months = month_list.size();
        System.out.println(total_months);
        for(int i=0;i<total_months;i++) {
        	String name = month_list.get(i).getText();
        	System.out.println(name);
        }
        
        /*month_date.selectByVisibleText("May");
        Thread.sleep(3000);
        month_date.selectByValue("8");
        Thread.sleep(3000);
        month_date.selectByIndex(10);*/
	}
 
}
