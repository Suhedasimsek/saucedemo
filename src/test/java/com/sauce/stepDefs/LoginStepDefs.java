package com.sauce.stepDefs;

import com.sauce.pages.LoginPage;
import com.sauce.pages.ProductPage;
import com.sauce.utilities.ConfigurationReader;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage=new LoginPage();
    ProductPage productPage=new ProductPage();
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user is enters {string} and {string} credentials")
    public void the_user_is_enters_and_secret_sauce_credetials(String userName, String password) {
        loginPage.loginUser(userName, password);
    }

    @Then("The user verifies the header {string}")
    public void theUserVerifiesTheHeader(String title) {
        System.out.println(title);
        System.out.println(loginPage.getTitle(title));
        Assert.assertEquals(title.toUpperCase(), loginPage.getTitle(title));//method Basepage de extend olduğundan kabul
    }
}
