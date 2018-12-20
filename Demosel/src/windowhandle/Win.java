package windowhandle;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Win {

/*	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\admin\\Desktop\\iframe.html");
		List<WebElement> lframe = driver.findElements(By.tagName("iframe"));//tagname used tofind no of frames on window//
		int total = lframe.size();
		System.out.println(total);
		driver.switchTo().frame("html");
		//driver.switchTo().frame("learnsel");//
		driver.findElement(By.xpath("//a[text()='Projects']")).click();
		driver.switchTo().defaultContent();//get back to parent window use this method//
		Thread.sleep(2000);
		driver.switchTo().frame("naukri");
		Thread.sleep(2000);
	 driver.findElement(By.className("searchJob")).click();
	 
		driver.switchTo().defaultContent();
		driver.quit();
		
		
	}*/

	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		String parent = driver.getWindowHandle();
	   Set<String> id = driver.getWindowHandles();
	  wait.until(ExpectedConditions.)
	  
	System.out.println(id);
	Object[] wid = id.toArray();
	Thread.sleep(3000);
	driver.switchTo().window((String) wid[1]);
	
	driver.close();
	//driver.quit();     	//closing 2nd window
	
	/*	Iterator<String> itr = id.iterator();
		while(itr.hasNext()) {
			String child_wid = itr.next();
			System.out.println(child_wid);
			if(!parent.equals(child_wid)) {
				WebDriver sw = driver.switchTo().window(child_wid);
				
				System.out.println(sw.getTitle());
				
			}
		}
		 String cb = driver.switchTo().window(parent).getTitle();
		 
	System.out.println(cb);
	//	Thread.sleep(3000);
	//	driver.switchTo().window("Haier");*/
		
		}
		
		
	}
	

