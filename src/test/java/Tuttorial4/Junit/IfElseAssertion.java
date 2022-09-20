package Tuttorial4.Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IfElseAssertion {

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @After
    public void tearDown() { driver.close();}

     @Test
    public  void test01(){
        // https:www.amazon.com sayfasına gidin
         driver.get("https://www.amazon.com");
         // arama çubuğuna nutella yazdırın
         WebElement searcBar= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
         searcBar.sendKeys("Nutella");
         // Nutella yazdırdıktan sonra Enter tuşuna basarak arama işlemini başlatın

         searcBar.submit();
         //Bulunan sonuç yazısının Nutella içerdiğini test edin
         WebElement resultElement = driver.findElement(By.xpath("//div[@Class='a-section a-spacing-small a-spacing-top-small']"));

         String actualWord = resultElement.getText();

         String expectedWord ="Nutella";
         if (actualWord.contains(expectedWord)){
             System.out.println("Nutella Test is passed");
         }
         else {
             System.out.println("Nutella Test is Failed");
         }




    }
}
