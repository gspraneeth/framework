package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\"

,tags = "@login"
,glue = "cucumber"
,plugin = "html:reports")

public class testrunner extends AbstractTestNGCucumberTests{
	
}

