package Login;

import org.testng.annotations.Test;

import Base.BaseTest;
import pages.LoginPage;
 
//use the inheritance

public class LoginTest extends BaseTest {
	
	
	@Test
	public void LoginTest()
	{
	
	//object 
	LoginPage loginPage = new LoginPage(driver);
	
	loginPage.Login("Admin","admin123");
	
}
	
}

