package pk1BasicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex25JavaScriptExecutor3 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Teja\\Software\\Drivers\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("hyderabada");
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String oldPlaceValue = "";
		for(int i=0; ; i++) {
			if(i==0) {
				driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.ARROW_UP);
			}
			else {
				driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.ARROW_DOWN);
			}
			String place = (String) js.executeScript("return document.getElementById('src').value");

			if(oldPlaceValue.equalsIgnoreCase(place)) {
				break;
			}
			System.out.println(place);
			oldPlaceValue = place;

		}
	}


}

