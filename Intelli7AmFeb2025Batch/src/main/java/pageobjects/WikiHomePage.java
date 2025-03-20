package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public List<String> getAcquisitionsColumnValues(String columnIndex){
        List<String> columnValue = new ArrayList<String>();
        for(int i=0 ; i <  driver.findElements(By.xpath("//table[@class='wikitable']//tr/td[1]")).size() ;i++){
           columnValue.add( driver.findElements(By.xpath("//table[@class='wikitable']//tr/td["+columnIndex+"]")).get(i).getText());
        }
        return columnValue;
    }

    public List<String> getShareHolder(){

        List <WebElement> shareholder = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[1]"));
        List <String> shareholderValues = new ArrayList<>();
        for(WebElement e:shareholder){
            shareholderValues.add(e.getText());
        }
        return shareholderValues;
    }

    public List<String> getShareHolding(){

        List <WebElement> shareholder = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[2]"));
        List <String> shareholdding = new ArrayList<>();
        for(WebElement e:shareholder){
            shareholdding.add(e.getText());
        }
        return shareholdding;
    }

    public Map<String, String> getShareHoldingHolder(){
      int siz =  driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[1]")).size();
        Map<String , String> m = new HashMap<String , String>();
        for(int i =0 ; i < siz ; i++){

          String key=  driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[1]")).get(i).getText();
           String value = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[2]")).get(i).getText();
            m.put(key,value);
        }

        System.out.println(m);

        return m;
    }


}
