package TestNgBasic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ShopperStack {
@Test
public void shopperLogin() throws IOException {
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize
	driver.manage().window().maximize();
	//waiting condition
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream(".\\ConfigFile\\Shopperstack.properties");
	prop.load(fis);
	String url = prop.getProperty("url");
	String username = prop.getProperty("username");
	String password = prop.getProperty("password");
	driver.get(url);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
	 WebElement login_button = driver.findElement(By.id("loginBtn"));
	 if(login_button.isEnabled()) {
		 login_button.click();
		 driver.findElement(By.id("Email")).sendKeys(username);
         driver.findElement(By.id("Password")).sendKeys(password);
         driver.findElement(By.xpath("//span[text()='Login']")).click();
	 }
	 else {
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();", login_button);
	 }
}
}
