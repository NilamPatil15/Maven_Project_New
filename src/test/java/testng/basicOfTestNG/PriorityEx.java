package testng.basicOfTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityEx {
    @Test(priority = 1,groups = {"smoke"})
    public void testCaseF(){
        System.out.println("Test Case F");
    }
    @Test (priority = 2 ,groups = {"smoke"})
    public void testCaseG(){
        System.out.println("Test Case G");
    }
    @Test (priority = 3, groups = {"smoke"})
    public void testCaseW(){
        System.out.println("Test Case W");
    }
    @Test (priority = 3)
    public void testCasek(){
        System.out.println("Test Case k");
    }
    @Test (priority = 'A')
    public void testCaseChar(){
        System.out.println("Test Case A Ascii ");
    }
    @Test (priority = 'k')
    public void testCaseCharAscii(){
        System.out.println("Test Case k Ascii");
    }

    @Test (priority = 4)

    public void testCaseB(){
        Assert.assertTrue(false);
        System.out.println("Test Case B");
    }
    @Test(priority = -1)
    public void testCaseO(){
        System.out.println("Test Case -1");
    }
    @Test (priority = 6)
    public void testCaseD(){
        System.out.println("Test Case D");
    }
    @Test
    public void testCasef(){
        System.out.println("Test Case f");
    }
    @Test(priority = -4)
    public void testCaser(){
        System.out.println("Test Case -4");
    }
    @Test
    public void testCaseI(){
        Assert.assertTrue(false);
        System.out.println("Test Case I");
    }
}
