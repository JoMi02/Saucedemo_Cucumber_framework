package stepDefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.BasePage;
import pageObjects.HamburgerMenu_Page;

public class HamburgerMenu_Steps extends BasePage {

    private HamburgerMenu_Page hamburgerMenu_page;

    public HamburgerMenu_Steps(HamburgerMenu_Page hamburgerMenu_page) {
        this.hamburgerMenu_page = hamburgerMenu_page;
    }

    @And("I click on hamburger menu")
    public void i_click_on_hamburger_menu() {
        hamburgerMenu_page.click_On_Hamburger_Menu();

    }
    @And("I click on logout button")
    public void i_click_on_logout_button() {
        hamburgerMenu_page.click_On_Logout_Button();

    }
    @And("I click on about page")
    public void i_click_on_about_page() {
        hamburgerMenu_page.click_On_About_Button();

    }
    @Then("I access sauceLabs page")
    public void i_access_sauce_labs_page() {
        hamburgerMenu_page.navigate_On_SauceLabs_Page();

    }
}
