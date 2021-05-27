package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By productsLoc = By.cssSelector("#searchPage article");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,20);
    }

    public int getProductsCount() {
        return driver.findElements(productsLoc).size();
    }

    public void waitForPageLoad() {
        wait.until(ExpectedConditions.numberOfElementsToBe(productsLoc,20));
    }
}
