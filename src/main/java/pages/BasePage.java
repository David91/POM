package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

abstract public class BasePage {
    protected WebDriver driver;
    protected By logoLoc = By.xpath("//someXpath");
    protected String navBarElemLocTemplate = "str%sandstr";
    protected final String BASE_URL = "https://staff.am";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnNavBarByText(String navElemText) {
        String actualNavLocText = String.format(navBarElemLocTemplate,navElemText);
        WebElement navElem = driver.findElement(By.xpath(actualNavLocText));
        navElem.click();
    }
}
