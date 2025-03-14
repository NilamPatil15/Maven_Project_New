package testng.Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NeedOfParameterization_2 {
    //Using cross browser testing
    public WebDriver driver;

    @Parameters("browserName")
    @BeforeMethod
    public void setup(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            driver.navigate().to("https://www.google.com/");

        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            driver.navigate().to("https://www.google.com/");
        } else if (browserName.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
            driver.navigate().to("https://www.google.com/");
        } else {
            throw new RuntimeException("Please Select the correct browser name");
        }
    }

    @Parameters({"courseName", "cityName"})
    @Test
    public void verifyLogin(String courseName, String cityName) throws InterruptedException {
        /*driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");*/
        WebElement searchEle = driver.findElement(By.name("q"));
        Thread.sleep(2000);
        searchEle.sendKeys(courseName + " " + cityName);
        searchEle.sendKeys(Keys.ENTER);
        driver.close();

    }


}
