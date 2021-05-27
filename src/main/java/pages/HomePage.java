package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By searchLoc = By.id("searchAll");
    private By productsLoc = By.cssSelector("[data-eventlabel=melodyPromoGroup]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void  checkPrice() {
        checkbox.click();
    }

    public HomePage open() {
        driver.get("https://someUrl");
        return this;
    }

    public void searchRandomProd() {
        WebElement randomElem =
                driver.findElements(productsLoc).get(2);
        randomElem.click();
    }
    public void waitForPageLoad() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchLoc));
    }

}
