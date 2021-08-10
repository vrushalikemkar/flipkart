package pom;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchmobile {
	private WebDriver driver;
	@FindBy(xpath="//img[@alt=\'Mobiles\']")
	private WebElement mobile;
	@FindBy(xpath="//img[@src=\"https://rukminim1.flixcart.com/flap/50/50/image/44f58163e3dbaf0d.jpg?q=50\"]")
	private WebElement Realme;
	@FindBy(xpath="//img[@alt='POCO M3 (Power Black, 64 GB)']")
	private WebElement image;

	public searchmobile(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void m1()
{
	//Actions act=new Actions(driver);
	//act.moveToElement(Realme).perform();
	//act.click().perform();
	mobile.click();
}
public void m2()
{
	Realme.click();

}
public void m3()
{
	image.click();
	//ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
	//List<WebElement> addr1 = driver.findElements(By.xpath("//img[@alt='POCO M3 (Power Black, 64 GB)'][1]"));
	
	
	//driver.switchTo().window(addr.get(1));
	//String url1 = driver.getCurrentUrl();
}
}
