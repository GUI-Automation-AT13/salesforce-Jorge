package salesforce.ui.pages.lightning.contracts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import salesforce.ui.pages.BasePage;

public class CreatedContractPage extends BasePage {

    @FindBy (xpath = "(//span[text()='Details'])[last()]")
    private  WebElement details;
    @FindBy(xpath = "(//ul//li//div//span[@title=\"Account Name\"] /following-sibling::div)[last()]")
    private WebElement accountNameTitle;
    @FindBy(xpath = "(//ul//li//div//span[@title=\"Contract Start Date\"] /following-sibling::div)[last()]")
    private WebElement contractStartDateTitle;
    @FindBy(xpath = "(//ul//li//div//span[@title=\"Contract End Date\"] /following-sibling::div)[last()]")
    private WebElement contractEndDateTitle;
    @FindBy(xpath = "//div[./div[./span[text()='Contract Owner']]]//a")
    private WebElement contractOwner;
    @FindBy(xpath = "//div[./div[./span[text()='Status']]]//span//span")
    private WebElement status;
    @FindBy(xpath = "(//div[@data-aura-class=\"forceOutputLookupWithPreview\"]/a)[last() -2]")
    private WebElement accountName;
    @FindBy(xpath = "(//div[@data-aura-class=\"forceOutputLookupWithPreview\"]/a)[last() -1]")
    private WebElement customerSignedBy;
    @FindBy(xpath = "(//div[@data-aura-class=\"forceOutputLookupWithPreview\"]/a)[last()]")
    private WebElement priceBook;
    /**
     * Waits for the page to be loaded.
     */
    @Override
    protected void waitForPageLoaded() {
        webElementAction.waitForVisible(accountNameTitle);
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
