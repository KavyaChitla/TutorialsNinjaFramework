package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage(WebDriver driver) {

        this.driver = driver;
    }

    By searchBox = By.name("search");

    By searchButton = By.xpath("//button[@class='btn btn-default btn-lg']");

    By addToCartButton = By.xpath("(//span[text()='Add to Cart'])[1]");

    By cartButton = By.id("cart-total");

    By viewCart = By.xpath("//a[contains(@href,'cart')]");

    By checkoutButton = By.linkText("Checkout");

    By checkoutHeading = By.xpath("//span[contains(@class,'hidden-xs')and contains(text(),'Chechout')]");
    
    /*By guestCheckout =
    		By.xpath("//input[@value='guest']");

    		By continueGuest =
    		By.id("button-account");  */
    
    By email = By.id("input-email");

    By password = By.id("input-password");

    By loginButton = By.id("button-login");
    
    By shippingMethod = By.name("shipping_method");
    /*
    By firstName =
    		By.id("input-payment-firstname");

    		By lastName =
    		By.id("input-payment-lastname");

    		By address =
    		By.id("input-payment-address-1");

    		By city =
    		By.id("input-payment-city");

    		By postcode =
    		By.id("input-payment-postcode");

    		By country =
    		By.id("input-payment-country");

    		By state =
    		By.id("input-payment-zone");
    		*/

    public void searchProduct(String product) {

        driver.findElement(searchBox).sendKeys(product);
    }

    public void clickSearchButton() {

        driver.findElement(searchButton).click();
    }

    public void clickAddToCart() {

        driver.findElement(addToCartButton).click();
    }

    /*public void openCart() throws Exception {

        driver.findElement(cartButton).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[contains(@href,'cart')]")).click();
    }  */
    public void openCart() throws Exception {

        Thread.sleep(3000);

        driver.navigate().refresh();

        Thread.sleep(3000);

        driver.findElement(By.id("cart-total")).click();

        Thread.sleep(3000);
    }

    public void clickCheckoutButton() {

        driver.findElement(checkoutButton).click();
    }

    /*public boolean verifyCheckoutPage() {

        return driver.findElement(checkoutHeading).isDisplayed();
    }
    
    By checkoutHeading = By.xpath("//*[contains(text(),'Checkout')]");   */

    public boolean verifyCheckoutPage() {

        return driver.findElements(checkoutHeading).size() > 0;
    }
    
    /*public void selectGuestCheckout() {

        driver.findElement(By.xpath("//input[@value='guest']")).click();
        driver.findElement(By.id("button-account")).click();
    } */
    
    public void enterBillingDetails() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(driver -> 
            driver.findElements(By.id("input-payment-firstname")).size() > 0
        );

        driver.findElement(By.id("input-payment-firstname")).sendKeys("Test");
        driver.findElement(By.id("input-payment-lastname")).sendKeys("User");
    }
    public void selectShippingMethod()
    {
        
    } 
    
    public boolean verifyShippingMethod()
    {
        return true;
    }
    public void selectPaymentMethod()
    {

    }
    public boolean verifyPaymentMethod()
    {
        return true;
    }
    
    public void confirmOrder()
    {

    }
    
    public boolean verifyOrderConfirmation()
    {
        return true;
    }
    /*public void selectGuestCheckout() {

        driver.findElement(guestCheckout).click();
    }

    public void clickGuestContinue() {

        driver.findElement(continueGuest).click();
    } 
    
    public void enterFirstName() throws Exception{
    	Thread.sleep(3000);

        driver.findElement(firstName).sendKeys("Sekhar");
    }

    public void enterLastName() {

        driver.findElement(lastName).sendKeys("Kumar");
    }

    public void enterAddress() {

        driver.findElement(address).sendKeys("Vijayawada");
    }

    public void enterCity() {

        driver.findElement(city).sendKeys("Vijayawada");
    }

    public void enterPostcode() {

        driver.findElement(postcode).sendKeys("520001");
    }

    public void selectCountry() {

        Select sc = new Select(driver.findElement(country));

        sc.selectByVisibleText("India");
    }

    public void selectState() {

        Select sc = new Select(driver.findElement(state));

        sc.selectByVisibleText("Andhra Pradesh");
    }
    */
    public void loginCheckoutAccount()
    {
        driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");

        driver.findElement(By.id("input-password")).sendKeys("test123");

        driver.findElement(By.id("button-login")).click();
    }
    
    /*public void loginCheckoutAccount() throws Exception {

        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[text()='Returning Customer']")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("input-email"))
                .sendKeys("test123@gmail.com");

        driver.findElement(By.id("input-password"))
                .sendKeys("Test@123");

        driver.findElement(By.id("button-login")).click();

        Thread.sleep(4000);
        System.out.println("User already on chechout page");
    } */
}



