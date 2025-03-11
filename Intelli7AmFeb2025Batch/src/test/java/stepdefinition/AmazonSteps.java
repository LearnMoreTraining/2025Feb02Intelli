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
import utilils.BrowserBase;

import java.io.IOException;

public class AmazonSteps {

    WebDriver driver ;
    WebElement categoryDropdownNode ;

    @Given("user navigate to amazon homepage")
    public void homePage() throws IOException {
        BrowserBase b = new BrowserBase();
      driver =  b.browserBase(); //return
    }

    @When("user enter the search keyword {string}")
    public void userEnterTheSearchKeyword(String productName) {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(productName);
        driver.findElement(By.cssSelector("a[id='twotabsearchtextbox']")).sendKeys(productName);
    }

    @And("user clicks the search icon")
    public void userClicksTheSearchIcon() {
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Then("user validates the dropdown values")
    public void validateDropdownValues() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("productName");
    }

    @Then("validate the title of the page")
    public void validateTheTitleOfThePage() {
       String title = driver.getTitle();
        System.out.println(title);
    }



    @When("user extracts the dropdown values")
    public void userExtractsTheDropdownValues() {

         categoryDropdownNode = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
       int dropdownSize = categoryDropdownNode.findElements(By.tagName("option")).size();
        System.out.println(dropdownSize);

        for (int i = 0 ; i < dropdownSize ; i++){
            System.out.println( categoryDropdownNode.findElements(By.tagName("option")).get(i).getText());
        }

    }

    @And("user {string} xyz")
    public void sample(String a){

    }

    @And("user select the value from the dropdown")
    public void userSelectTheValueFromTheDropdown() {

        Select s = new Select(categoryDropdownNode);
       // s.selectByIndex(10);
        s.selectByVisibleText("Baby");
       // s.selectByValue("search-alias=fashion");
    }

    @When("user clicks on baby wishlist")
    public void clickBabyList() {
        WebElement accountListSection = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

        Actions actions = new Actions(driver);
        actions.clickAndHold(accountListSection).build().perform();
        driver.findElement(By.linkText("Baby Wishlist")).click();
     //   driver.findElement(By.partialLinkText("by Wish")).click();
    }

    @Then("user validate the field name")
    public void userValidateTheFieldName() {

        Assert.assertEquals("Your -stop wishlist for all your baby and pregnancy needs.",  driver.findElement(By.xpath("//P[@class='a-spacing-none a-size-base-plus']")).getText());
      //  driver.findElement(By.cssSelector(".a-spacing-none.a-size-base-plus"));
    }
}
