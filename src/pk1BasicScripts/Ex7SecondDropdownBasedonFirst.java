package pk1BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex7SecondDropdownBasedonFirst {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Teja\\Software\\Drivers\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://css-tricks.com/examples/DynamicDropdown/");
		//pulls from text files
		
		
//		Select s = new Select(driver.findElement(By.xpath("//select[@id='text-one']")));
//		s.selectByValue("snacks");
//		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='text-two']")));
//		s1.selectByValue("chips");
//		
		//pulls frm json files
		
		
//		Select s2 = new Select(driver.findElement(By.xpath("//select[@id='json-one']")));
//		s2.selectByValue("beverages");
//		@SuppressWarnings("unused")
//		Select s3 = new Select(driver.findElement(By.xpath("//select[@id='json-two']")));
//		 s3.selectByValue("coke");
		 
		 //pulls from mysql database
		
		Select s = new Select(driver.findElement(By.xpath("//select[@id='db-one']")));
		s.selectByValue("snacks");
		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='db-two']")));
		s1.selectByValue("chips");
		}
}
	




