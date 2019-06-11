package stepDefinitions;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.beecow.CommonPage;
import com.beecow.HomePage;

import commons.CommonTestcase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends CommonTestcase {
	
	WebDriver driver;
	
	HomePage homePage;
	
	public HomePageSteps() {
		driver = CommonTestcase.driver;
		homePage = PageFactory.initElements(driver, HomePage.class);
	}
	
	@Given("^I click Kenh ban hang label$")
	public void i_click_Kenh_ban_hang_label(){
	    homePage.clickKenhBanHang_LBL();
	}


	@When("^i click Dang san pham label$")
	public void i_click_Dang_san_pham_label(){
	    homePage.clickDANGSANPHAMMOI_LBL();
	}
	
	@Then("^I verify link current$")
	public void i_verify_link_current(){
	   verifyEqual(homePage.getText_URL_UPLOADPRODUCT(), "https://www.beecow.com/page/upload-product");
	}

}
