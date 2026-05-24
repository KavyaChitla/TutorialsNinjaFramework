package stepdefinitions;

import org.openqa.selenium.WebDriver;


import base.DriverSetup;

import io.cucumber.java.en.*;
import pages.SearchPage;

public class SearchSteps {

    WebDriver driver = DriverSetup.getDriver();


    SearchPage sp = new SearchPage(driver);

    @Given("User opens home page")
    public void user_opens_home_page() {
    }

    @When("User enters valid product in search box")
    public void user_enters_valid_product_in_search_box() {

        sp.enterProduct("iPhone");
    }

    @When("User clicks search button")
    public void user_clicks_search_button() {

        sp.clickSearchButton();
    }

    @Then("Matching product should display")
    public void matching_product_should_display() {

        System.out.println(sp.verifyProductDisplayed());
    }
    
    @When("User enters invalid product in search box")
    public void user_enters_invalid_product_in_search_box() {

        sp.enterProduct("InvalidProduct123");
    }

    @Then("No product found message should display")
    public void no_product_found_message_should_display() {

        System.out.println(sp.verifyNoProductMessage());
    }
    
    @When("User clicks search without product")
    public void user_clicks_search_without_product() {

        sp.enterProduct(""); // leave search box empty
        sp.clickSearchButton();
    }

    @Then("Search warning message should display")
    public void search_warning_message_should_display() {

        System.out.println(sp.verifyNoProductMessage());
    }
    
    @When("User searches for a valid product")
    public void user_searches_for_a_valid_product() {

        sp.enterProduct("MacBook");
    }

    @Then("Search results should display")
    public void search_results_should_display() {

        System.out.println(sp.verifySearchResults());
    }
    
    @When("User searches product details")
    public void user_searches_product_details() {

        sp.enterProduct("iPhone");
    }

    @When("User opens searched product")
    public void user_opens_searched_product() {

        sp.clickProduct();
    }

    @Then("Product details page should display")
    public void product_details_page_should_display() {

        System.out.println(sp.verifyProductDetailsPage());
    }
}