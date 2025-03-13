package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilils.TestContext;

public class WikiSteps {
    TestContext context;
    public WikiSteps(TestContext context){
        this.context = context;
    }

    @Given("user extracts the year and Fortune column values")
    public void extractValues(){

        context.pom.wikiHomePage().extractYearValue();
        context.pom.wikiHomePage().extractFortune500Value();
    }

    @Then("validate the mapping of year to fortune values")
    public void validateTheMappingOfYearToFortuneValues() {

    }
}
