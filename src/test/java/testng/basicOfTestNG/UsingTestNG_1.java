package testng.basicOfTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsingTestNG_1 {

public static WebDriver driver;
   @BeforeMethod
   public void PreReq(){
       driver=new ChromeDriver();
   }
    @Test
    public void edsoServices(){
        driver.navigate().to("https://edso.in/");
    }
    @Test
    public void tcs(){
        driver.navigate().to("https://www.tcs.com/");
    }
    @AfterMethod
    public void closeBroswer(){
       driver.close();

    }



}
