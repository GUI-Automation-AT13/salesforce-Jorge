package salesforce.ui.pages;

import core.selenium.WebDriverManager;
import core.selenium.WebElementAction;
import org.openqa.selenium.support.PageFactory;

/**
 * Load home page.
 */
public abstract class BasePage {
    public WebElementAction webElementAction;
    public WebDriverManager webDriverManager;

    /**
     * Initializes the elements and wait for page to be loaded.
     *
     * @param newWebDriverManager to be managed.
     */
    public BasePage(final WebDriverManager newWebDriverManager) {
        this.webDriverManager = newWebDriverManager;
        this.webElementAction = new WebElementAction(webDriverManager);
        PageFactory.initElements(webDriverManager.getWebDriver(), this);
    }
    /**
     * Waits for the page to be loaded.
     */
    protected abstract void waitForPageLoaded();


}
