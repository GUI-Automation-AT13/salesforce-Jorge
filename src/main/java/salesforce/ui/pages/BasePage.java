package salesforce.ui.pages;

import core.selenium.WebDriverManager;
import org.openqa.selenium.support.PageFactory;

/**
 * Load home page.
 */
public abstract class BasePage {

    /**
     * Initializes the elements and wait for page to be loaded.
     *
     */
    public  BasePage() {
        PageFactory.initElements(WebDriverManager.getInstance().getWebDriver(), this);
        waitForPageLoaded();
    }
    protected abstract void waitForPageLoaded();


}
