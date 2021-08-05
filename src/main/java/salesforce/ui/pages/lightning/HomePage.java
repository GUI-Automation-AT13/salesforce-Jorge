package salesforce.ui.pages.lightning;

import core.selenium.WebDriverManager;
import salesforce.ui.pages.BasePage;

public class HomePage extends BasePage {
    /**
     * Initializes the elements and wait for page to be loaded.
     *
     * @param newWebDriverManager to be managed.
     */
    public HomePage(final WebDriverManager newWebDriverManager) {
        super(newWebDriverManager);
    }

    @Override
    protected void waitForPageLoaded() {
    }
}
