package pk1BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2FirstClass {

	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Teja\\Software\\Drivers\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Teja/Html%20script/newreg.html");
		driver.findElement(By.id("first name")).sendKeys("java");
		Thread.sleep(2000);
		driver.findElement(By.id("firstname")).sendKeys("python");
		Thread.sleep(2000);
		driver.findElement(By.id("firstname")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).clear();
		Thread.sleep(2000);		

	}

}
