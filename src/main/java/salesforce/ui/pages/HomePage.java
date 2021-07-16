package salesforce.ui.pages;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Initializes the Web elements.
 */
public  class HomePage extends BasePage {

    @FindBy(css = ".allTabsArrow")
    private WebElement addObject;

    @Override
    protected void waitForPageLoaded() {
        WebDriverManager.getInstance().getWait().until(ExpectedConditions.elementToBeClickable(addObject));
    }

    /**
     * Clicks the addObject button.
     */
    public HomePageObjects clickAddObject() {
        addObject.click();
        return new HomePageObjects();
    }
}
