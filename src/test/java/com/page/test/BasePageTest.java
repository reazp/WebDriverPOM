package com.page.test;

import com.page.AccountPage;
import com.page.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BasePageTest {

    protected HomePage homePage;
    public WebDriver driver;
    protected AccountPage accountPage;
    //static String filePath = "/Users/violinbd/Desktop/TestDataSheet.xlsx";


    @BeforeClass
    public void setUpMethod(){
        initilization();
        homePage = new HomePage(driver);

    }

    @AfterClass
    public void tearDownMethod(){
        if(driver != null){
            driver.quit();
        }

    }


    public void initilization(){
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demo.broadleafcommerce.org/");

    }
    /*
    @DataProvider(name="mamun")
    public Object[][] loginData() throws IOException {
        Object[][] arrayObject = readExcelToArray(filePath);
        return arrayObject;
    }
    */
}
