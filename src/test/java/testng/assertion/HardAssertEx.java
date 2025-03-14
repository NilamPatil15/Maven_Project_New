package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {
@Test
        public void verifyDemoApplication(){
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.saucedemo.com/");
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();

    //To check whether login is successful or not using text
    WebElement sauceLabElement=driver.findElement(By.xpath("//div[text()=\"Swag Labs\"]"));
   //Assert.assertTrue(sauceLabElement.isDisplayed(),"Swag Labs Element is Displayed");
   Assert.assertFalse(sauceLabElement.isDisplayed(),"Swag Lab Element is not displayed");

    WebElement productLabEle=driver.findElement(By.xpath("//span[text()=\"Products\"]"));
    Assert.assertEquals(productLabEle.getText(),"Products" ,"product is dispaly");
driver.close();
}


}
