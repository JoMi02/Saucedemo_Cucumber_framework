package stepDefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.BasePage;
import pageObjects.ShoppingCartPage;

public class ShoppingCartPage_Steps extends BasePage {
    ShoppingCartPage shoppingCartPage;

    public ShoppingCartPage_Steps(ShoppingCartPage shoppingCartPage) {
        this.shoppingCartPage = shoppingCartPage;
    }

    @And("I click on shopping cart button")
    public void i_click_on_shopping_cart_button() {
        shoppingCartPage.clickOnShoppingCartButton();

    }


    @And("I click on button continue shopping")
    public void i_click_on_button_continue_shopping() {
        shoppingCartPage.clickOnContinueShippingButton();

    }
    @Then("I should be back on allitem page")
    public void i_should_be_back_on_allitem_page() {
        shoppingCartPage.backOnAllItemPage();

    }
    @And("I click on chechout button")
    public void i_click_on_chechout_button() {
        shoppingCartPage.clickOnCheckOutButton();

    }
    @Then("I should be navigate on checkout step one page")
    public void i_should_be_navigate_on_checkout_step_one_page() {
        shoppingCartPage.goOncheckoutPage();

    }


}
