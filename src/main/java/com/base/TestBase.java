package com.base;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    public WebDriver driver;
    @BeforeMethod
    public void testStart() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.bestbuy.com/identity/newAccount?token=tid%3Af68e827f-92d7-11ea-8317-005056aeda70");;
    }
    @AfterMethod
    public void testFinish() {
       // driver.close();
    }
}
