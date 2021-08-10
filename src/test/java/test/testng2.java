package test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Base;
import pom.LoginPage;
import pom.addtocart;
import pom.searchmobile;

public class testng2 extends Base{
	private WebDriver driver;
	private addtocart acart;
    private LoginPage login ;
	private searchmobile search ;
	@BeforeTest
	public void launchBrowser()
	{
		driver = openChromeBrowser();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeClass
	public void beforeclass()
	{
   // System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		
	//	driver = new ChromeDriver();
		//driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login =new LoginPage(driver);
		search=new searchmobile(driver);
	    acart = new addtocart(driver);
	}
	@BeforeMethod
	public void beforeMethod()
	{	
	driver.get("https://www.flipkart.com/");
	 login.username();
	 login.password();
	login.loginbutton();
}
	@Test
	public void testMethod1() throws InterruptedException 
	{
		Thread.sleep(5000);
	search.m1();
		search.m2();
		search.m3();
	}
	@Test
	public void testMethod() throws InterruptedException 
	{
		
        acart.m1();

	}
//	@AfterMethod
//	public void test1()
//	{
	system.out.println("done");
//		driver.navigate().to("https://www.flipkart.com/");
//	}
  //  @AfterClass
//	public void test()
//	{
//		driver.close();
//	}
}


