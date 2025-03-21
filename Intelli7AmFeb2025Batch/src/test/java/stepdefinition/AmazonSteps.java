package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pageobjects.AmazonHomePage;
import utilils.BrowserBase;
import utilils.TestContext;

import java.io.IOException;

public class AmazonSteps {

    TestContext context;

    public AmazonSteps(TestContext context){
        this.context = context;
    }

    @When("user enter the search keyword {string}")
    public void userEnterTheSearchKeyword(String productName) {

       context.pom.amazonHomePage().enterProductName(productName);
 }

    @And("user clicks the search icon")
    public void userClicksTheSearchIcon() {

    }

    @Then("user validates the dropdown values")
    public void validateDropdownValues() {

        Assert.assertEquals("it failed in ","","");
    }

    @Then("validate the title of the page")
    public void validateTheTitleOfThePage() {

    }



    @When("user extracts the dropdown values")
    public void userExtractsTheDropdownValues() {

//         categoryDropdownNode = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
//       int dropdownSize = categoryDropdownNode.findElements(By.tagName("option")).size();
//        System.out.println(dropdownSize);
//
//        for (int i = 0 ; i < dropdownSize ; i++){
//            System.out.println( categoryDropdownNode.findElements(By.tagName("option")).get(i).getText());
//        }

    }

    @And("user {string} xyz")
    public void sample(String a){

    }

    @And("user select the value from the dropdown")
    public void userSelectTheValueFromTheDropdown() {

//        Select s = new Select(categoryDropdownNode);
//       // s.selectByIndex(10);
//        s.selectByVisibleText("Baby");
//       // s.selectByValue("search-alias=fashion");
    }

    @When("user clicks on baby wishlist")
    public void clickBabyList() {

        Assert.assertEquals("Baby Wishlist",context.pom.amazonHomePage().howerOverAccount().switchToWindow());

    }

    @Then("user validate the field name")
    public void userValidateTheFieldName() {

    //    Assert.assertEquals("Your -stop wishlist for all your baby and pregnancy needs.",  driver.findElement(By.xpath("//P[@class='a-spacing-none a-size-base-plus']")).getText());
      //  driver.findElement(By.cssSelector(".a-spacing-none.a-size-base-plus"));
    }

    @Given("user handles the alert")
    public void userHandlesTheAlert() {
        context.browser.browserBase().findElement(By.cssSelector(".btn.btn-danger")).click();
        context.browser.browserBase().switchTo().alert().sendKeys("abc");
        context.browser.browserBase().switchTo().alert().accept();
        System.out.println( context.browser.browserBase().switchTo().alert().getText());
    }
}
