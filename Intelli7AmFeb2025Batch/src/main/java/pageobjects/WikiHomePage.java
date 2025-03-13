package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikiHomePage {

    WebDriver driver;

    public WikiHomePage(WebDriver driver) {
        this.driver = driver ;
    }

    public void extractYearValue(){
       int size = driver.findElements(By.xpath("//table[@class='wikitable floatright']//tr/td[1]")).size();
       for(int i=0 ; i < size ; i++){
          String yearValue = driver.findElements(By.xpath("//table[@class='wikitable floatright']//tr/td[1]")).get(i).getText();
           System.out.println(yearValue);
       }
    }

    public void extractFortune500Value(){
        int size = driver.findElements(By.xpath("//table[@class='wikitable floatright']//tr/td[2]")).size();
        for(int i=0 ; i < size ; i++){
            String yearValue = driver.findElements(By.xpath("//table[@class='wikitable floatright']//tr/td[2]")).get(i).getText();
            System.out.println(yearValue);
        }
    }
}
