package pk1BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex9JavaScriptAlerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Teja\\Software\\Drivers\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        //Normal Alert
		driver.findElement(By.xpath("//button[@id='check']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);

		//Confirm accept
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		//Confirm dismiss
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);

		//promot dismiss
		driver.findElement(By.xpath("//button[@id='reset']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);

		//Promt enter info and accept
		driver.findElement(By.xpath("//button[@id='reset']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("hello");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

	}
}








