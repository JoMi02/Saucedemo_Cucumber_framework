package stepDefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BasePage;
import pageObjects.LoginPage;
import utils.GlobalVars;

public class Login_Steps extends BasePage {
    private LoginPage loginPage;

    public Login_Steps(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    @Given("I access the saucedemo login page")
    public void i_access_the_saucedemo_login_page() {
        loginPage.navigateTo_SauceDemoPage();

    }

    @When("I enter a username {string}")
    public void i_enter_a_username(String username) {
        loginPage.setUsername(username);

    }

    @And("I enter a password {}")
    public void i_enter_a_password_secret_sauce(String password) {
        loginPage.setPassword(password);

    }

    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPage.clickOnLoginButton();

    }

    @Then("I should navigate on product page")
    public void i_should_navigate_on_product_page() {
        loginPage.navigateTo_URL(GlobalVars.ALL_ITEMS_PAGE_URL);
    }
    @Then("I should be presented with the unsuccessful login message")
    public void i_should_be_presented_with_the_unsuccessful_login_message() {
        loginPage.validate_unsuccessful_message();
    }
    @Then("I should be presented with the message for locked out user")
    public void i_should_be_presented_with_the_message_for_locked_out_user() {
        loginPage.validate_locked_user_message();

    }

}
