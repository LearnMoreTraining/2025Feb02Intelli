package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resources/testdesign"},
        glue = {"stepdefinition"},
        tags = "@sc01",
        plugin = {"pretty"}
)

public class Runner {

}
