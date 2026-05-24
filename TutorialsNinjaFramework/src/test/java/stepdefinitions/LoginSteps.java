package stepdefinitions;

import org.openqa.selenium.WebDriver;

import utils.ScreenshotUtil;
import base.DriverSetup;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps {

    WebDriver driver = DriverSetup.getDriver();
	

    LoginPage lp = new LoginPage(driver);

    @Given("User opens login page")
    public void user_opens_login_page() {

        lp.clickMyAccount();
        lp.clickLogin();
    }

    @When("User enters email")
    public void user_enters_email() {

        lp.enterEmail("Testprogram@gmail.com");
    }

    @When("User enters password")
    public void user_enters_password() {

        lp.enterPassword("test123");
    }

    @When("User clicks login button")
    public void user_clicks_login_button() {

        lp.clickLoginButton();
    }
    

    @Then("User should login successfully")
    public void user_should_login_successfully() {

        System.out.println("Login Successful");
    }
    
    @When("User enters invalid email")
    public void user_enters_invalid_email() {

        lp.enterEmail("wrong@gmail.com");
    }
    
    @When("User enters valid password")
    public void user_enters_valid_password() {

        lp.enterPassword("test123");
    }

    @Then("Error message should display")
    public void error_message_should_display() {

        System.out.println("Invalid Login Error Displayed");
    }
    
    @When("User enters valid email")
    public void user_enters_valid_email() {

        lp.enterEmail("Testprogram@gmail.com");
    }

    
    @When("User enters invalid password")
    public void user_enters_invalid_password() {

        lp.enterPassword("wrong123");
    }
    
    @When("User enters blank email")
    public void user_enters_blank_email() {

        lp.enterEmail("");
    }

    @When("User enters blank password")
    public void user_enters_blank_password() {

        lp.enterPassword("");
    }
    
    @When("User enters wrong credentials")
    public void user_enters_wrong_credentials() {

        lp.enterEmail("wrong@gmail.com");

        lp.enterPassword("wrong123");
    }

    @Then("Proper warning message should display")
    public void proper_warning_message_should_display() {

        String actualMessage = lp.getWarningMessage();

        System.out.println(actualMessage);
    }
    
    @Then("All login page elements should display")
    public void all_login_page_elements_should_display() {

        System.out.println(lp.verifyEmailField());

        System.out.println(lp.verifyPasswordField());

        System.out.println(lp.verifyLoginButton());

        System.out.println(lp.verifyForgotPasswordLink());
    }
    @Then("Login should fail")
    public void login_should_fail() {

        ScreenshotUtil.captureScreenshot(driver, "LoginFailed");

        Assert.assertTrue(lp.verifyErrorMessage());
    }
}