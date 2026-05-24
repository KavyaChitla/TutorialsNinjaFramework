package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {

        this.driver = driver;
    }

    By searchBox = By.name("search");

    By searchButton = By.xpath("//button[@class='btn btn-default btn-lg']");

    By product = By.linkText("iPhone");  
    
    By noProductMessage = By.xpath("//p[text()='There is no product that matches the search criteria.']");
    
    By searchResultProduct = By.linkText("MacBook");
    
    By productHeading = By.xpath("//h1[text()='iPhone']");

    public String verifyNoProductMessage() {

        return driver.findElement(noProductMessage).getText();
    }

    public void enterProduct(String productName) {

        driver.findElement(searchBox).sendKeys(productName);
    }

    public void clickSearchButton() {

        driver.findElement(searchButton).click();
    }

    public boolean verifyProductDisplayed() {

        return driver.findElement(product).isDisplayed();
    }
    
    public boolean verifySearchResults() {

        return driver.findElement(searchResultProduct).isDisplayed();
    }
    
    public void clickProduct() {

        driver.findElement(product).click();
    }

    public boolean verifyProductDetailsPage() {

        return driver.findElement(productHeading).isDisplayed();
    }
}