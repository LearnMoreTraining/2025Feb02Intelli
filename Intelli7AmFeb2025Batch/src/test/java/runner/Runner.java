package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resources/testdesign"},
        glue = {"stepdefinition","hooks"},
        tags = "@sc01",
        plugin = {"pretty","html:target/report/report.html",
                "json:target/report/report.json",
                "junit:target/report/report.xml"}
)

public class Runner {

}
