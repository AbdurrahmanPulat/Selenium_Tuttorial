package Tuttorial7.TestNgFramework;

import org.testng.annotations.Test;

public class C02_Prioritiy {

    @Test(priority = 2)
    public void test01 (){
        System.out.println("Test01");
    }
    @Test(priority = 2)
    public void test02 (){
        System.out.println("Test02");
    }
    @Test(priority = 1)
    public void test03 (){
        System.out.println("Test03");
    }
}
