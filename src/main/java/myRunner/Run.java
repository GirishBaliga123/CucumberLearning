package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\SundayFW\\BDDAutomation\\src\\main\\java\\feature\\contacts.feature",
		 //the path of the feature files
		glue={"stepDefinition"}, //the path of the step definition files
		plugin={"pretty","html:test-output","json:json-output/cucumber.json","junit:junit_xml/cucumber.xml"},
		strict=true,
		monochrome=true,
		dryRun=true  //maping between feature and step definiation
		)

public class Run {

}
