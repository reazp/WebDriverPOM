package com.page.test;

import org.testng.annotations.Test;

public class HomePageTest extends BasePageTest {

    @Test(priority = 1)
    public void addProductToCardTest() throws InterruptedException {
    homePage.addProductToCart("Green Ghost");
    }
}
