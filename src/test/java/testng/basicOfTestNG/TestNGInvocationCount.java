package testng.basicOfTestNG;

import org.testng.annotations.Test;

public class TestNGInvocationCount {

    @Test(invocationCount = 4)
    public void repeatingTestcaseEx(){
        System.out.println("Repeating Test Case ");
    }
    @Test(invocationCount = 50000,invocationTimeOut = 2)
    public void repeatingTestcaseEx2(){
        System.out.println("Repeating Test Case 2 ");
    }
}
