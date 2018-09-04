package stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = { "stepdefinition" }, tags = { "@textbox,@radio,@dropdown" }, plugin = {
		"pretty", "json:/src/resources/java/cucumber-json-report.json" })

public class Runner {

}
