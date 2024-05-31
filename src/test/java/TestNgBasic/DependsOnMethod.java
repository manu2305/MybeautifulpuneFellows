package TestNgBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethod {
@Test(priority = 3)
public void createAccount() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.chennaisuperkings.com/");
	System.out.println("account is created");
}
@Test(priority = 0,dependsOnMethods="createAccount")
public void modifyAccount() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.royalchallengers.com/");
	System.out.println("account has been modified");
}
@Test(priority = 2)
public void deleteAccount() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	System.out.println("Account has been deleted.....");
}
}
