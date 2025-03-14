package testng.basicOfTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupEx {
    @Test(groups = {"smoke"})
    public void loginFunctionality(){
        Assert.assertTrue(false);  //use true as well
    }
    @Test(dependsOnGroups = "smoke")
    public void verifyHomePage(){
        System.out.println("verify Home Page");
    }
    @Test
    public void onboarding(){
        System.out.println("Onboarding (create anew user)");
    }
}
