package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.JobsPage;

public class SearchProductsTest {

    WebDriver driver;

    @BeforeClass
    public void driverSetup() {
        driver = new ChromeDriver();
    }

    @Test
    public void verifyProductsDisplayFunctionalityAfterRandomSelection() {
        JobsPage jobsPage = new JobsPage(driver).open();
        jobsPage.waitForPageLoad();
        //some code here
        jobsPage.clickOnNavBarByText("nav text");
        // here comes the other steps and assertions at the end
    }
}
