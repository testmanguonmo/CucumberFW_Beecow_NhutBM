package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.beecow.LogInPage;

import commons.CommonTestcase;
import cucumber.api.java.en.Given;

public class OpenBrowserSteps {

	WebDriver driver;

	LogInPage logInPage;

	public OpenBrowserSteps() {
		driver = CommonTestcase.openMultiBrowser("chrome", "version", "url");
		logInPage = PageFactory.initElements(driver, LogInPage.class);
	}

	@Given("^I navigate to Beecow and click Dang nhap$")
	public void i_navigate_to_Beecow_and_click_Dang_nhap() {
		logInPage.clickDangNhap_BTT();
	}

}
