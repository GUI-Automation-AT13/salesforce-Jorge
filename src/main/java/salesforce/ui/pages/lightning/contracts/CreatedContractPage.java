package salesforce.ui.pages.lightning.contracts;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import salesforce.ui.pages.BasePage;

public class CreatedContractPage extends BasePage {

    @FindBy(css = ".slds-theme--success")
    private WebElement successMessage;
    @FindBy(xpath = "//h1/div//span")
    private WebElement contractNumber;
    @FindBy(xpath = "(//span[text()='Details'])[last()]")
    private WebElement details;
    @FindBy(xpath = "(//ul//li//div//span[@title=\"Account Name\"] /following-sibling::div)[last()]")
    private WebElement accountNameTitle;
    @FindBy(xpath = "(//ul//li//div//span[@title=\"Contract Start Date\"] /following-sibling::div)[last()]")
    private WebElement contractStartDateTitle;
    @FindBy(xpath = "(//ul//li//div//span[@title=\"Contract End Date\"] /following-sibling::div)[last()]")
    private WebElement contractEndDateTitle;
    @FindBy(xpath = "(//div[./div[./span[text()='Contract Start Date']]]//span//span)[last()]")
    private WebElement contractStartDate;
    /**
     * Initializes the elements and wait for page to be loaded.
     *
     * @param newWebDriverManager to be managed.
     */
    public CreatedContractPage(final WebDriverManager newWebDriverManager) {
        super(newWebDriverManager);
    }

    /**
     * Gets the text inside the element.
     *
     * @return the text set on the account name assigned to a contract.
     */
    public ContractDetails clickDetails() {
        webElementAction.clickElement(details);
        webElementAction.scrollToBottom();
        return new ContractDetails(webDriverManager);
    }

    /**
     * Gets the text inside the element.
     *
     * @return the text set on the field requested contract.
     */
    public String contractStartDateText() {
        return webElementAction.getTextOfElement(contractStartDate);
    }
    /**
     * Gets the text inside the element.
     *
     * @return the text set on success contract message.
     */
    public String getSuccessContractNumber() {
        String contractNum = webElementAction.getTextOfElement(successMessage);

        return contractNum.replaceAll("[^0-9]", "");
    }
    /**
     * Gets the text inside the element.
     *
     * @return the text set on success contract message.
     */
    public String getContractNumber() {
        return webElementAction.getTextOfElement(contractNumber);
    }
    /**
     * Waits for the page to be loaded.
     */
    @Override
    protected void waitForPageLoaded() {
        webElementAction.waitForVisible(accountNameTitle);
    }


}
