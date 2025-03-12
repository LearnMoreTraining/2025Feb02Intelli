package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage {

   private WebDriver driver ;

    public AmazonHomePage(WebDriver driver){
        this.driver = driver;
    }
    public void enterProductName(String productName){

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
    }

    public void clickSearchIcon(){

        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public void selectValueInCategoryDropdown(){

    }

    public void getDropdownValues(){

    }

}
