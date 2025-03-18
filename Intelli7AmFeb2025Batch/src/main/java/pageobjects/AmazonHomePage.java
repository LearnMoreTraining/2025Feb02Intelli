package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilils.ExcelHandler;

public class AmazonHomePage {

   private WebDriver driver ;

    public AmazonHomePage(WebDriver driver){
        this.driver = driver;
    }
    public AmazonHomePage enterProductName(String productName){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
        return this;
    }

    public AmazonHomePage enterProductName(String sheet, int row , int col){

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(ExcelHandler.readExcelData(sheet,row,col));
        return this;
    }

    public AmazonHomePage clickSearchIcon(){

        driver.findElement(By.id("nav-search-submit-button")).click();
        return this;
    }

    public void selectValueInCategoryDropdown(){

    }

    public void getDropdownValues(){

    }

}
