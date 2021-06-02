package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JobsPage extends BasePage {
    private WebDriverWait wait;
    private By productsLoc = By.cssSelector("#searchPage article");
    private String url = "/en/jobs";

    public JobsPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver,20);
    }

    public JobsPage open() {
        driver.get(BASE_URL + url);
        return this;
    }

    public int getProductsCount() {
        return driver.findElements(productsLoc).size();
    }

    public void waitForPageLoad() {
        wait.until(ExpectedConditions.numberOfElementsToBe(logoLoc,20));
        wait.until(ExpectedConditions.numberOfElementsToBe(productsLoc,20));
    }
}
