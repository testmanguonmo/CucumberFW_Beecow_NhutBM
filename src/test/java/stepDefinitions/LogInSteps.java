package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.beecow.HomePage;
import com.beecow.LogInPage;

import commons.CommonTestcase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInSteps extends CommonTestcase {
	
	WebDriver driver;
	
	LogInPage logInPage;
	
	
	public LogInSteps()
	{
		driver= CommonTestcase.openMultiBrowser("chrome", "version", "url");
		logInPage = PageFactory.initElements(driver, LogInPage.class);
	}
	
	@Given("^I navigate to Beecow and click Dang nhap$")
	public void i_navigate_to_Beecow_and_click_Dang_nhap(){
		logInPage.clickDangNhap_BTT();
	    
	}

	@When("^I click submit account$")
	public void i_click_submit_account(){

	    logInPage.clickPOPUP_DangNhap_BTT();
	}

//	@Then("^Verify successfully with message \"(.*?)\"$")
//	public void verify_successfully_with_message(String arg1){
//		verifyEqual(logInPage.getTextPOPUP_DangNhap_BTT(), arg1);
//	    
//	}
	
	@When("^I input data \"(.*?)\" to username$")
	public void i_input_data_to_username(String arg1) {
	    logInPage.inputPOPUP_UserName_TXT(arg1);
	    
	}

	
}
