
package pk1BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ex4practicingmethods {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Teja\\Software\\Drivers\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Teja/Selenium%20Programming/selenium-downloads-master/selenium-downloads-master/index/index.html");
		//Using sendKeys() method:
		Thread.sleep(2000);
		WebElement we1 = driver.findElement(By.xpath("//input[@id='firstname']"));
		we1.sendKeys("test");
		Thread.sleep(2000);
		//using clear method:
		driver.findElement(By.xpath("//input[@id='firstname']")).clear();
		Thread.sleep(2000);
		//finding no.of elements:
		int noOfElements = driver.findElements(By.xpath("//input[@id='firstname']")).size();
		System.out.println("No. of elements are "+noOfElements);
		//finding tag size:
		noOfElements = driver.findElements(By.tagName("input")).size();
		System.out.println("No. of elements are "+noOfElements);
		//insert same to second tag:
		driver.findElements(By.tagName("input")).get(1).sendKeys("hello");
		//finding checkboxes:
		int noOfCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println("No of Check boxes are "+noOfCheckboxes);
		//finding particular checkboxes:
		int noOfCheckboxesInGroup1 = driver.findElements(By.xpath("//div[@id='cbgroup1']//input[@type='checkbox']")).size();
		System.out.println("No of Check boxes in group 1 are "+noOfCheckboxesInGroup1);
		//finding elements checkboxes:
		WebElement we2 = driver.findElement(By.xpath("//div[@id='cbgroup1']"));
		System.out.println("No. of elements in gr1 are "+we2.findElements(By.xpath(".//input[@type='checkbox']")).size());
		//clicking 10 times a radio buttons:
		int noOfRadioButtons = driver.findElements(By.xpath("//input[@type='radio']")).size();
		for(int i=0; i<10; i++) {
			for(int j=0; j<noOfRadioButtons; j++) {
				driver.findElements(By.xpath("//input[@type='radio']")).get(j).click();
				Thread.sleep(100);
			}
		}
		//finding attributes:
		for(int j=0; j<noOfRadioButtons; j++) {
			System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).get(j).getAttribute("value"));
		}
		//finding if it equals:
		for(int j=0; j<noOfRadioButtons; j++) {
			if(driver.findElements(By.xpath("//input[@type='radio']")).get(j).getAttribute("value").equalsIgnoreCase("female")) {
				driver.findElements(By.xpath("//input[@type='radio']")).get(j).click();
				break;
			}
		}
	}
}
	


