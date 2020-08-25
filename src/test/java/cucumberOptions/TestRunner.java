package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(  
		plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json"},
	    features = "src/test/java/features",
	    monochrome=true,
	    glue="stepDefinations")
//public class TestRunner   {
//
//}
public class TestRunner {

}
