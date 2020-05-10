package com.page;

import com.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends BasePage {
    //WebElement

    //WebElement Action
    //Button - Click
    //inputbox - type

    //Selenium Locator

    WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //Homepage Elements
    @FindBy(linkText = "Green Ghost")
    WebElement greenGhost;
    //PageFactory
    @FindBy(xpath = "//button[@class='btn btn-primary js-addToCart']")
    WebElement addtoCardLink;
    @FindBy(partialLinkText = "VIEW")
    WebElement viewYourCart;
    @FindBy(partialLinkText = "CHE")
    WebElement checkOutlink;
    @FindBy(xpath = "//div[@class = 'col-md-12']/h1")
    WebElement validationStringElement;


    //Method for Homepage
    public void addProductToCart(String expectedString) throws InterruptedException {

        clickOnElement(greenGhost);
        System.out.println("Product Green Ghost  Link is clicked!!! ");

        clickOnElement(addtoCardLink);
        System.out.println("Add to Card Link is  clicked!!! ");

        clickOnElement(viewYourCart);
        System.out.println("View Your Card is  Link clicked!!! ");

        clickOnElement(checkOutlink);
        System.out.println("CheckOut Link is  clicked!!! ");
        Thread.sleep(5000);

        String validationString = validationStringElement.getText();
        Assert.assertEquals(validationString, expectedString);

    }
}
