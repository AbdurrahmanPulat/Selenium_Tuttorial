package Tuttorial2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMethod {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();


        //driver.manage().window().getSize();// Returns the current page dimensions in pixels.

        System.out.println(driver.manage().window().getSize());//(945,100)

        // driver.manage().window().getPosition()

        System.out.println(driver.manage().window().getPosition());//(10,10)
        // driver.manage().window().setPosition(new Point()) allows to reconfigure the position of the current page
        driver.manage().window().setPosition(new Point(15,15));


        System.out.println("new window size"+driver.manage().window().getSize());
        System.out.println("new window position"+driver.manage().window().getPosition());



        // driver.manage().window().maximize() Maximizes the page size
        //  driver.manage().window().fullscreen()

        driver.manage().window().maximize();

        System.out.println("maximize position"+ driver.manage().window().getPosition());//(-8,-8)
        System.out.println("maxmize size"+ driver.manage().window().getSize());//(1936, 1056)


        driver.manage().window().fullscreen();
        System.out.println("fullscreen position"+driver.manage().window().getPosition());//(0, 0)
        System.out.println("fullscreen size"+driver.manage().window().getSize());//(1920, 1080)



        //driver.manage().window().mimimize();

        // part 2  timeout

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

















        // driver.manage().window().setSize(new Dimension()) Resizes current page sizes in pixels.

        driver.manage().window().setSize(new Dimension(900,600));




    }
}



