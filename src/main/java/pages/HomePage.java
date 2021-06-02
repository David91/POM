package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
    private WebDriverWait wait;
    private By searchLoc = By.id("searchAll");
    private By productsLoc = By.cssSelector("[data-eventlabel=melodyPromoGroup]");
    private String url = "/";

    public HomePage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver,20);
    }

    public void  checkPrice() {
        checkbox.click();
    }

    public HomePage open() {
        driver.get(BASE_URL + url);
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
