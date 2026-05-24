package stepdefinitions;

import org.openqa.selenium.WebDriver;

import base.DriverSetup;

import io.cucumber.java.en.*;
import pages.RegisterPage;

public class RegisterSteps {

    WebDriver driver = DriverSetup.getDriver();
	
    RegisterPage rp = new RegisterPage(driver);

    @Given("User clicks My Account")
    public void user_clicks_my_account() {

        rp.clickMyAccount();
    }

    @When("User clicks Register link")
    public void user_clicks_register_link() {

        rp.clickRegisterLink();
    }

    @Then("Registration page should display")
    public void registration_page_should_display() {

        System.out.println(rp.verifyRegisterPage());
    }
    
    @Given("User navigates to registration page")
    public void user_navigates_to_registration_page() {

        rp.clickMyAccount();

        rp.clickRegisterLink();
    }

    @When("User enters registration first name")
    public void user_enters_registration_first_name() {

        rp.enterFirstName("Sekhar");
    }

    @When("User enters registration last name")
    public void user_enters_registration_last_name() {

        rp.enterLastName("Kumar");
    }

    @When("User enters registration email")
    public void user_enters_registration_email() {
    	String email="kavya"+System.currentTimeMillis()+"@gmail.com";

        rp.enterEmail(email);
    }

    @When("User enters registration telephone")
    public void user_enters_registration_telephone() {

        rp.enterTelephone("9876543899");
    }

    @When("User enters registration password")
    public void user_enters_registration_password() {

        rp.enterPassword("test123");
    }

    @When("User enters registration confirm password")
    public void user_enters_registration_confirm_password() {

        rp.enterConfirmPassword("test123");
    }
    
    @When("User selects privacy policy")
    public void user_selects_privacy_policy() {

        rp.clickPrivacyPolicy();
    }
    
    @When("User clicks continue button")
    public void user_clicks_continue_button() {

        rp.clickContinueButton();
    }
    
    @Then("Account should get created successfully")
    public void account_should_get_created_successfully() {

        System.out.println(rp.verifyAccountCreation());
    }
    
    @When("User enters existing first name")
    public void user_enters_existing_first_name() {

        rp.enterFirstName("Sekhar");
    }

    @When("User enters existing last name")
    public void user_enters_existing_last_name() {

        rp.enterLastName("Kumar");
    }

    @When("User enters existing email")
    public void user_enters_existing_email() {

        rp.enterEmail("sekhar12345@gmail.com");
    }

    @When("User enters existing telephone")
    public void user_enters_existing_telephone() {

        rp.enterTelephone("9876543210");
    }

    @When("User enters existing password")
    public void user_enters_existing_password() {

        rp.enterPassword("test123");
    }

    @When("User enters existing confirm password")
    public void user_enters_existing_confirm_password() {

        rp.enterConfirmPassword("test123");
    }

    @Then("Warning message for existing email should display")
    public void warning_message_for_existing_email_should_display() {

        System.out.println(rp.verifyExistingEmailWarning());
    }
    
    @When("User leaves all mandatory fields empty")
    public void user_leaves_all_mandatory_fields_empty() {

    }

    @Then("Mandatory field warning messages should display")
    public void mandatory_field_warning_messages_should_display() {

        System.out.println(rp.verifyPrivacyPolicyWarning());

        System.out.println(rp.verifyFirstNameWarning());

        System.out.println(rp.verifyLastNameWarning());

        System.out.println(rp.verifyEmailWarning());

        System.out.println(rp.verifyTelephoneWarning());

        System.out.println(rp.verifyPasswordWarning());
    }
    
    @When("User enters mismatch first name")
    public void user_enters_mismatch_first_name() {

        rp.enterFirstName("Sekhar");
    }

    @When("User enters mismatch last name")
    public void user_enters_mismatch_last_name() {

        rp.enterLastName("Kumar");
    }

    @When("User enters mismatch email")
    public void user_enters_mismatch_email() {

        rp.enterEmail("sekhar789@gmail.com");
    }

    @When("User enters mismatch telephone")
    public void user_enters_mismatch_telephone() {

        rp.enterTelephone("9876543210");
    }

    @When("User enters mismatch password")
    public void user_enters_mismatch_password() {

        rp.enterPassword("test123");
    }

    @When("User enters mismatch confirm password")
    public void user_enters_mismatch_confirm_password() {

        rp.enterConfirmPassword("wrong123");
    }

    @Then("Password mismatch warning should display")
    public void password_mismatch_warning_should_display() {

        System.out.println(rp.verifyPasswordMismatchWarning());
    }
    
    @When("User enters success first name")
    public void user_enters_success_first_name() {

        rp.enterFirstName("Sekhar");
    }

    @When("User enters success last name")
    public void user_enters_success_last_name() {

        rp.enterLastName("Kumar");
    }

    @When("User enters success email")
    public void user_enters_success_email() {

        String email =
        "sekhar" + System.currentTimeMillis() + "@gmail.com";

        rp.enterEmail(email);
    }

    @When("User enters success telephone")
    public void user_enters_success_telephone() {

        rp.enterTelephone("9876543210");
    }

    @When("User enters success password")
    public void user_enters_success_password() {

        rp.enterPassword("test123");
    }

    @When("User enters success confirm password")
    public void user_enters_success_confirm_password() {

        rp.enterConfirmPassword("test123");
    }

    @Then("Success message should display")
    public void success_message_should_display() {

        System.out.println(rp.verifyAccountCreation());
    }
}