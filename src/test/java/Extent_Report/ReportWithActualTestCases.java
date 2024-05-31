package Extent_Report;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.crm.BaseClass.BaseClassDWS;
import com.crm.pom.DwsLoginPage;
@Listeners(com.crm.listernersCode.GenerateExtentReport.class)
public class ReportWithActualTestCases extends BaseClassDWS {
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
		assertEquals("123", "321");
	}
	@Test(dependsOnMethods = "dwsLoginwrong")
	public void redbus() {
		driver.get("https://www.redbus.in/");
	}
}
