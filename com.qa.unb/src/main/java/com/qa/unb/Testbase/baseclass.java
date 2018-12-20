package com.qa.unb.Testbase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass 
{
	FileInputStream fin;
	public static Properties prop; 
	public static WebDriver driver;
	
	
	public baseclass() {
		try {
			File src= new File("C:\\Users\\admin\\eclipse-workspace\\com.qa.unb\\src\\main\\java\\com\\qa\\unb\\config\\config.properties");
			fin=new FileInputStream(src);
			prop=new Properties();
			prop.load(fin);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
		public static void setBrowser() {
			
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			

			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
	}

}




