package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	
	private WebDriver driver;
	
	
	// Constructor
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// locators
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginbutton;
	
	
	//Action 
	public void Login(String user, String pass)
	{
		
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(username));

		username.sendKeys(user);
		password.sendKeys(pass);
		loginbutton.click();
		
		
	}
	
	
}
