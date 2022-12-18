package com.sauce.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutYourInfPage extends BasePage{
    @FindBy(id = "first-name")
    public WebElement firstNameInput_loc;

   @FindBy(className = "shopping_cart_link")
    public WebElement openTheBasket_loc;


    @FindBy (id = "last-name")
    public WebElement lastNameInput_loc;

    @FindBy (id = "postal-code")
    public WebElement postalCodeInput_loc;

    @FindBy (id = "continue")
    public WebElement checkOut_loc;


    public void checkoutYourInfMtd(String name, String lastName, String zipCode){
        firstNameInput_loc.sendKeys(name);
        lastNameInput_loc.sendKeys(lastName);
        postalCodeInput_loc.sendKeys(zipCode);
        checkOut_loc.click();

    }

}
