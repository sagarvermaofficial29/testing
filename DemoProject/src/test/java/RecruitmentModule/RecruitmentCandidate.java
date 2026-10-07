package RecruitmentModule;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.BaseTest;
import pages.RecruitmentPage;

public class RecruitmentCandidate extends BaseTest {

	@Test
	
	public void recruitmentCandidate(WebDriver driver)
	{
		
		RecruitmentPage RP = new RecruitmentPage(driver);
		
		RP.RecruitmentClick();
		RP.addbuttonClick();
		
	}
	
	
}
