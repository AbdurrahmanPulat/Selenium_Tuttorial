package Tuttorial7.TestNgFramework;

import org.testng.annotations.*;

public class C01_Notations {

    @BeforeTest
    public void bt() {
        System.out.println("Before Test");
    }
    @AfterTest public void at(){
        System.out.println("After Test");
    }
    @BeforeSuite public  void  bs(){
        System.out.println("Before Suit");
    }
    @AfterSuite
    public  void  as(){
        System.out.println("After Suit");
    }
    @BeforeMethod public void setUp(){
        System.out.println(" Before Method");
    }
    @AfterMethod public void  tearDown (){
        System.out.println("After Method");
    }

    @Test
    public void test1 (){
        System.out.println("Test 1");
    }
    @Test
    public void test2 (){
        System.out.println("Test 2");
    }
    @Test
    public void test3 (){
        System.out.println("Test 3");
    }

    @BeforeClass
    public void bc(){
        System.out.println("Before class");
    }
    @AfterClass
    public void ac(){
        System.out.println("After class");
    }



}
