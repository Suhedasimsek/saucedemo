package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinishPage extends BasePage{
    @FindBy(id = "finish")
    public WebElement finishButton_loc;

}
