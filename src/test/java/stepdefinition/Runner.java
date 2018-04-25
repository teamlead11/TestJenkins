package stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = { "stepdefinition" }, tags = { "@textbox,@radio,@radio" }, plugin = {
		"pretty", "json:target/cucumber-json-report" })
public class Runner {

}
