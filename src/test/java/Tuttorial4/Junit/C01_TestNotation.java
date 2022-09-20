package Tuttorial4.Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TestNotation {

@Test
  public  void test01(){
      // eğer method başına @Test notasyonu eklersek yeşil buton tekrar aktif hale gelecektir.
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    // 1- goto https:www.amazon.com

    driver.get("https:www.amazon.com");
    driver.close();



    }

    @Test
    public  void test02(){
        // eğer method başına @Test notasyonu eklersek yeşil buton tekrar aktif hale gelecektir.
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- goto https:www.bestbuy.com

        driver.get("https:www.bestbuy.com");
        driver.close();



    }
@Test
    public  void test03(){
        // eğer method başına @Test notasyonu eklersek yeşil buton tekrar aktif hale gelecektir.
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- goto https:www.faceboook.com

        driver.get("https:www.facebook.com");
        driver.close();



    }
}
