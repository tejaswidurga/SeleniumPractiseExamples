package pk1BasicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex23JavaScriptExecutor1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Teja\\Software\\Drivers\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("chenn");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.ARROW_UP);
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String place1 = (String) js.executeScript("return document.getElementById('src').value");
		System.out.println(place1);

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		String place2 = (String) js.executeScript("return document.getElementById('src').value");
		System.out.println(place2);

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		String place3 = (String) js.executeScript("return document.getElementById('src').value");
		System.out.println(place3);

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		String place4 = (String) js.executeScript("return document.getElementById('src').value");
		System.out.println(place4);
	}		

}
