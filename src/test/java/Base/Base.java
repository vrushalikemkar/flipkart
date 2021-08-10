package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
		public static WebDriver openChromeBrowser()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			return driver;
		}
		//public static WebDriver openFirefoxBrowser()
//		{
//			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\chromedriver.exe");
//			
////			WebDriver driver = new FirefoxDriver();
}


