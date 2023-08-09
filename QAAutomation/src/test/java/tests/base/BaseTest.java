package tests.base;

import Project.Pages.BasePage;
import Project.Pages.CategoryComputers;
import Project.Pages.HomePage;
import Project.Pages.SneakerProductPage;
import Project.common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected HomePage homePage = new HomePage(driver);
    protected CategoryComputers categoryComputers = new CategoryComputers(driver);
    protected SneakerProductPage sneakerProductPage = new SneakerProductPage(driver);

    // @AfterSuite (alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}
