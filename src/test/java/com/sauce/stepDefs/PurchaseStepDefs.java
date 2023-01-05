package com.sauce.stepDefs;

import com.sauce.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class PurchaseStepDefs {

    ProductPage productPage=new ProductPage();

    @Then("The user should be able to sort the product {string}")
    public void the_user_should_be_able_to_sort_the_product(String string) {

        Select select=new Select(productPage.sortSelect_loc);
        select.selectByVisibleText(string);
    }

    @And("The user select the item no {string}")
    public void theUserSelectTheItemNo(String number) {

        productPage.addToCart(Integer.parseInt(number)-1).click();
    }
    @When("The user should be able to select products with index number {string}")
    public void theUserShouldBeAbleToSelectProductsWithIndexNumber(String index) {
        productPage.selectWithIndex(Integer.parseInt(index)-1);
    }

    @When("The user takes all products names and control product {string} is in the list")
    public void theUserTakesAllProductsNamesAndControlProductIsInTheList(String productName) {
        productPage.controlProductNames_mtd(productName);
    }
}

