package salesforce.ui.pages.classic;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import salesforce.ui.pages.BasePage;

/**
 * Initializes the Web elements.
 */
public class ClassicHomePage extends BasePage {

    @FindBy(css = ".allTabsArrow")
    private WebElement addObject;

    /**
     * Initializes the elements and wait for page to be loaded.
     *
     * @param newWebDriverManager to be managed.
     */
    public ClassicHomePage(final WebDriverManager newWebDriverManager) {
        super(newWebDriverManager);
    }

    /**
     * Waits for the page to be loaded.
     */
    @Override
    protected void waitForPageLoaded() {
        webElementAction.waitForVisible(addObject);
    }

    /**
     * Clicks the addObject button.
     *
     * @return a HomePageObjects.
     */
    public ClassicHomePageObjects clickAddObject() {
        addObject.click();
        return new ClassicHomePageObjects(webDriverManager);
    }
}
