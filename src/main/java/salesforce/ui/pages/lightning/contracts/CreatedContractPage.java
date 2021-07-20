package salesforce.ui.pages.lightning.contracts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import salesforce.ui.pages.BasePage;

public class CreatedContractPage extends BasePage {

    @FindBy(css = "ul>li>div>span[title=\"Account Name\"] ~div")
    private WebElement accountName;
    /**
     * Waits for the page to be loaded.
     */
    @Override
    protected void waitForPageLoaded() {
        webElementAction.waitForVisible(accountName);
    }
    /**
     * Gets the text inside the element.
     *
     * @return the text set on the account name assigned to a contract.
     */
    public String getAccountName() {
        return webElementAction.getTextOfElement(accountName);
    }
}
