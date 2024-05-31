package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.crm.pom.DemoWebShopBook;

public class StaleWithPom {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
	Thread.sleep(1000);
	DemoWebShopBook demo=new DemoWebShopBook(driver);
	WebElement element = demo.sortBy;
	Select s=new Select(element);
	List<WebElement> options = s.getOptions();
	
	for (WebElement web : options) {
		options = s.getOptions();
		web.click();
	}
}
}
