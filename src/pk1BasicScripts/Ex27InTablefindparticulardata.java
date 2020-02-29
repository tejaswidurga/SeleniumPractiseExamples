package pk1BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex27InTablefindparticulardata {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Teja\\\\Software\\\\Drivers\\\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Teja/Selenium%20Programming/selenium-downloads-master/selenium-downloads-master/index/index.html");
		int noOfTrs = driver.findElements(By.xpath("//div[@id='tabledetails']/table/tbody/tr/td")).size();
		for(int i=0; i<noOfTrs; i++) {
			WebElement row = driver.findElements(By.xpath("//div[@id='tabledetails']/table/tbody/tr")).get(i);

			if(row.findElements(By.tagName("td")).get(0).getText().equalsIgnoreCase("ganesh")) {
				System.out.println(row.findElements(By.tagName("td")).get(1).getText());
				break;
			}
		}
	}
}

