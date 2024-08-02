package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\sel-learning\\Sel@11AM(EST)\\workspace\\CucumberProj\\src\\main\\java\\features"
		,glue={"stepDefinations"}
		,plugin= {"pretty","json:target/myReports/report.json",
							"junit:target/myReports/report.xml"}

		
		)

public class TestRunner {

}
