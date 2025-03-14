package testng.basicOfTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGIntro {
@Test
    public void edsoServices(){
        WebDriver driver =new ChromeDriver();
        driver.navigate().to("https://edso.in/");
        driver.close();
    }
    @Test
    public void tcs(){
        WebDriver driver =new ChromeDriver();
        driver.navigate().to("https://www.tcs.com/");
        driver.close();
    }

}

