package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.beecow.CommonPage;

import commons.CommonTestcase;
import cucumber.api.java.en.Then;

public class CommonSteps extends CommonTestcase {
	WebDriver driver;
	CommonPage commonPage;

	public CommonSteps() {
		driver = CommonTestcase.driver;
		commonPage = PageFactory.initElements(driver, CommonPage.class);
	}

	@Then("^Verify successfully with message \"(.*?)\" and \"(.*?)\"$")
	public void verify_successfully_with_message(String message1, String message2) {
		if (!(message1.isEmpty()) && message2.isEmpty()) {
			verifyTrue(commonPage.isDisplayed_Dynamic_Message(message1));
		} else if (message1.isEmpty() && !(message2.isEmpty())) {
			verifyTrue(commonPage.isDisplayed_Dynamic_Message(message2));
		} else if (!(message1.isEmpty()) && !(message2.isEmpty())) {
			verifyTrue(commonPage.isDisplayed_Dynamic_Message(message1));
			verifyTrue(commonPage.isDisplayed_Dynamic_Message(message2));
		}

	}

//	@Then("^Quit brower$")
//	public void quit_brower() {
//		CommonTestcase.closeBrowser();
//	}
//	@Given("^I open \"(.*?)\" page$")
//	public void i_open_page(String dynamic) {
//	  commonPage.openPage_Dynamic(dynamic);
//		
//	}

}
