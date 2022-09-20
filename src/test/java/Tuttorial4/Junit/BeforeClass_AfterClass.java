package Tuttorial4.Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BeforeClass_AfterClass {
    static WebDriver driver;
@BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new  ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @AfterClass

        public static void tearDown(){driver.close();}
    @Test
    public void test01(){
    driver.get("https:www.amazon.com");
    }

    @Test
    public  void test02(){
    //print title
        System.out.println(driver.getTitle());    }


    @Test
    public void test03(){
    // print url
        System.out.println(driver.getCurrentUrl());
    }
}


