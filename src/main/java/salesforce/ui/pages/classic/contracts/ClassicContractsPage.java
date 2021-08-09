package salesforce.ui.pages.classic.contracts;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import salesforce.ui.pages.BasePage;

public class ClassicContractsPage extends BasePage {

    @FindBy(css = "input[title='New']")
    private WebElement newContractButton;

    @FindBy(id = "tryLexDialogX")
    private WebElement adCloseBtn;

    /**
     * Initializes the elements and wait for page to be loaded.
     *
     * @param newWebDriverManager to be managed.
     */
    public ClassicContractsPage(final WebDriverManager newWebDriverManager) {
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
     * Closes a popup.
     */
    public void clickAdCloseBtn() {
        webElementAction.waitForVisible(adCloseBtn);
        adCloseBtn.click();
    }
    /**
     * Clicks on a new contract button.
     *
     * @return a new NewContractPage.
     */
    public ClassicNewContractPage clickNew() {
        newContractButton.click();
        return new ClassicNewContractPage(webDriverManager);
    }

}
