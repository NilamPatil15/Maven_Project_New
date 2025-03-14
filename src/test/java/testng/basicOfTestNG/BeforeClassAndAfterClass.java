package testng.basicOfTestNG;

import org.testng.annotations.*;

public class BeforeClassAndAfterClass {



    @BeforeMethod
    public void setup(){
        System.out.println("BeforMethod");
    }
    @BeforeClass
    public  void beforeClassEx(){
        System.out.println("Before Class Ex");
    }
    @Test
    public void testCase1(){
        System.out.println("Test Case 1");
    }
    @Test
    public void testCase2(){
        System.out.println("Test Case 2");
    }
    @Test
    public void testCase3(){
        System.out.println("Test Case 3");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("AfterMethod");
    }
    @AfterClass
    public  void afterClassEx(){
        System.out.println("After Class Ex");
    }

}
