package pk1BasicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1GetAndNavigateMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Teja\\Software\\Drivers\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.google.com");
		driver.get("http:\\www.youtube.com");
		driver.navigate().back();
		driver.get("http:\\www.rediff.com");
		Thread.sleep(2000);
		driver.navigate().to("http:\\www.yahoo.com");
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.get("http:\\www.bing.com");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();
		
		
}
}
