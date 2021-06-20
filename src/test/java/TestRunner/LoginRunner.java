package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)				
@CucumberOptions(features="D:\\Selenium_Workspace\\bdd\\src\\test\\java\\FeatureFile\\Login.feature",glue={"StepDefinition"}
, monochrome = true //display the console output in a proper readable format
)

public class LoginRunner 	

{		
	
	
}
