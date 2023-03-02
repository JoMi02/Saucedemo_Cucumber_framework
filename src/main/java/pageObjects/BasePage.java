package pageObjects;

import Driver.DriverFactory;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.GlobalVars;

import java.time.Duration;

import static Driver.DriverFactory.getDriver;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }
    public WebDriver getDriver(){
        return DriverFactory.getDriver();
    }
    public void navigateTo_URL(String url){
        getDriver().get("https://www.saucedemo.com/");
    }
    public String generateRandomNumber(int length){return RandomStringUtils.randomNumeric(length);}

    public String generateRandomString(int length){return RandomStringUtils.randomAlphabetic(length);}

    public void sendKeys(WebElement element, String textToType){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(GlobalVars.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(textToType);
    }
    public void waitForElementAndClick(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(GlobalVars.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public void waitFor(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(GlobalVars.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    protected String getTextFromWebElement(WebElement element) {
        return element.getText();
    }

    protected WebElement waitForWebElementToBeVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(GlobalVars.DEFAULT_EXPLICIT_TIMEOUT));
       return wait.until(ExpectedConditions.visibilityOf(element));
    }







}
