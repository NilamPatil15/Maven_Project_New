package testng.Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NormalDataProvider {

    @DataProvider(name="test data")
    public Object[][] dataProviderFun(){
        return new Object[][]{
                {"Selenium","Delhi"},{"java","Pune"}
        };
    }

    public WebDriver driver;
    @Test(dataProvider = "test data")
    public void verifyLogin(String courseName, String cityName) throws InterruptedException {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        WebElement searchEle = driver.findElement(By.name("q"));
        Thread.sleep(2000);
        searchEle.sendKeys(courseName + " " + cityName);
        searchEle.sendKeys(Keys.ENTER);
        driver.close();

    }


}

