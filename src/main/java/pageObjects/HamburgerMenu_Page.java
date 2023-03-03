package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.GlobalVars;

public class HamburgerMenu_Page extends BasePage {
    public HamburgerMenu_Page() {
        super();
    }

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    WebElement burgerMenu_button;

    @FindBy(xpath = "//a[@id='about_sidebar_link']")
    WebElement about_button;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    WebElement logout_button;

    public void click_On_Hamburger_Menu(){
        waitForElementAndClick(burgerMenu_button);
    }

    public void click_On_About_Button(){
        waitForElementAndClick(about_button);
    }

    public void click_On_Logout_Button(){
        waitForElementAndClick(logout_button);
    }
    public void navigate_On_SauceLabs_Page(){
        navigateTo_URL(GlobalVars.SAUCELABS_PAGE);
    }

}
