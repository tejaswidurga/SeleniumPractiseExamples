package pk1BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex6Dropdownlists {

	

			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\Teja\\Software\\Drivers\\chromedriver_ver80\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("file:///C:/Teja/Selenium%20Programming/selenium-downloads-master/selenium-downloads-master/index/index.html");
				
				//Create object for Select class
				Select sel = new Select(driver.findElement(By.xpath("//select[@id='cars_single_selection']")));
				
				//Using Select By Index
//				sel.selectByIndex(0);
//				Thread.sleep(1000);
//				sel.selectByIndex(1);
//				Thread.sleep(1000);
//				sel.selectByIndex(2);
//				Thread.sleep(1000);
//				sel.selectByIndex(3);
//				Thread.sleep(1000);
				
				//Using selectByValue()
//				sel.selectByValue("saab");
//				Thread.sleep(1000);
//				sel.selectByValue("mercedes");
//				Thread.sleep(1000);
//				sel.selectByValue("audi");
//				Thread.sleep(1000);
//				sel.selectByValue("volvo");
//				Thread.sleep(1000);
				
				//Using selectByVisibleText()
				sel.selectByVisibleText("Saab 1");
				Thread.sleep(1000);
				sel.selectByVisibleText("Mercedes 1");
				Thread.sleep(1000);
				sel.selectByVisibleText("Audi 1");
				Thread.sleep(1000);
				sel.selectByVisibleText("Volvo 1");
				Thread.sleep(1000);
			}

		


		// TODO Auto-generated method stub

	}


