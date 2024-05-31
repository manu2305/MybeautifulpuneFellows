package TestNgBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("connecting to the Data Base");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("precondition for test Runner");
	}
	@BeforeClass
	public void beforeClass() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into DWS page
		driver.get("https://demowebshop.tricentis.com/");
		}
	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}
	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}
	@AfterClass
	public void afterClass() {
		driver.close();
	}
	@AfterTest
	public void afterTest() {
		System.out.println("post Conditions for test Runner ");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("dis connect for dataBase");
	}
}
