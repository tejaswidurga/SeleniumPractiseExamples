package pk1BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex15HandlingFrames {
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Teja\\\\Software\\\\Drivers\\\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Teja/Selenium%20Programming/selenium-downloads-master/selenium-downloads-master/index/index.html");
		
		//switch in to frames:
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='frame1']")));
		driver.findElement(By.xpath("//input[@id='frfirstname']")).sendKeys("frames test");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("firstname")).sendKeys("test");

}
}
