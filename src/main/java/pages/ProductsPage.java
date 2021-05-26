package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    private WebDriver driver;
    private By productsLoc = By.cssSelector("#searchPage article");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getProductsCount() {
        return driver.findElements(productsLoc).size();
    }
}
