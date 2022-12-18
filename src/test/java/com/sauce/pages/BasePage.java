package com.sauce.pages;

import com.sauce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    public String getTitle(String title){

        return Driver.get().findElement(By.xpath(" //span[.='"+title+"']")).getText();
    }
}
