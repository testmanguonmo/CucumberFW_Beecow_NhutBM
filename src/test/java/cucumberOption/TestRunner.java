package cucumberOption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

//Thay ten class can chay DataTable.feature
@CucumberOptions(features = "src/test/java/features/Feature_01_LogIn.feature", monochrome = true, glue = { "stepDefinitions" })

public class TestRunner {

}