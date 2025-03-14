package testng.basicOfTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethodEx {

    @BeforeMethod
    public void setup(){
        System.out.println("Before Method");
    }

    @Test
    public void TestMethod_1(){
        System.out.println("Test case 1");
    }
    @Test
    public void TestMethod_2(){
        System.out.println("Test case 2");
    }
    @Test
    public void TestMethod_3(){
        System.out.println("Test case 3");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("After Method (Close ())");
    }
}
