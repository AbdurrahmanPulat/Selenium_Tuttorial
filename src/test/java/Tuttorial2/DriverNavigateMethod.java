package Tuttorial2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethod {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("Https://amazon.com.tr");

        //  driver.navigate().to  used for forward or backward operations between pages.
        driver.navigate().to("https://www.facebook.com");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();//refresh page

        //driver.close();// closes the page

        driver.quit();// closes all the page




    }
}

