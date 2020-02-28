package pk1BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex12HandlingMouseandKeyboardEvents {
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Teja\\\\Software\\\\Drivers\\\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Teja/Selenium%20Programming/selenium-downloads-master/selenium-downloads-master/index/index.html");

		//Moving mouse to particular position
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//td[@id='movehere']"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='mouseoverbtn']")).click();
		driver.switchTo().alert().dismiss();


	}
}
