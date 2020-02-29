package pk1BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex26TableDetails {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Teja\\\\Software\\\\Drivers\\\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Teja/Selenium%20Programming/selenium-downloads-master/selenium-downloads-master/index/index.html");
		int noOfTds = driver.findElements(By.xpath("//div[@id='tabledetails']/table/tbody/tr/td")).size();
		for(int i=0; i<noOfTds; i++) 
		{
			System.out.println(driver.findElements(By.xpath("//div[@id='tabledetails']/table/tbody/tr/td")).get(i).getText());
		}
	}	
}
