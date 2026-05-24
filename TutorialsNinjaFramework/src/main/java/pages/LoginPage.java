package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    By myAccount = By.xpath("//span[text()='My Account']");
    By login = By.xpath("//a[text()='Login']");
    By email = By.id("input-email");
    By password = By.id("input-password");
    By loginBtn = By.xpath("//input[@value='Login']");
    By warningMsg = By.xpath("//div[contains(@class,'alert-danger')]");
    By forgottenPwd = By.linkText("Forgotten Password");
    
    By warningMessage = By.xpath("//div[contains(@class,'alert-danger')]");

    public boolean verifyErrorMessage() {

        return driver.findElement(warningMessage).isDisplayed();
    }

    public void clickMyAccount() {

        driver.findElement(myAccount).click();
    }

    public void clickLogin() {

        driver.findElement(login).click();
    }

    public void enterEmail(String mail) {

        driver.findElement(email).sendKeys(mail);
    }

    public void enterPassword(String pwd) {

        driver.findElement(password).sendKeys(pwd);
    }

    public void clickLoginButton() {

        driver.findElement(loginBtn).click();
    }
    public String getWarningMessage() {

        return driver.findElement(warningMsg).getText();
    }
    
    public boolean verifyEmailField() {

        return driver.findElement(email).isDisplayed();
    }

    public boolean verifyPasswordField() {

        return driver.findElement(password).isDisplayed();
    }

    public boolean verifyLoginButton() {

        return driver.findElement(loginBtn).isDisplayed();
    }

    public boolean verifyForgotPasswordLink() {

        return driver.findElement(forgottenPwd).isDisplayed();
    }
}