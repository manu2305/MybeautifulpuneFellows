package TestNgBasic;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchProduct {
@Test(retryAnalyzer = com.crm.listernersCode.ListenersRetry.class)
public void searchProduct() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	 //driver.findElement(By.id("small-searchterms")).sendKeys("perfumes",Keys.ENTER);
	 assertEquals("mani", "manu");
}
}
