package Com.freecrm.qa.Testbase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Baseclass {
	FileInputStream fin;
	public static Properties prop; 
	public static WebDriver driver;
	
	
	public Baseclass() {
		try {
			File src= new File("C:\\Users\\admin\\eclipse-workspace\\Com.freecrm.qa\\src\\main\\java\\Com\\freecrm\\qa\\Confi\\Config.properties");
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
			
			driver.get(prop.getProperty("freeCrmurl"));
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
	}

}

