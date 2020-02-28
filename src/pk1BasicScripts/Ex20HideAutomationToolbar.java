package pk1BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex20HideAutomationToolbar {
	public static void main(String [] args) {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("disable-infobars");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Teja\\\\Software\\\\Drivers\\\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("http://localhost/carrental");
		driver.findElement(By.xpath("//a[@href='#loginform']")).click();
		}
}


