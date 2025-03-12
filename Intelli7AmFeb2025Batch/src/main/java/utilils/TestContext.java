package utilils;


import java.io.IOException;

public class TestContext {

   public BrowserBase browser;
   public PageObjectManager pom;

    public TestContext() throws IOException {
        browser = new BrowserBase();
        pom = new PageObjectManager(browser.browserBase());
    }


}
