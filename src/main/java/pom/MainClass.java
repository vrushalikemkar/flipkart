package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage login =new LoginPage(driver);
		login.username();
		login.password();
		login.loginbutton();
		searchmobile search=new searchmobile(driver);
		Thread.sleep(5000);
		search.m1();
		search.m2();
		search.m3();
		addtocart acart = new addtocart(driver);
		acart.m1();
		
	}

}
