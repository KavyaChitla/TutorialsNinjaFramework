package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {

        this.driver = driver;
    }

    By searchBox = By.name("search");

    By searchButton =
    By.xpath("//button[@class='btn btn-default btn-lg']");

    By addToCartButton = By.xpath("(//button[contains(@onclick,'cart.add')])[1]");

    By successMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    
    By quantityBox = By.xpath("//input[contains(@name,'quantity')]");

    By updateButton = By.xpath("//button[@data-original-title='Update']");

    By successUpdateMessage = By.xpath("//div[contains(@class,'alert-success')]");
    
    By cartButton = By.id("cart-total");
    
    By viewCart = By.linkText("View Cart");

    By removeButton = By.xpath("//button[contains(@data-original-title,'Remove')]");

    By emptyCartMessage = By.xpath("//*[contains(text(),'Your shopping cart is empty')]");
    
    By productPrice = By.xpath("//td[@class='text-right'][2]");
    
    By totalPrice = By.xpath("//table//tbody//tr//td[@class='text-right'][2]");

    public void searchProduct(String product) {

        driver.findElement(searchBox).sendKeys(product);
    }

    public void clickSearchButton() {

        driver.findElement(searchButton).click();
    }

    public void clickAddToCart() {

        driver.findElement(addToCartButton).click();
    }

    public String verifySuccessMessage() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));

        return driver.findElement(successMessage).getText();
    }
    
    public void updateQuantity() {

        driver.findElement(quantityBox).clear();

        driver.findElement(quantityBox).sendKeys("2");

        driver.findElement(updateButton).click();
    }

    public String verifyQuantityUpdateMessage() {

        return driver.findElement(successUpdateMessage).getText();
    }
    
    public void openCart() throws Exception {

        Thread.sleep(2000);

        driver.navigate().refresh();

        Thread.sleep(2000);

        driver.findElement(cartButton).click();

        Thread.sleep(1000);

        driver.findElement(viewCart).click();
    }
    
    /*public void openCart() {

        WebDriverWait wait =
        new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement cart =
        wait.until(ExpectedConditions.elementToBeClickable(cartButton));

        cart.click();

        WebElement view =
        wait.until(ExpectedConditions.elementToBeClickable(viewCart));

        view.click();
    }  */

    public void removeProduct() {

        driver.findElement(removeButton).click();
    }

    public String verifyEmptyCartMessage() {
    	return driver.getPageSource();

        /*WebDriverWait wait =
        new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
        ExpectedConditions.visibilityOfElementLocated(emptyCartMessage));

        return driver.findElement(emptyCartMessage).getText();  */
    }
    
    public boolean verifyCartPageDisplayed() {

        return driver.getPageSource().contains("Shopping Cart");
    }
    
    public String verifyProductPrice() {

        return driver.findElement(productPrice).getText();
    }
    
    public String verifyTotalPrice() {

        return driver.findElement(totalPrice).getText();
    }
}