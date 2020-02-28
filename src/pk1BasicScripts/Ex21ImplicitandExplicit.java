package pk1BasicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex21ImplicitandExplicit {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Teja\\Software\\Drivers\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Teja/Selenium%20Programming/selenium-downloads-master/selenium-downloads-master/index/index.html");

		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("delayedbutton")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();

		//Explicit Wait
		driver.findElement(By.xpath("//button[@id='dispdynbutton']")).click();
		WebDriverWait d=new WebDriverWait(driver,20);
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='dynbutton']")));
		driver.findElement(By.xpath("//button[@id='dynbutton']")).click();
		driver.findElement(By.id("firstname")).sendKeys("java123");
	}
}
