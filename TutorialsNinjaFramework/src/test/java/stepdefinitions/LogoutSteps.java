package stepdefinitions;

import org.testng.Assert;

import base.DriverSetup;
import io.cucumber.java.en.*;
import pages.LogoutPage;

public class LogoutSteps extends DriverSetup {

    LogoutPage logoutPage = new LogoutPage(driver);

    @Given("User opens home page for logout")
    public void user_opens_home_page_for_logout()
    {
        
    }

    @When("User clicks My Account")
    public void user_clicks_my_account()
    {
        logoutPage.clickMyAccount();
    }

    @And("User clicks Login option")
    public void user_clicks_login_option()
    {
        logoutPage.clickLogin();
    }

    @And("User enters valid logout username")
    public void user_enters_valid_logout_username()
    {
        logoutPage.enterEmail();
    }

    @And("User enters valid logout password")
    public void user_enters_valid_logout_password()
    {
        logoutPage.enterPassword();
    }

    @And("User clicks logout login button")
    public void user_clicks_logout_login_button()
    {
        logoutPage.clickLoginButton();
    }

    @And("User clicks My Account after login")
    public void user_clicks_my_account_after_login()
    {
        logoutPage.clickMyAccount();
    }

    @And("User clicks Logout option")
    public void user_clicks_logout_option()
    {
        logoutPage.clickLogout();
    }

    @Then("Logout should happen successfully")
    public void logout_should_happen_successfully()
    {
        Assert.assertTrue(logoutPage.verifyLogout());
        
    }
    @And("User clicks browser back button")
    public void user_clicks_browser_back_button() {

        driver.navigate().back();
    }

    @Then("User session should terminate successfully")
    public void user_session_should_terminate_successfully() {

        Assert.assertTrue(logoutPage.verifyLogoutPageDisplayed());
    }
    @And("User clicks continue button after logout")
    public void user_clicks_continue_button_after_logout() {

        logoutPage.clickContinueAfterLogout();
    }

    @Then("User should navigate to home page")
    public void user_should_navigate_to_home_page() {

        Assert.assertTrue(logoutPage.verifyHomePage());
    }
}