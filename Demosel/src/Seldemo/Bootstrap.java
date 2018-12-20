package Seldemo;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bootstrap {

	public static void main(String[] args) throws Exception {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
	driver.findElement(By.xpath(".//*[@id='menu1']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='main']/div[3]/ul/li[2]/a")).click();
	List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
	for(WebElement ele:menu) {
		String html = ele.getAttribute("innerHTML");
		if(html.contains("HTML")) {
			ele.click();
			break;
		}
	}
	
	
	
	
	
	
	
	
	/*for(int i=0;i<menu.size();i++) {
		WebElement ele = menu.get(i);
		String html = ele.getAttribute("innerHTML");
		System.out.println("dropdown values=="+html);
	if(html.contains("Javascript")) {
		ele.click();
		break;
	}
	}*/
	
	}

}
