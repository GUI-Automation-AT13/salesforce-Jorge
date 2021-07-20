package salesforce.ui.pages.classic;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;

/**
 * Initializes the Web elements.
 */
public class ClassicHomePage extends BasePage {

    @FindBy(css = ".allTabsArrow")
    private WebElement addObject;

    /**
     * Waits for the page to be loaded.
     */
    @Override
    protected void waitForPageLoaded() {
        WebDriverManager.getInstance().getWait().until(ExpectedConditions.elementToBeClickable(addObject));
    }

    /**
     * Clicks the addObject button.
     *
     * @return a HomePageObjects.
     */
    public ClassicHomePageObjects clickAddObject() {
        addObject.click();
        return new ClassicHomePageObjects();
    }
}
