import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_Auth {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\AutoIT\\Handle Authentication.exe");
		driver.get("https://www.engprod-charter.net/");

	}

}
