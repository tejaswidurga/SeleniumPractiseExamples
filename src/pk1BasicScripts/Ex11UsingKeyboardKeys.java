package pk1BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex11UsingKeyboardKeys {
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Teja\\\\Software\\\\Drivers\\\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Teja/Selenium%20Programming/selenium-downloads-master/selenium-downloads-master/index/index.html");
		Thread.sleep(2000);
		driver.findElements(By.tagName("input")).get(0).sendKeys("Test1");
		Thread.sleep(2000);
		driver.findElements(By.tagName("input")).get(0).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.findElements(By.tagName("input")).get(1).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.findElements(By.tagName("input")).get(2).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		for(int i=0; i<3; i++) {
			Thread.sleep(2000);
			driver.findElement(By.id("cars_single_selection")).sendKeys(Keys.ARROW_DOWN);
		}


	}
}
