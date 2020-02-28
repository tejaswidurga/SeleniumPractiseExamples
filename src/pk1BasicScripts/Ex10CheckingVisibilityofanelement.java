package pk1BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex10CheckingVisibilityofanelement {
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Teja\\\\Software\\\\Drivers\\\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Teja/Selenium%20Programming/selenium-downloads-master/selenium-downloads-master/index/index.html");
		boolean visible = driver.findElement(By.id("hiddentext")).isDisplayed();
		if(!visible) {
			System.out.println("The element is hidden");
		}
		Thread.sleep(2000);
		driver.findElement(By.id("makevisible")).click();
		visible = driver.findElement(By.id("hiddentext")).isDisplayed();
		if(visible) {
			System.out.println("The element is visible now");
		}
		Thread.sleep(2000);
		driver.quit();


	}
}
