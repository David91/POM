package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;

public class SearchProductsTest {

    WebDriver driver;

    @BeforeClass
    public void driverSetup() {
        driver = new ChromeDriver();
        driver.get("https://6pm.com");
    }

    @Test
    public void verifyProductsDisplayFunctionalityAfterRandomSelection() {
        HomePage homePage = new HomePage(driver).open();
        homePage.waitForPageLoad();
        homePage.searchRandomProd();
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.waitForPageLoad();
        // here comes the other steps and assertions at the end
    }
}
