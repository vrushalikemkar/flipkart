package pom;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocart {
	private WebDriver driver;
	@FindBy(xpath="//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")
	private WebElement cart;

	public addtocart(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
public void m1() throws InterruptedException
{
	//Actions act=new Actions(driver);
	//act.moveToElement(Realme).perform();
	//act.click().perform();
ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(addr.get(1));
	String url1 = driver.getCurrentUrl();
	System.out.println(url1);
	Thread.sleep(5000);
	cart.click();

	
}
}


