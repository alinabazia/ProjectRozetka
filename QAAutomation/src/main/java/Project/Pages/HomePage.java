package Project.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    private final By catalog = By.id("fat-menu");
    private final By categoryNotebooks = By.xpath("//div[@cdktrapfocus]//a[text() = 'Ноутбуки та комп’ютери']");
    private final By search = By.cssSelector(".search-form__input.ng-untouched.ng-pristine.ng-valid");

    public HomePage openCatalog() {
        driver.findElement(catalog).click();
        return this;
    }
    public HomePage openCategoryNotebooks() {
        driver.findElement(catalog).click();
        driver.findElement(categoryNotebooks).click();
        return this;
    }
}
