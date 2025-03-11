package basicsofjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReturnB {

    public int m1(){
        int a = 1 ;
        return a;
    }

    public String m2(){
        String name = "abc";
        return name ;
    }

    public WebDriver m3(){
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
