package Tuttorial7.TestNgFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class DependsOnMethods {
    private ChromeDriver driver;

    @Test
    public void Test1 (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

    }

    @Test(dependsOnMethods = "Test1" , priority = -1)
    public void Test2(){
        WebElement searchBar = driver.findElement(By.xpath("//input[@type='text']"));

        searchBar.sendKeys("Nutella"+ Keys.ENTER);

    }

    @Test(dependsOnMethods = "Test2")
    public void Test3 () {
        //Bulunan sonuç yazısının Nutella içerdiğini test edin
        WebElement resultElement = driver.findElement(By.xpath("//div[@Class='a-section a-spacing-small a-spacing-top-small']"));
        // 1-48 of 105 results for  "Nutella"
        String actualWord = resultElement.getText();
        String expectedWord ="Nutella";
        Assert.assertTrue(actualWord.contains(expectedWord));

    }
}
