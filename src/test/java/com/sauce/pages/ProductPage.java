package com.sauce.pages;

import com.sauce.pages.BasePage;
import com.sauce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class ProductPage extends BasePage {
    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement sortSelect_loc;

    @FindBy(xpath = "//*[text()='Products']")
    public WebElement productHeader_loc;

    @FindBy(xpath = "//button[starts-with(@name,'add-to-cart')]")
    public List<WebElement> addToChartItems;

    @FindBy (xpath = "//a[@class='shopping_cart_link']")
    public WebElement openTheBasket;

    public WebElement addToCart(int a) {
        return addToChartItems.get(a);
    }
}

