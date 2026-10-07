package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
protected WebDriver driver;

@BeforeMethod
public void setup() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	//https://admin-demo.nopcommerce.com/login?returnUrl=%2Fadmin%2F"
}
/*
@AfterMethod
public void tearDown() {
	
 if(driver!= null )
	 
 { 
	driver.quit();
	
 }

}
*/

}
