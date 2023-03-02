package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.GlobalVars;

public class LoginPage extends BasePage{
    public LoginPage() {super();
    }
    private @FindBy(id = "user-name")
    WebElement username_TextField;

    private @FindBy(id = "password")
    WebElement password_TextField;

    private @FindBy(id = "login-button")
    WebElement login_button;

    private @FindBy(xpath = "//div[@class='error-message-container error']")
    WebElement text_message;

    public void navigateTo_SauceDemoPage(){
        navigateTo_URL(GlobalVars.SAUCEDEMO_LOGIN_PAGE);
    }
    public void setUsername(String username){
        sendKeys(username_TextField, username);
    }

    public void setPassword(String password){
        sendKeys(password_TextField, password);
    }

    public void clickOnLoginButton(){
        waitForElementAndClick(login_button);
    }

    public void get_unsuccessful_message(String text){
        String errorMessage = getTextFromWebElement(text_message);
        Assert.assertEquals(errorMessage, text);

    }
    public void validate_unsuccessful_message(){
        get_unsuccessful_message(GlobalVars.ERROR_MESSAGE);
    }


}
