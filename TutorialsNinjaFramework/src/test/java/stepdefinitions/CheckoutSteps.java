package stepdefinitions;

import base.DriverSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckoutPage;

public class CheckoutSteps {

    CheckoutPage cp =
    new CheckoutPage(DriverSetup.getDriver());

    @Given("User opens home page for checkout")
    public void user_opens_home_page_for_checkout() {

        System.out.println("Checkout Started");
    }

    @When("User searches HP product")
    public void user_searches_hp_product() {

        cp.searchProduct("HP");
    }

    @When("User clicks checkout search button")
    public void user_clicks_checkout_search_button() {

        cp.clickSearchButton();
    }

    @When("User adds HP product to cart")
    public void user_adds_hp_product_to_cart() {

        cp.clickAddToCart();
    }

    @When("User opens cart for checkout")
    public void user_opens_cart_for_checkout() throws Exception {

        cp.openCart();
    }

    @When("User clicks checkout button")
    public void user_clicks_checkout_button() {

        cp.clickCheckoutButton();
    }

    @Then("Checkout page should display")
    public void checkout_page_should_display() {

        System.out.println(cp.verifyCheckoutPage());
    }
    
    @When("User enters billing details")
    public void user_enters_billing_details() {
        cp.enterBillingDetails();
    }
    @Then("Billing details should be saved successfully")
    public void billing_details_should_be_saved_successfully() {
        System.out.println("Billing details saved successfully");
    }
    
    /* @When("User selects guest checkout option")
    public void user_selects_guest_checkout_option() {
        cp.selectGuestCheckout();
    } 
    
    @When("User enters billing first name")
    public void user_enters_billing_first_name() throws Exception{

        cp.enterFirstName();
    }

    @When("User enters billing last name")
    public void user_enters_billing_last_name() {

        cp.enterLastName();
    }

    @When("User enters billing address")
    public void user_enters_billing_address() {

        cp.enterAddress();
    }

    @When("User enters billing city")
    public void user_enters_billing_city() {

        cp.enterCity();
    }

    @When("User enters billing postcode")
    public void user_enters_billing_postcode() {

        cp.enterPostcode();
    }

    @When("User selects billing country")
    public void user_selects_billing_country() {

        cp.selectCountry();
    }

    @When("User selects billing state")
    public void user_selects_billing_state() {

        cp.selectState();
    }
*/
    @Then("Billing details should accept successfully")
    public void billing_details_should_accept_successfully() {

        System.out.println("Checkout Billing Page Opened");
    }
    
    @When("User selects shipping method")
    public void user_selects_shipping_method()
    {
        
    }
    @Then("Shipping method should select successfully")
    public void shipping_method_should_select_successfully()
    {
        
    }
    
    @When("User selects payment method")
    public void user_selects_payment_method()
    {
    }
    
    @Then("Payment method should select successfully")
    public void payment_method_should_select_successfully()
    {
    }
    
    @When("User confirms order")
    public void user_confirms_order()
    {
    }
    @Then("Order should confirm successfully")
    public void order_should_confirm_successfully()
    {
        
    }
    
    /*@When("User logs into checkout account")
    public void user_logs_into_checkout_account()
    throws Exception {

        cp.loginCheckoutAccount();
    } */
    
    /*@When("User selects guest checkout")
    public void user_selects_guest_checkout() {

        cp.selectGuestCheckout();
    }

    @When("User clicks continue for guest checkout")
    public void user_clicks_continue_for_guest_checkout() {

        cp.clickGuestContinue();
    }  */
}