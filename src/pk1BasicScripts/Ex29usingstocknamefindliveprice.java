package pk1BasicScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex29usingstocknamefindliveprice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Teja\\\\Software\\\\Drivers\\\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/markets/earnings/results-calendar/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String stockName = "Alka india";

		String lastPageStr = driver.findElement(By.xpath("//a[text()='Next']//parent::li//preceding-sibling::li[1]/a")).getText();
		

		outer: for(int j=0; j<Integer.parseInt(lastPageStr); j++) {
			List<WebElement> rows = driver.findElements(By.xpath("(//table)[2]/tbody/tr"));
			for(int i=0; i<rows.size(); i++) {
				String firstTd = rows.get(i).findElements(By.xpath(".//td")).get(0).getText();
				if(firstTd.equalsIgnoreCase(stockName)){
					System.out.println("Live Price: "+rows.get(i).findElements(By.xpath(".//td")).get(2).getText());
					break outer;
				}
			}
			driver.findElement(By.xpath("//a[text()='Next']")).click();
			
		}
		driver.close();

}
}
