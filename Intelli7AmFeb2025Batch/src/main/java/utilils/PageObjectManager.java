package utilils;

import org.openqa.selenium.WebDriver;
import pageobjects.AmazonHomePage;
import pageobjects.SearchResultPage;
import pageobjects.WikiHomePage;

public class PageObjectManager {

    WebDriver driver ;

    public  PageObjectManager(WebDriver driver){
        this.driver = driver ;
    }

    public AmazonHomePage amazonHomePage(){
        AmazonHomePage a = new AmazonHomePage(driver);
        return a ;
    }

    public SearchResultPage searchResultPage(){
        SearchResultPage s = new SearchResultPage(driver);
        return s;
    }

    public WikiHomePage wikiHomePage(){
        WikiHomePage wikiPage = new WikiHomePage(driver);
        return wikiPage;
    }
}
