package Tuttorial3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElements02 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https:www.facebook.com adresine

        driver.get("https:www.facebook.com");
        // cookies çıkarsa kabul et butonuna tıklayın

        // e-posta kutusuna rastgele bir mail yazın
        WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
        mail.sendKeys("ksfjkfjdlgdl");

        // şifre kısmına rastgele bir şifre yazın
        WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));

        password.sendKeys("gudgudrpgrkd");

        // giriş yap butonuna tıklayın

        driver.findElement(By.xpath("//button[@name='login']")).click();
        //check  The email address or mobile number you entered isn't connected to an account. Find your account and log in.
        WebElement output = driver.findElement(By.xpath("//div[@class='_9ay7']"));
        String expected ="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
        String actual = output.getText();
        if (expected.equals(actual)){
            System.out.println("failed login test passed");
        }
        else {
            System.out.println("failed login test failed");
        }
        //close page
        driver.close();
    }
}
