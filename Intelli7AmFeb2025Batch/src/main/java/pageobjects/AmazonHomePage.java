package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilils.ExcelHandler;

import java.util.Iterator;
import java.util.Set;

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

    public AmazonHomePage howerOverAccount(){
       WebElement accountListSection = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(accountListSection).build().perform();
        driver.findElement(By.linkText("Baby Wishlist")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
     //  driver.findElement(By.partialLinkText("by Wish")).click();
        return this;
    }

    public String switchToWindow(){

      Set<String> winprop =driver.getWindowHandles();
        System.out.println(winprop);
        Iterator <String > iterator = winprop.iterator();
      String parentwin =  iterator.next();
      driver.switchTo().window(iterator.next());
     // driver.findElement(By.xpath("//*[text()='Create your wishlist']")).click();
     return  driver.findElement(By.xpath("//*[text()='Baby Wishlist']")).getText();
    }

    public void switchToParentWindow(){

        driver.findElement(By.id("marketDate_2")).getAttribute("style");
        //display: block; opacity: 1; pointer-events: inherit;

    }

    public void handleDrag(){
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        Actions a = new Actions(driver);
        a.dragAndDrop(drag,drop).build().perform();
    }



}
