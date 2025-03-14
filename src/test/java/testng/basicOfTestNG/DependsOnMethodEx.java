package testng.basicOfTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodEx {
    @Test
    public void loginFunctionality(){
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = "loginFunctionality")
    public void verifyHomePage(){
        System.out.println("verify Home Page");
    }
    @Test
    public void onboarding(){
        System.out.println("Onboarding (create anew user)");
    }
}
