package StepDefinationFile;

import org.junit.runner.RunWith;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features",
		glue= {"StepDefinationFile"},
	    dryRun=false
		
		)


public class TestRunner {

}
