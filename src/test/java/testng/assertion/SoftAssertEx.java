package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {

    @Test
    public void verifyDemoApplication(){
        SoftAssert soft=new SoftAssert();


        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        //To check whether login is successful or not using text
        WebElement sauceLabElement=driver.findElement(By.xpath("//div[text()=\"Swag Labs\"]"));
        //soft.assertTrue(sauceLabElement.isDisplayed(),"Swag Labs Element is Displayed");
        //soft.assertFalse(sauceLabElement.isDisplayed(),"Swag Lab Element is not displayed");

        WebElement productLabEle=driver.findElement(By.xpath("//span[text()=\"Products\"]"));
        soft.assertEquals(productLabEle.getText(),"products" ,"product is display");
        //        soft.assertEquals(productLabEle.getText(),"products" ,"product is display");
        soft.assertAll();
        driver.close();
    }


}
