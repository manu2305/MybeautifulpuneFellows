package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import TestNgBasic.BaseClass;

public class AssertEqual{
@Test
public void hardAssert() {
	String expected_result="https://demowebshop.tricentis.com/";
	String a="satya";
	String b=null;
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//enter into DWS page
	driver.get("https://demowebshop.tricentis.com/");
	String actual_result = driver.getCurrentUrl();
	//assertEquals(expected_result,actual_result);
	boolean result = expected_result.equals(actual_result);
	assertTrue(result);
	driver.findElement(By.id("small-searchterms")).sendKeys("Satya");
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	
}
}
