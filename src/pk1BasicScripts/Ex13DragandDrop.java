package pk1BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex13DragandDrop {
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Teja\\\\Software\\\\Drivers\\\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Teja/Selenium%20Programming/selenium-downloads-master/selenium-downloads-master/index/index.html");
		Actions ac1 = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//img[@src='images/image1.jpg']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='dvDest']"));
		ac1.dragAndDrop(source, target).build().perform();
		driver.switchTo().alert().dismiss();

	}
}
