package com.sauce.pages;

import com.sauce.pages.BasePage;
import com.sauce.utilities.BrowserUtils;
import com.sauce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
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

    @FindBy (xpath = "//button[starts-with(@class,'btn')]")
    public List<WebElement> selectProduct_loc;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public List<WebElement> productNames_loc;

    @FindBy(xpath = "(//div[@class='inventory_item_name'])[1]")
    public WebElement firstProduct_loc;

    public WebElement addToCart(int a) {
        return addToChartItems.get(a);
    }

    public void selectWithIndex(int index){
        selectProduct_loc.get(index).click();
    }


    public void controlProductNames_mtd(String productName) {

        List<String> productsText = BrowserUtils.getElementsText(productNames_loc);
        List<String> productText2 = new ArrayList<>();

        clickProducts_mtd();





//
//    for (WebElement product : productNames_loc) {
//        productText2.add(product.getText());
//        System.out.println("productNames_loc = " + productNames_loc);
//
//        product.click();
//        BrowserUtils.waitFor(2);
//        Driver.get().navigate().back();
//        BrowserUtils.waitFor(2);
//
//
//
//    }

//productNames_loc.get(productText2.indexOf(productName)).click();
//
//    String actualURL=Driver.get().getCurrentUrl();
//    String expectedURL="https://www.saucedemo.com/inventory-item.html?id=3";
//
//    BrowserUtils.waitFor(5);
//
//    Assert.assertEquals(expectedURL,actualURL);

//    Assert.assertTrue(productsText.contains(productName));





        System.out.println("productsText = " + productsText);
    }

    public List<String> controlPruductNames2_mtd(){

        return   BrowserUtils.getElementsText(productNames_loc);
    }

    public int getindexOfProduct(String productName){
        return productNames_loc.indexOf(productName);
    }


    public void clickProducts_mtd(){
        for (int i = 1; i <=productNames_loc.size() ; i++) {
            Driver.get().findElement(By.xpath("(//div[@class='inventory_item_name'])["+i+"]")).click();
            BrowserUtils.waitFor(2);
            Driver.get().navigate().back();
            BrowserUtils.waitFor(2);
        }
    }
}

