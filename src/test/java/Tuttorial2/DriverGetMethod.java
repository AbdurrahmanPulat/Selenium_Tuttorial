package Tuttorial2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethod {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        // driver.get("url") goto url

        driver.get("https://www.amazon.com");

        // driver.getTitle() Returns the page title

        System.out.println("page title" + driver.getTitle());//amazon.com spend less. smile more

        //driver.getCurrentUrl() Return Url
        System.out.println(driver.getCurrentUrl());

        //driver.getPageSource() return page source

        System.out.println(driver.getPageSource());//shows code running in the background

        //driver.getWindowHandle return unique hash

        System.out.println(driver.getWindowHandle());




    }
}
