package pk1BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5findwebelementmethods {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Teja\\Software\\Drivers\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Teja/Selenium%20Programming/selenium-downloads-master/selenium-downloads-master/index/index.html");
		//using send keys method()
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("first");
		Thread.sleep(20000);
		//using clear() method
		driver.findElement(By.xpath("//input[@id='first name']")).sendKeys("first1");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@id='first name']")).clear();
		//using click method()
		driver.findElement(By.xpath("//input[@value='male']")).click();
		driver.findElement(By.xpath("//input[@value='female']")).click();
		//using getAttribute method()
		String str1=driver.findElement(By.xpath("//input[@name='last name']")).getAttribute("type");
		System.out.println("Attribute type value is "+str1);
		//using CssSelector method()
		String str2=driver.findElement(By.xpath("//label[@for='upload']")).getCssValue("color");
        System.out.println("color is: "+str2);
        //getting tag name method()
        String str3 = driver.findElement(By.cssSelector(".beautifultextbox")).getTagName();
		System.out.println("Tag Name is "+str3);
		//using hidden method()
		boolean displayed = driver.findElement(By.xpath("//div[@id='hiddentext']")).isDisplayed();
		System.out.println("Initially displayed "+displayed);
		driver.findElement(By.xpath("//button[@id='makevisible']")).click();
		Thread.sleep(1000);
		displayed = driver.findElement(By.xpath("//div[@id='hiddentext']")).isDisplayed();
		System.out.println("After click "+displayed);
		//using disable method()
		boolean enabled = driver.findElement(By.xpath("//input[@id='disabled']")).isEnabled();
		System.out.println("Text box enabled: "+enabled);
		//using selected method()
		boolean selected = driver.findElement(By.xpath("//input[@name='vehicle3']")).isSelected();
		System.out.println("Checkbox Selected: "+selected);
		
		
		
		

	}

}
