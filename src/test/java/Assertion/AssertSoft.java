package Assertion;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSoft {
@Test
public void assertMethods() {
	String expected_result="https://demowebshop.tricentis.com";
	String a="satya";
	String b=null;
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//enter into DWS page
	driver.get("https://demowebshop.tricentis.com/");
	SoftAssert ass=new SoftAssert();
	String actual_result = driver.getCurrentUrl();
	//assertEquals(expected_result,actual_result);
	boolean result = expected_result.equals(actual_result);
	ass.assertTrue(result);
	driver.findElement(By.id("small-searchterms")).sendKeys("Satya");
	ass.assertNull(a);
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	ass.assertAll();
}
}
