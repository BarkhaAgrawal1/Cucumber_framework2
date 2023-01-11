package stepdefination;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features =  "C:\\Users\\deepa\\Documents\\Barkha new intellij\\Cucumberproject2\\src\\test\\java\\Cucumber_Feature\\cucumber.feature",
        glue={"stepdefination"},plugin = {"pretty","html:target/Cucumberreport1.html"}
        )


public class TestRunner {
}
