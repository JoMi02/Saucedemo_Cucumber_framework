package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.GlobalVars;

public class IventoryPage extends BasePage {
    public IventoryPage() {
        super();
    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement add_to_cart_button;

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a")
    WebElement shooping_cart_button;

    @FindBy(xpath = "//div[@id='shopping_cart_container']//span[@class='shopping_cart_badge']")
    WebElement cartItemsNumberSpan;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    WebElement remove_to_cart_button;

    @FindBy(xpath = "//span[@class='select_container']")
    WebElement select_container_button;

    @FindBy(xpath = "//*[contains(text(), \"Price (low\")]")
    WebElement select_container_option;

    @FindBy(xpath = "//*[contains(text(), \"Twitter\")]")
    WebElement twiter_link;

    @FindBy (xpath = "//*[contains(text(), \"Facebook\")]")
    WebElement facebook_link;

    @FindBy(xpath = "//*[contains(text(), \"LinkedIn\")]")
    WebElement linked_link;

    public void click_on_add_button(){
        waitForElementAndClick(add_to_cart_button);
    }

    public void click_on_remove_button(){
        waitForElementAndClick(remove_to_cart_button);
    }
    public void verify_change_shopping_cart(){
        isElementDisplayed(shooping_cart_button);
    }

    public void verify_facebook_link(){
        isElementDisplayed(facebook_link);
    }
    public void verify_twitter_link(){
        isElementDisplayed(twiter_link);
    }

    public void verify_linked_link(){
        isElementDisplayed(linked_link);
    }

    public void change_select_option(){
        waitForElementAndClick(select_container_button);
        waitForElementAndClick(select_container_option);
    }







}
