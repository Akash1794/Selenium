import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload_File {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/fileupload.html");
		driver.findElement(By.xpath(".//*[@id='1']")).click();
		Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\AutoIT\\fileupload.exe");
	
	}
	}
	


