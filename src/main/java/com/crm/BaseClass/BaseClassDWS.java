package com.crm.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClassDWS {
	public static WebDriver driver;
@BeforeClass
public void beforeClass() {
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
@BeforeMethod
public void beforeMethod() {
	System.out.println("welcome to the page");
}
@AfterMethod
public void afterMethod() {
	System.out.println("Thanks for Comming");
}
@AfterClass
public void afterClass() {
	driver.quit();
}
}
