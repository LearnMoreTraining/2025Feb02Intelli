package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LearnMorePage {
    WebDriver driver;
    public LearnMorePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickChangeText(){
        driver.findElement(By.cssSelector("#quote")).click();
    }

    public String getChangeText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        wait.pollingEvery(Duration.ofSeconds(3));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Hello, Learn More Aspirants']")));
       return driver.findElement(By.xpath("//*[text()='Hello, Learn More Aspirants']")).getText();
    }
}
