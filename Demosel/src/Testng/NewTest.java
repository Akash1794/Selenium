package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	static WebDriver driver;
	  @Test
	@Parameters("browser")

public void verifytitle(String browsername) {
	  if(browsername.equalsIgnoreCase("firefox")) {
		  driver=new FirefoxDriver();
	  }
	  else if(browsername.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "G:\\Software testing\\chromedriver\\chromedriver.exe\\");
		  driver=new ChromeDriver();
	  }
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com");
	  System.out.println(driver.getTitle());
	  //driver.quit();
  }
}
