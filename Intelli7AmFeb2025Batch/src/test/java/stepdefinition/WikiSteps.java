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



        Assert.assertEquals("14.81%",context.pom.wikiHomePage().getShareHoldingHolder().get("Public"));
        Assert.assertEquals("0.25%",context.pom.wikiHomePage().getShareHoldingHolder().get("Others").trim());
    }

    @Given("Validate the text")
    public void validateTheText() {

        context.pom.learnMorePage().clickChangeText();
        Assert.assertEquals("Hello, Learn More Aspirants",context.pom.learnMorePage().getChangeText());
    }

    @Given("user handles the drag and drop")
    public void userHandlesTheDragAndDrop() {
        context.pom.amazonHomePage().handleDrag();
    }
}
