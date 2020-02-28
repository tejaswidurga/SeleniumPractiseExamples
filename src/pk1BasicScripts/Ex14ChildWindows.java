package pk1BasicScripts;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex14ChildWindows {
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Teja\\\\Software\\\\Drivers\\\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Teja/Selenium%20Programming/selenium-downloads-master/selenium-downloads-master/index/index.html");
        String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.linkText("Google Link")).click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator it = allWindowHandles.iterator();
		String childWindowId = "";
		while(it.hasNext()) {
			String windowId = (String) it.next();
			if(!(windowId.equalsIgnoreCase(parentWindowId))) {
				childWindowId = windowId;
			}
		}
		driver.switchTo().window(childWindowId);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java programming");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.TAB);
		driver.findElements(By.xpath("//input[@value='Google Search']")).get(1).click();
		Thread.sleep(10000);
		driver.close();
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.id("firstname")).sendKeys("java");
		}
}
