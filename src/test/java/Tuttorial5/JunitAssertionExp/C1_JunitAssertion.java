package Tuttorial5.JunitAssertionExp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C1_JunitAssertion {
    @Test
    public  void test1(){
        // launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // navigate to url "http://automationexercise.com"

        driver.get("http://automationexercise.com");

        //verify that home page visible successfully

        WebElement logoElement= driver.findElement(By.xpath("//div[@class='logo pull-left']"));
        Assert.assertTrue(logoElement.isDisplayed());

        // click on "signup/ login" button

        WebElement signUpButton = driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
        signUpButton.click();

        //verify "login to your account " is visible

        WebElement loginElement = driver.findElement(By.xpath("//h2[.='Login to your account']"));
        Assert.assertTrue(loginElement.isDisplayed());

        // enter correct email adress and password
        WebElement emailElement = driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));

        emailElement.sendKeys("ahmet@nehaber.com");

        WebElement passwordElement = driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
        passwordElement.sendKeys("12345");
        //click login button

        driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]")).click();

        // verify that "loged in as username is visible"

        WebElement loggedInWord = driver.findElement(By.xpath("//a[text()=\" Logged in as \"]"));
        Assert.assertTrue( loggedInWord.isDisplayed());
        // click "logout" button
        driver.findElement(By.xpath("//i[@class=\"fa fa-lock\"]")).click();
        // verify that user is navigated to login Page
        String expectedUrl ="https://automationexercise.com/login";
        String actualUrl  = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        //close driver

        driver.close();





    }
}
