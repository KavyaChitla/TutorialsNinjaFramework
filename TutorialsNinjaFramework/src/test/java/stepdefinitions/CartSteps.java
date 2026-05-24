package stepdefinitions;

import org.openqa.selenium.WebDriver;

import base.DriverSetup;
import io.cucumber.java.en.*;
import pages.CartPage;


public class CartSteps {

    WebDriver driver = DriverSetup.getDriver();
	

    CartPage cp = new CartPage(driver);

    @Given("User opens application home page")
    public void user_opens_application_home_page() {

        // Home page already opened
    }

    @When("User searches product for cart")
    public void user_searches_product_for_cart() {

        cp.searchProduct("iPhone");
    }

    @When("User clicks cart search button")
    public void user_clicks_search_button() {

        cp.clickSearchButton();
    }

    @When("User adds product to cart")
    public void user_adds_product_to_cart() {

        cp.clickAddToCart();
    }

    @Then("Product should add to cart successfully")
    public void product_should_add_to_cart_successfully() {

        System.out.println(cp.verifySuccessMessage());
    }
    
    @When("User searches product for quantity update")
    public void user_searches_product_for_quantity_update() {

        cp.searchProduct("iPhone");
    }

    @When("User adds product for quantity update")
    public void user_adds_product_for_quantity_update() {

        cp.clickAddToCart();
    }

    @When("User updates product quantity")
    public void user_updates_product_quantity() {

        cp.updateQuantity();
    }

    @Then("Product quantity should update successfully")
    public void product_quantity_should_update_successfully() {

        System.out.println(cp.verifyQuantityUpdateMessage());
    }
    
    @When("User searches product to remove")
    public void user_searches_product_to_remove() {

        cp.searchProduct("iPhone");
    }

    @When("User adds product into cart")
    public void user_adds_product_into_cart() {

        cp.clickAddToCart();
    }

    @When("User opens shopping cart")
    public void user_opens_shopping_cart() throws Exception{

        cp.openCart();
    }

    @When("User removes product from cart")
    public void user_removes_product_from_cart() {

        cp.removeProduct();
    }

    @Then("Shopping cart should become empty")
    public void shopping_cart_should_become_empty() {

        System.out.println(cp.verifyEmptyCartMessage());
    }
    
    @When("User searches product for price verification")
    public void user_searches_product_for_price_verification() {

        cp.searchProduct("iPhone");
    }

    @When("User adds product for price verification")
    public void user_adds_product_for_price_verification() {

        cp.clickAddToCart();
    }

    @Then("Product price should display in cart")
    public void product_price_should_display_in_cart() {

        System.out.println(cp.verifyProductPrice());
    }
    
    @When("User searches product for total price")
    public void user_searches_product_for_total_price() {

        cp.searchProduct("iPhone");
    }

    @When("User adds product for total price")
    public void user_adds_product_for_total_price() {

        cp.clickAddToCart();
    }

    @Then("Total price should display successfully")
    public void total_price_should_display_successfully() {

        System.out.println(cp.verifyTotalPrice());
    }
    
}