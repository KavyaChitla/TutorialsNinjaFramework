package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

    WebDriver driver;

    public LogoutPage(WebDriver driver)
    {
        this.driver = driver;
    }

    By myAccount = By.xpath("//span[text()='My Account']");
    By login = By.linkText("Login");
    By email = By.id("input-email");
    By password = By.id("input-password");
    By loginButton = By.xpath("//input[@value='Login']");
    By logout = By.linkText("Logout");
    By logoutMessage = By.xpath("//h1[text()='Account Logout']");

    public void clickMyAccount()
    {
        driver.findElement(myAccount).click();
    }

    public void clickLogin()
    {
        driver.findElement(login).click();
    }

    public void enterEmail()
    {
        driver.findElement(email).sendKeys("test@gmail.com");
    }

    public void enterPassword()
    {
        driver.findElement(password).sendKeys("test123");
    }

    public void clickLoginButton()
    {
        driver.findElement(loginButton).click();
    }

    public void clickLogout()
    {
        driver.findElement(logout).click();
    }

    public boolean verifyLogout()
    {
        return driver.findElement(logoutMessage).isDisplayed();
    }
    public boolean verifyLogoutPageDisplayed() {

        return driver.getPageSource().contains("Account Logout");
    }
    By continueButton = By.linkText("Continue");

    public void clickContinueAfterLogout() {

        driver.findElement(continueButton).click();
    }

    public boolean verifyHomePage() {

        return driver.getTitle().contains("Your Store");
    }
}