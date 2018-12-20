package Seldemo;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//tagname, location radio button display, selected, enabled



class Pract1 {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement ele = driver.findElement(By.id("u_0_9"));
	
	/*GET SIZE AND LOCATION
	WebElement ele = driver.findElement(By.id("email"));
	Point loc = ele.getLocation();
	System.out.println(loc.x+"   "+loc.y);
	Dimension dim = ele.getSize();
	System.out.println(dim.getHeight()+"  "+dim.getWidth());
	*/
	
	/*TAGNAME
	WebElement ele = driver.findElement(By.xpath(".//*[@id='u_0_9']"));
	String tagname = ele.getTagName();
	System.out.println(tagname);*/
	
	ele.click();
	boolean status = ele.isSelected();
	System.out.println(status);
	boolean dis = ele.isDisplayed();
	System.out.println(dis);
	boolean ena = ele.isEnabled();
	System.out.println(ena);
	//ele.click();*/
	
	}

}
