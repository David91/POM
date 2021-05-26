package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class SearchProductsTest {

    WebDriver driver;

    @BeforeClass
    public void driverSetup() {
        driver = new ChromeDriver();
        driver.get("https://6pm.com");
    }

    @Test
    public void verifyProductsDisplayFunctionalityAfterRandomSelection() {
        HomePage homePage = new HomePage(driver);
        homePage.searchRandomProd();
    }
}
