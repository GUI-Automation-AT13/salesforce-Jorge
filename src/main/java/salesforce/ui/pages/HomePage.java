package salesforce.ui.pages;

import org.openqa.selenium.WebDriver;

/**
 * Initializes the Web elements.
 */
public class HomePage extends BasePage {

    /**
     * Initializes the elements and wait for page to be loaded.
     *
     * @param driver The given driver.
     */
    public HomePage(final WebDriver driver) {
        super(driver);
    }

    @Override
    protected void waitForPageLoaded() {

    }
}
