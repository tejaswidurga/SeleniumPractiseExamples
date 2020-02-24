package pk1BasicScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ExWebLocatorTechniques {
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Teja\\\\Software\\\\Drivers\\\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("file:///C:/Teja/Selenium%20Programming/selenium-downloads-master/selenium-downloads-master/index/index.html");
//	    driver.findElement(By.id("firstname")).sendKeys("java");
//		Thread.sleep(2000);
//		driver.findElement(By.id("firstname")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.name("firstname")).sendKeys("selenium");
//		Thread.sleep(2000);
//        driver.findElement(By.name("firstname")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.className("beautifultextbox")).sendKeys("programming");
//		Thread.sleep(2000);
//		driver.findElement(By.className("beautifultextbox")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("google the top search engine")).click();
//		Thread.sleep(2000);
//		driver.get("file:///C:/Teja/Selenium%20Programming/selenium-downloads-master/selenium-downloads-master/index/index.html");
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("rediff")).click();
//		Thread.sleep(2000);
//		driver.get("file:///C:/Teja/Selenium%20Programming/selenium-downloads-master/selenium-downloads-master/index/index.html");
//		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("the top search")).click();
//		Thread.sleep(2000);
		driver.get("file:///C:/Teja/Selenium%20Programming/selenium-downloads-master/selenium-downloads-master/index/index.html");
		driver.findElement(By.xpath("//input[@id='first name']")).sendKeys("teja");
				

	}
	
}
