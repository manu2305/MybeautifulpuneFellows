package TestNgBasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DwsAddToProduct extends BaseClass {
@Test
public void addToProduct() throws InterruptedException {
	//click digital download link
	driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
	//add the products by using findElements
	List<WebElement> products = driver.findElements(By.xpath("//input[@value='Add to cart']"));
	for (WebElement web : products) {
		web.click();
	}
	Thread.sleep(2000);
	
}
}




























