package cucumberOption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

//Thay ten class can chay DataTable.feature

//tags = {"@HomePage" } de chay tung file, bo sau glue
@CucumberOptions(features = "src/test/java/features", monochrome = true, glue = { "stepDefinitions" })

public class TestRunner {

}