package ScreenShot;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClassDWS;
import com.crm.pom.DwsLoginPage;

public class CaptureScreenShotOnFailed extends BaseClassDWS{
@Test
public void dwsLoginCorrect() {
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	DwsLoginPage dws=new DwsLoginPage(driver);
	dws.username("admin01@gmail.com");
	dws.password("admin01");
	dws.login_button();
	driver.findElement(By.xpath("//a[text()='Log out']")).click();
}
@Test
public void dwsLoginwrong() {
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	DwsLoginPage dws=new DwsLoginPage(driver);
	dws.username("admin01@gmail.com");
	dws.password("admin02");
	dws.login_button();
	driver.findElement(By.xpath("//a[text()='Log out']")).click();
}
@Test
public void redbus() {
	driver.get("https://www.redbus.in/");
	assertEquals("mani", "manu");
}
}
