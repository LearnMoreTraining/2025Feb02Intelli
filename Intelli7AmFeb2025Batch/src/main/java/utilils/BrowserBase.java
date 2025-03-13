package utilils;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BrowserBase {

    WebDriver driver ;

    public WebDriver browserBase() throws IOException {

        if(driver == null) {

            File f = new File("src/main/resources/confi/frameworkconfig.properties");
            FileInputStream fis = new FileInputStream(f);
            Properties prop = new Properties();
            prop.load(fis);
            prop.getProperty("browser"); // chrome

            if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            } else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            } else if (prop.getProperty("browser").equalsIgnoreCase("safari")) {
                driver = new SafariDriver();
            } else {
                throw new InvalidArgumentException("Enter the valid browser name");
            }

            driver.get(prop.getProperty("environment"));
        }
        return driver;
    }
}
