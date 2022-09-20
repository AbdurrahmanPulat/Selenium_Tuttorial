package Tuttorial5.JunitAssertionExp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C2_JunitAssertionExp {


    @Test
    public void test2(){
        //lounch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //navigate to url "http://automationexercise.com"
        driver.get("http://automationexercise.com");
        //verify that home page is visible successfully
        WebElement logoElement= driver.findElement(By.xpath("//div[@class='logo pull-left']"));
        Assert.assertTrue(logoElement.isDisplayed());
        //click on "Products" buttton
        driver.findElement(By.xpath("//i[@class=\"material-icons card_travel\"]")).click();

        //verify user is navigated to ALL PRODUCTS page successfully
        String expectedUrl ="https://automationexercise.com/products";
        String actualUrl =driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        //enter product name in search input and click search button
        WebElement searchBox =driver.findElement(By.xpath("//input[@id=\"search_product\"]"));
        searchBox.sendKeys("shirt");
        driver.findElement(By.xpath("//button[@id=\"submit_search\"]"));

        //verify "SEARCHED PRODUCTS" is visible
        WebElement products = driver.findElement(By.xpath("//h2[@class=\"title text-center\"]"));
        Assert.assertTrue(products.isDisplayed());

        //close driver
        driver.close();
    }
}
