package testng.Parameterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderWithExcel {
    @DataProvider(name="test data")
    public Object[][] dataProviderFun() throws IOException {
        Object[][] arrObj = getExcelData("D:\\Nilam Study\\Selenium_Ex.xlsx", "Sheet1");
        return  arrObj;
    }
    public String[][] getExcelData(String filePath, String sheetName) throws IOException {
   //Logic to access Excel File
        FileInputStream fis =new FileInputStream(filePath);  //To access file
        XSSFWorkbook wb=new XSSFWorkbook(fis);//To access  Excel File
        XSSFSheet sheet=wb.getSheet(sheetName);//To access particular sheet
        // To fetch row and col in sheet

        XSSFRow row=sheet.getRow(0);
        int noOFRow=sheet.getPhysicalNumberOfRows();
        int noOfCol=row.getLastCellNum();

        Cell cell;
        String[][] data =new String[noOFRow-1][noOfCol];
        for(int i=1; i<noOFRow;i++){     //row
            for(int j=0; j<noOfCol; j++){       //col
                row =sheet.getRow(i);
                cell=row.getCell(j);
                data[i-1][j]=cell.getStringCellValue();
            }
        }
        return data;

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
