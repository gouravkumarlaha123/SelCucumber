package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\gourav\\Desktop\\BDD1\\SelCucumber123\\src\\test\\java\\Feature"
		,glue={"stepDefinition"}
		,plugin= {"pretty","html:target"}
		)



public class TestRunner {

}
