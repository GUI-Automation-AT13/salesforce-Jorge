package salesforce.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Load home page.
 */
public abstract class BasePage {
    public static WebDriver driver;
    protected WebDriverWait wait;
    private final int timeOutInSeconds = 30;

    /**
     * Initializes the elements and wait for page to be loaded.
     *
     * @param webDriver The given webDriver.
     */
    public BasePage(final WebDriver webDriver) {
        this.driver = webDriver;
        wait = new WebDriverWait(webDriver, timeOutInSeconds);
        PageFactory.initElements(webDriver, this);
        waitForPageLoaded();
    }
    protected abstract void waitForPageLoaded();
}
