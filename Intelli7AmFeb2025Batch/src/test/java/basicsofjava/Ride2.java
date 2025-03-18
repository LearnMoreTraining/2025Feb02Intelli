package basicsofjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ride2 extends Ride1  {
        static int a = 200;
    public static void main(String[] args) {
        Ride1 r = new Ride1();
        r.m1();
    }

    public void m1(){
        System.out.println(super.a);
        System.out.println(this.a);

        WebDriver d = new ChromeDriver();

    }
}
