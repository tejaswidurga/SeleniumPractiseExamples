package pk1BasicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex28ReadingTablesonanotherpage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Teja\\\\Software\\\\Drivers\\\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/markets/earnings/results-calendar/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String pageNo = "12";

		String lastPageStr = driver.findElement(By.xpath("//a[text()='Next']//parent::li//preceding-sibling::li[1]/a")).getText();
		
		if(Integer.parseInt(pageNo) <= Integer.parseInt(lastPageStr)) {
			for(int j=0;;j++) {
				String activePageNo = driver.findElement(By.xpath("//li[@class='fg-button ui-button ui-state-default active']/a")).getText();
				if(activePageNo.equalsIgnoreCase(pageNo)){
					for(int i=0; i<driver.findElements(By.xpath("//td")).size(); i++)
					{
						System.out.println(driver.findElements(By.xpath("//td")).get(i).getText());
					}
					break;
				}
				else {
					driver.findElement(By.xpath("//a[text()='Next']")).click();
				}
			}
		}
		else {
			System.out.println("Page given: "+pageNo);
			System.out.println("Last Page Available: "+lastPageStr);
			System.out.println("Invalid Page No");
		}
		
		driver.close();

}
}
