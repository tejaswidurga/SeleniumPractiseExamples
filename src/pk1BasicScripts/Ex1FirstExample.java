package pk1BasicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1FirstExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Teja\\Software\\Drivers\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.google.com");
		System.out.println("Page Title: "+driver.getTitle());
		System.out.println("Current URL: "+driver.getCurrentUrl());
		System.out.println("Page Source: "+driver.getPageSource());
		System.out.println("Window Handle: "+driver.getWindowHandle());
		System.out.println("Window Handles:"+driver.getWindowHandles());
		System.out.println("SwitchTo: "+driver.switchTo());
		Thread.sleep(10000);
		driver.close();
		driver.quit();
	
		

	}

}
