package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import utilils.TestContext;

public class SalesForceSteps {
    TestContext context;
    public SalesForceSteps(TestContext context){
        this.context = context;
    }
    @Given("user navigate to the salesforce login page")
    public void salesforceLogin(){
        
    }

    @When("user enter the username {string} and password {string}")
    public void user_enter_the_username_and_password(String string, String string2) {

       WebElement username = context.browser.browserBase().findElement(By.id("username"));
       WebElement pasword =  context.browser.browserBase().findElement(By.id("password"));

       username.sendKeys("anc");
       pasword.sendKeys("123");

        context.browser.browserBase().navigate().refresh();
        try {
            username.sendKeys("anc");
            pasword.sendKeys("123");
        }
        catch (StaleElementReferenceException e){
             username = context.browser.browserBase().findElement(By.id("username"));
             pasword =  context.browser.browserBase().findElement(By.id("password"));
            username.sendKeys("anc");
            pasword.sendKeys("123");
        }


    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {

    }
    @Then("verify the error message {string}")
    public void verify_the_error_message(String string) {

    }




}
