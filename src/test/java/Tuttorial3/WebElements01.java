package Tuttorial3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElements01 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- goto https:www.amazon.com

        driver.get("https:www.amazon.com");
        // 2- write nutella in the searh bar
        WebElement searchBar = driver.findElement(By.xpath("//input[@type='text']"));

        searchBar.sendKeys("nutella");

        // 3- press enter
        searchBar.submit();

        // 4- print the number of results found
        WebElement resultElement= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(resultElement.getText());

        driver.close();
    }
}
