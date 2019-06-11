package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.beecow.LogInPage;

import commons.CommonTestcase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LogInSteps extends CommonTestcase {

	WebDriver driver;

	LogInPage logInPage;

	public LogInSteps() {
		driver = CommonTestcase.driver;
		logInPage = PageFactory.initElements(driver, LogInPage.class);
	}

	@Given("^I navigate to Beecow \"(.*?)\"$")
	public void i_navigate_to_Beecow(String url) {
		logInPage.openBeecow(url);
	}

	@When("^I click button Dang Nhap$")
	public void i_click_button_Dang_Nhap() {
		logInPage.clickDangNhap_BTT();

	}

	@When("^I input data \"(.*?)\" to username$")
	public void i_input_data_to_username(String value) {
		logInPage.inputPOPUP_UserName_TXT(value);

	}

	@When("^I input data \"(.*?)\" to password$")
	public void i_input_data_to_password(String value) {
		logInPage.inputPOPUP_PassWord_TXT(value);

	}

	@When("^i click button Dang Nhap on popup$")
	public void i_click_button_Dang_Nhap_on_popup() {
		logInPage.clickPOPUP_DangNhap_BTT();
		
	}
	@Given("^I click Dang nhap$")
	public void click_Dang_nhap() {
		logInPage.clickDangNhap_BTT();
	}

}
