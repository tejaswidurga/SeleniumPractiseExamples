package pk1BasicScripts;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ex18ManagingCookies {
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Teja\\\\Software\\\\Drivers\\\\chromedriver_ver80\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.trivago.in");
		@SuppressWarnings("unused")
		Set<Cookie> st=driver.manage().getCookies();
		System.out.println("****Before Deleting*******");
		for(Cookie ck : st) {
			System.out.println(ck.getName()+" : "+ck.getDomain());
			}
		
		//delete all the cookies:
		System.out.println(((((("at deleting"))))));
		driver.manage().deleteAllCookies();
		
		//after deletion:
		System.out.println("****after Deleting*******");
		Set<Cookie> st1=driver.manage().getCookies();
		for(Cookie ck : st1) {
			System.out.println(ck.getName()+" : "+ck.getDomain());
			}
		}
}
