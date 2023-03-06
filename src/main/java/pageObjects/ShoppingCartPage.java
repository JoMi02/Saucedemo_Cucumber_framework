package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.GlobalVars;

public class ShoppingCartPage extends BasePage {
    public ShoppingCartPage() {
        super();
    }

    @FindBy(xpath = "//button[@id=\"checkout\"]")
    WebElement checkout_button;

    @FindBy(xpath = "//button[@id=\"remove-sauce-labs-backpack\"]")
    WebElement remove_button;

    @FindBy(xpath = "//button[@id=\"continue-shopping\"]")
    WebElement continue_shopping_button;

    @FindBy(xpath = "//*[contains(text(), \"Sauce\")]")
    WebElement product_title;
    @FindBy(xpath = "//div[@id='shopping_cart_container']/a")
    WebElement shooping_cart_button;

    public void clickOnShoppingCartButton() {
        waitForElementAndClick(shooping_cart_button);
    }



    public void clickOnContinueShippingButton() {
        waitForElementAndClick(continue_shopping_button);

    }

    public void backOnAllItemPage() {
        Assert.assertTrue(waitForUrlChange(GlobalVars.ALL_ITEMS_PAGE_URL));
    }


    public void clickOnCheckOutButton() {
        waitForElementAndClick(checkout_button);
    }

    public void goOncheckoutPage() {
        Assert.assertTrue(waitForUrlChange(GlobalVars.SAUCEDEMO_STEP_ONE));
    }

}
