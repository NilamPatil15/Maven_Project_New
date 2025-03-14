package testng.Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NeedOfParameterization {
    @Parameters({"courseNamee","cityNamee"})
    @Test
    public void searchOfMultipleCities(String courseNamee, String cityNamee) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement searchEle=driver.findElement(By.name("q"));
        Thread.sleep(2000);
        searchEle.sendKeys( courseNamee+" " +cityNamee);
        searchEle.sendKeys(Keys.ENTER);








    }

}
