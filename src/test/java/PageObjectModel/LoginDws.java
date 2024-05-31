package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DwsLoginPage;

public class LoginDws {
@Test
public void login() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/login");
	DwsLoginPage dws=new DwsLoginPage(driver);
	Thread.sleep(2000);
	dws.username("admin01@gmail.com");
	dws.password("admin01");
	dws.login_button();
	
}
}
