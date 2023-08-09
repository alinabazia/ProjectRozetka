package Project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class SneakerProductPage extends BasePage {
    public SneakerProductPage(WebDriver driver) {
        super(driver);
    }
    private final By size38 = By.xpath("//*[@class='ng-star-inserted' and contains(text(),'38 ')]");
    private final By productCode =  By.xpath("//*[@class='product-about__right']//*[@class='product__code-accent' and contains(text(), '333120058')]");

    public SneakerProductPage changeSizeTo38() {
        driver.findElement(size38).click();
        return this;
    }
    public SneakerProductPage productCodeIsVisible() {
        final WebElement productCodeElement = driver.findElement(productCode);
        waitElementIsVisible(productCodeElement);
        assertTrue(productCodeElement.isDisplayed(), "Correct product code is not displayed");
        return this;
    }
}
