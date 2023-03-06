package stepDefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.BasePage;
import pageObjects.IventoryPage;

public class AllItemPage_Steps extends BasePage {
    IventoryPage iventoryPage;

    public AllItemPage_Steps(IventoryPage iventoryPage) {
        this.iventoryPage = iventoryPage;
    }


    @And("I click on add button")
    public void i_click_on_add_button() {
        iventoryPage.click_on_add_button();

    }
    @And("I verify change number on shopping cart button")
    public void i_verify_change_number_on_shopping_cart_button() {
        iventoryPage.verify_change_shopping_cart();

    }
    @And("I click on remove button")
    public void i_click_on_remove_button() {
        iventoryPage.click_on_remove_button();

    }
    @Then("I verify change on shopping cart button")
    public void i_verify_change_on_shopping_cart_button() {
        iventoryPage.verify_change_shopping_cart();

    }
    @And("I verify facebook link")
    public void i_verify_facebook_link() {
        iventoryPage.verify_facebook_link();

    }
    @And("I verify twitter link")
    public void i_verify_twitter_link() {
        iventoryPage.verify_twitter_link();

    }
    @Then("I verify linkedin link")
    public void i_verify_linkedin_link() {
        iventoryPage.verify_linked_link();

    }
}
