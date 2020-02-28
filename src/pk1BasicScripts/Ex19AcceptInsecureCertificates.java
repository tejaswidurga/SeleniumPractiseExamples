package pk1BasicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex19AcceptInsecureCertificates {
	public static  void main(String[] args) throws InterruptedException {
		ChromeOptions ops = new ChromeOptions();
				ops.setAcceptInsecureCerts(true);
				System.setProperty("webdriver.chrome.driver", "C:\\\\Teja\\\\Software\\\\Drivers\\\\chromedriver_ver80\\chromedriver.exe");
				WebDriver driver = new ChromeDriver(ops);
				driver.get("https://localhost/carrental/index.php");
				}
}

