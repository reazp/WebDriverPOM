package com.test;


import com.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BestBuyTest extends TestBase {


    @Test
    public void registrationtest() {
        driver.findElement(By.id("firstName")).sendKeys("Test first name");
        driver.findElement(By.id("fld-lastName")).sendKeys("Test Last name");
        driver.findElement(By.xpath(" //input[@class='js-recovery-phone']")).click();


    }


}
