package Tuttorial6.AtionsClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class ActionsClassApp {
    @Test
    public void test(){
        //launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //navigate to url "http://automationexercise.com"
        driver.get("http://automationexercise.com");
        //
        // click on "signup/ login" button

        WebElement signUpButton = driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
        signUpButton.click();
        // enter name and email adress
        WebElement nameBox = driver.findElement(By.xpath("//input[@name='name']"));
        Actions actions= new Actions(driver);
        actions.click(nameBox)
                .sendKeys("Ali")
                .sendKeys(Keys.TAB)
                .sendKeys("fja@bbkcd.com")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
        //fill details: Title, Name, Email, Password, Date of birth
        //select checkbox "sign up for our newsletter!"
        //select checkbox "Recieve special offers from our partners!"
        //fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        WebElement radioButton = driver.findElement(By.xpath("//input[@value='Mr']"));
        actions.click(radioButton)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("12345555")
                .sendKeys(Keys.TAB)
                .sendKeys("1")
                .sendKeys(Keys.TAB)
                .sendKeys("july")
                .sendKeys(Keys.TAB)
                .sendKeys("1997")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Ali")
                .sendKeys(Keys.TAB)
                .sendKeys("Cosar")
                .sendKeys(Keys.TAB)
                .sendKeys("myself")
                .sendKeys(Keys.TAB)
                .sendKeys("central park 15/2")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys("Kansas")
                .sendKeys(Keys.TAB)
                .sendKeys("Dallas")
                .sendKeys(Keys.TAB)
                .sendKeys("05100")
                .sendKeys(Keys.TAB)
                .sendKeys("5456584585")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();
        //click 'Create Account button'
        // verify that 'ACCOUNT CREATED!' is visible
        String expectedWord = "ACCOUNT CREATED!";
        String actualWord=driver.findElement(By.xpath("//h2[@data-qa='account-created']")).getText();
        Assert.assertEquals(expectedWord,actualWord);

        driver.close();




    }
}
