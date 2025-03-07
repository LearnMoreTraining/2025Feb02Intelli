package basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserInvocation {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        //get - used to navigate to URL
        driver.get("https://login.salesforce.com/");
       //driver.findElement(By.id("username")).sendKeys("abc");
     //   driver.findElement(By.name("username")).sendKeys("xyz");
        driver.findElement(By.xpath("//*[@name='fldLoginUserId']/ancestor::div[2]/following-sibling::div[3]")).sendKeys("io");
        driver.findElement(By.id("password")).sendKeys("123");
        driver.findElement(By.name("Login")).click();
       // driver.findElement(By.className("button r4 wide primary")).click();
       String a =driver.findElement(By.id("error")).getText();
       System.out.println(a);

    }
}
