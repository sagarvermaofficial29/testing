package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {

	private WebDriver driver;
	
	//constructor
	
	public RecruitmentPage (WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//span[text()='Recruitment']")
	private WebElement Recruitment ;
	
	@FindBy(xpath="//button[text()=' Add ']")
	private WebElement addButton;
	
	
	
	public void RecruitmentClick()
	{ 
		Recruitment.click();
	
	}
	
	public void addbuttonClick()
	{
		addButton.click();
	
	}
	
	
	
     
	
	
	
	
	
	
	
	
	
}
