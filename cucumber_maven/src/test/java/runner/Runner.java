package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java\\features"},
				  glue = {"step_definations"})
						 // plugin={"html:src\\reports\\rep.html"}
					
                 
                 
public class Runner {

	
	
}