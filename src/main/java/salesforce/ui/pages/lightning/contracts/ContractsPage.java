package salesforce.ui.pages.lightning.contracts;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import salesforce.ui.pages.BasePage;

public class ContractsPage extends BasePage {
    @FindBy(css = "a[title='New']")
    private WebElement newContractButton;

    /**
     * Initializes the elements and wait for page to be loaded.
     *
     * @param newWebDriverManager to be managed.
     */
    public ContractsPage(final WebDriverManager newWebDriverManager) {
        super(newWebDriverManager);
    }

    /**
     * Waits for the page to be loaded.
     */
    @Override
    protected void waitForPageLoaded() {
        webElementAction.waitForVisible(newContractButton);
    }
    /**
     * Logs in successfully.
     *
     * @return a ProductPage instance
     */
    public NewContractPage clickNewContractButton() {
        webElementAction.clickElement(newContractButton);
        return new NewContractPage(webDriverManager);
    }
}
