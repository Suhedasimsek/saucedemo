package com.sauce.stepDefs;

import com.sauce.pages.CheckOutYourInfPage;
import com.sauce.pages.FinishPage;
import com.sauce.pages.YourChartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class YourChartStepDef {
    YourChartPage yourChartPage=new YourChartPage();
    CheckOutYourInfPage checkOutYourInfPage=new CheckOutYourInfPage();
    FinishPage finishPage=new FinishPage();
    @And("The user clicks the open the basket")
    public void theUserClicksTheOpenTheBasket() {

        checkOutYourInfPage.openTheBasket_loc.click();
    }
    @And("The user checks out")
    public void theUserChecksOut() {

        yourChartPage.checkout.click();
    }
    @And("The user enters name {string}, lastname {string} postal code {string} and click")
    public void theUserEntersNameLastnamePostalCodeAndClick(String name, String lastName, String zipCode) {

        checkOutYourInfPage.checkoutYourInfMtd(name, lastName, zipCode);
    }

    @And("The user clicks finish button")
    public void theUserClicksFinishButton() {

        finishPage.finishButton_loc.click();
    }

}
