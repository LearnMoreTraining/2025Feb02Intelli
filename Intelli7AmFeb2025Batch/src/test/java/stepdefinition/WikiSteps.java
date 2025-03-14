package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilils.TestContext;

import java.util.List;

public class WikiSteps {
    TestContext context;
    public WikiSteps(TestContext context){
        this.context = context;
    }

    @Given("user extracts the year and Fortune column values")
    public void extractValues(){

     List<String> d = context.pom.wikiHomePage().getAcquisitionsColumnValues("2");
     boolean flag = false;
     for(String j:d){
            if(j.equals("Netherlands")){
                flag = true;
                Assert.assertTrue(flag);
                break;
            }
        }
     Assert.assertTrue(flag);
        Assert.assertEquals("New Zealand",context.pom.wikiHomePage().getAcquisitionsColumnValues("2").get(1));
    }

    @Then("validate the mapping of year to fortune values")
    public void validateTheMappingOfYearToFortuneValues() {

    }
}
