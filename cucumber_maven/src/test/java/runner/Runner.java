package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java\\com\\cucumber_maven\\features"},
                 glue= {"com.cucumber_maven.step_definitions"},
                 plugin = { "pretty" },
                 monochrome = true
                
                 )
public class Runner {

	
	
}

