package TestNgTravel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AbhiAbhi {
	@Parameters("url")
@Test(groups = "regression")
public void abhiBus(String url) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	Thread.sleep(2000);
	driver.close();
}
}
