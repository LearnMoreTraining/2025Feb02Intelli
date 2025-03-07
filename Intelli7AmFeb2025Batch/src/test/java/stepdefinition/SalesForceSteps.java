package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesForceSteps {
    
    @Given("user navigate to the salesforce login page")
    public void salesforceLogin(){
        
    }

    @When("user enter the username {string} and password {string}")
    public void user_enter_the_username_and_password(String string, String string2) {

    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {

    }
    @Then("verify the error message {string}")
    public void verify_the_error_message(String string) {

    }
}
