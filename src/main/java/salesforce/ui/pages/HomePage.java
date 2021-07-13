package salesforce.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Initializes the Web elements.
 */
public class HomePage extends BasePage {

    @FindBy(css = ".allTabsArrow")
    private WebElement addObject;

    /**
     * Initializes the elements and wait for page to be loaded.
     *
     * @param driver The given driver.
     */
    public HomePage(final WebDriver driver) {
        super(driver);
    }

    /**
     * Waits for the addObjects button to be charged.
     */
    @Override
    protected void waitForPageLoaded() {
        wait.until(ExpectedConditions.visibilityOf(addObject));
    }
}
