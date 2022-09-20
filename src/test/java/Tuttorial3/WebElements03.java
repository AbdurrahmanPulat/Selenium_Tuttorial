package Tuttorial3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebElements03 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- go to https://www.bestbuy.com
        driver.get("https://www.bestbuy.com");
        //2- accept cookies if popped up  (popup açılırsa çerezleri kabul et)

        //3- print how many links are on the page(sayfada kaç adet buton bulunduğunu yazdırın)

        List<WebElement> buttonList= driver.findElements(By.tagName("button"));

        System.out.println(buttonList.size());

        //4-print the text on the each page (sayfadaki her bir button üzerindeki yazıları yazdırın)
        for (WebElement each:buttonList
             ) {
            System.out.println(each.getText());
            
        }
    }
}
