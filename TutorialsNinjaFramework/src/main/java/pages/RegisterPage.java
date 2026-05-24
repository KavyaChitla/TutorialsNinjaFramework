package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {

        this.driver = driver;
    }

    By myAccount = By.xpath("//span[text()='My Account']");

    By registerLink = By.linkText("Register");

    By registerPageHeading = By.xpath("//h1[text()='Register Account']");
    
    By firstName = By.id("input-firstname");

    By lastName = By.id("input-lastname");

    By email = By.id("input-email");

    By telephone = By.id("input-telephone");

    By password = By.id("input-password");

    By confirmPassword = By.id("input-confirm");

    By privacyPolicy = By.name("agree");

    By continueBtn = By.xpath("//input[@value='Continue']");

    By successMsg = By.xpath("//h1[text()='Your Account Has Been Created!']");
    
    By existingEmailWarning = By.xpath("//div[contains(text(),'Warning: E-Mail Address is already registered')]");
    
    By privacyWarning = By.xpath("//div[contains(text(),'Warning: You must agree to the Privacy Policy!')]");

    By firstNameWarning = By.xpath("//div[contains(text(),'First Name must be between 1 and 32 characters!')]");

    By lastNameWarning = By.xpath("//div[contains(text(),'Last Name must be between 1 and 32 characters!')]");

    By emailWarning = By.xpath("//div[contains(text(),'E-Mail Address does not appear to be valid!')]");

    By telephoneWarning = By.xpath("//div[contains(text(),'Telephone must be between 3 and 32 characters!')]");

    By passwordWarning = By.xpath("//div[contains(text(),'Password must be between 4 and 20 characters!')]");
    
    By passwordMismatchWarning = By.xpath("//div[contains(text(),'Password confirmation does not match password!')]");

    public void clickMyAccount() {

        driver.findElement(myAccount).click();
    }

    public void clickRegisterLink() {

        driver.findElement(registerLink).click();
    }

    public boolean verifyRegisterPage() {

        return driver.findElement(registerPageHeading).isDisplayed();
    }
    
    public void enterFirstName(String fname) {

        driver.findElement(firstName).sendKeys(fname);
    }

    public void enterLastName(String lname) {

        driver.findElement(lastName).sendKeys(lname);
    }

    public void enterEmail(String mail) {

        driver.findElement(email).sendKeys(mail);
    }

    public void enterTelephone(String phone) {

        driver.findElement(telephone).sendKeys(phone);
    }

    public void enterPassword(String pwd) {

        driver.findElement(password).sendKeys(pwd);
    }

    public void enterConfirmPassword(String cpwd) {

        driver.findElement(confirmPassword).sendKeys(cpwd);
    }

    public void clickPrivacyPolicy() {

        driver.findElement(privacyPolicy).click();
    }

    public void clickContinueButton() {

        driver.findElement(continueBtn).click();
    }

    public boolean verifyAccountCreation() {

        return driver.findElement(successMsg).isDisplayed();
    }
    
    public String verifyExistingEmailWarning() {

        return driver.findElement(existingEmailWarning).getText();
    }
    
    public String verifyPrivacyPolicyWarning() {

        return driver.findElement(privacyWarning).getText();
    }

    public String verifyFirstNameWarning() {

        return driver.findElement(firstNameWarning).getText();
    }

    public String verifyLastNameWarning() {

        return driver.findElement(lastNameWarning).getText();
    }

    public String verifyEmailWarning() {

        return driver.findElement(emailWarning).getText();
    }

    public String verifyTelephoneWarning() {

        return driver.findElement(telephoneWarning).getText();
    }

    public String verifyPasswordWarning() {

        return driver.findElement(passwordWarning).getText();
    }
    
    public String verifyPasswordMismatchWarning() {

        return driver.findElement(passwordMismatchWarning).getText();
    }
}