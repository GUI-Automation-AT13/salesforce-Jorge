package salesforce.ui.pages.lightning.contracts;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import salesforce.ui.pages.BasePage;
import java.util.HashMap;
import java.util.Map;

public class NewContractPage extends BasePage {
    @FindBy(css = "input[placeholder='Search Accounts...']")
    private WebElement accountName;
    @FindBy(xpath = "//mark[normalize-space()='TestAccount']")
    private WebElement accountSelector;
    @FindBy(css = "input[placeholder='Search Contacts...']")
    private WebElement customerSignedBy;
    @FindBy(xpath = "//div[@title='TestContact']")
    private WebElement contactSelector;
    @FindBy(xpath = "(//div/input[@class = ' input'])[2]")
    private WebElement customerSignedTittle;
    @FindBy(xpath = "(//div/input[@class = ' input'])[3]")
    private WebElement customerSignedDate;
    @FindBy(css = "input[placeholder='Search Price Books...']")
    private WebElement priceBook;
    @FindBy(xpath = "//mark[normalize-space()='Standard']")
    private WebElement priceBookSelector;
    @FindBy(xpath = "(//div/input[@class =' input'])[1]")
    private WebElement contractStartDate;
    @FindBy(css = ".input.uiInputSmartNumber")
    private WebElement contractTermMonths;
    @FindBy(css = ".select[aria-required='false']")
    private WebElement ownerExpirationNotice;
    @FindBy(xpath = "(//div/input[@class = ' input'])[4]")
    private WebElement companySignedDate;
    @FindBy(css = "textarea[placeholder='Billing Street']")
    private WebElement billingStreet;
    @FindBy(css = "input[placeholder='Billing City']")
    private WebElement billingCity;
    @FindBy(css = "input[placeholder='Billing State/Province']")
    private WebElement billingState;
    @FindBy(css = "input[placeholder='Billing Zip/Postal Code']")
    private WebElement billingPostalCode;
    @FindBy(css = "input[placeholder='Billing Country']")
    private WebElement billingCountry;
    @FindBy(xpath = "(//textarea[@class=\" textarea\" ])[1]")
    private WebElement specialTerms;
    @FindBy(xpath = "(//textarea[@class=\" textarea\" ])[last()]")
    private WebElement description;
    @FindBy(css = "button[title='Save']")
    private WebElement save;
    @FindBy(css = "button[title='Save & New']")
    private WebElement saveAndNew;
    @FindBy(css = "button[title='Cancel']")
    private WebElement cancel;
    /**
     * Initializes the elements and wait for page to be loaded.
     *
     * @param newWebDriverManager to be managed.
     */
    public NewContractPage(final WebDriverManager newWebDriverManager) {
        super(newWebDriverManager);
    }

    /**
     * Waits for the page to be loaded.
     */
    @Override
    protected void waitForPageLoaded() {
        webElementAction.waitForVisible(save);
    }

    /**
     * Sets the account name on a contract.
     *
     * @param newAccountName .
     */
    public void setAccountName(final String newAccountName) {
        webElementAction.setInputField(this.accountName, newAccountName);
        clickAccountSelector();
    }

    /**
     * Selects the account name on a contract.
     */
    public void clickAccountSelector() {
        webElementAction.clickElement(this.accountSelector);
    }

    /**
     * Sets the CustomerSignedBy element.
     *
     * @param newCustomerSignedBy to be typed.
     */
    public void setCustomerSignedBy(final String newCustomerSignedBy) {
        webElementAction.setInputField(this.customerSignedBy, newCustomerSignedBy);
        clickContactSelector();
    }

    /**
     * Selects the contact name on a contract.
     */
    public void clickContactSelector() {
        webElementAction.clickElement(this.contactSelector);
    }

    /**
     * Sets the CustomerSignedTittle element.
     *
     * @param newCustomerSignedTittle to be typed.
     */
    public void setCustomerSignedTittle(final String newCustomerSignedTittle) {
        webElementAction.setInputField(this.customerSignedTittle, newCustomerSignedTittle);
    }

    /**
     * Sets the customerSignedDate element.
     *
     * @param newCustomerSignedDate to be typed.
     */
    public void setCustomerSignedDate(final String newCustomerSignedDate) {
        webElementAction.setInputField(customerSignedDate, newCustomerSignedDate);
    }

    /**
     * Sets the priceBook element.
     *
     * @param newPriceBook to be typed.
     */
    public void setPriceBook(final String newPriceBook) {
        webElementAction.setInputField(this.priceBook, newPriceBook);
        selectPriceBook();
    }

    /**
     * Sets the priceBook element.
     */
    public void selectPriceBook() {
        webElementAction.clickElement(this.priceBookSelector);
    }

    /**
     * Sets the contractStartDate element.
     *
     * @param newContractStartDate to be typed.
     */
    public void setContractStartDate(final String newContractStartDate) {
        webElementAction.setInputField(this.contractStartDate, newContractStartDate);
    }

    /**
     * Sets the contractTermMonths element.
     *
     * @param newContractTermMonths to be typed.
     */
    public void setContractTermMonths(final String newContractTermMonths) {
        webElementAction.setInputField(this.contractTermMonths, newContractTermMonths);
    }

    /**
     * Sets the ownerExpirationNotice element.
     */
    public void clickOwnerExpirationNotice() {
        webElementAction.clickElement(this.ownerExpirationNotice);
    }

    /**
     * Sets the ownerExpirationNotice element on the selector.
     *
     * @param value for the xpath
     */
    public void selectOwnerExpirationNotice(final String value) {
        clickOwnerExpirationNotice();
        webElementAction.clickFieldByLinkText(value);
    }

    /**
     * Sets the companySignedDate element.
     *
     * @param newCompanySignedDate to be typed.
     */
    public void setCompanySignedDate(final String newCompanySignedDate) {
        webElementAction.setInputField(this.companySignedDate, newCompanySignedDate);
    }

    /**
     * Sets the billingStreet element.
     *
     * @param newBillingStreet to be typed.
     */
    public void setBillingStreet(final String newBillingStreet) {
        webElementAction.setInputField(this.billingStreet, newBillingStreet);
    }

    /**
     * Sets the billingCity element.
     *
     * @param newBillingCity to be typed.
     */
    public void setBillingCity(final String newBillingCity) {
        webElementAction.setInputField(this.billingCity, newBillingCity);
    }

    /**
     * Sets the billingState element.
     *
     * @param newBillingState to be typed.
     */
    public void setBillingState(final String newBillingState) {
        webElementAction.setInputField(this.billingState, newBillingState);
    }

    /**
     * Sets the billingPostalCode element.
     *
     * @param newBillingPostalCode to be typed.
     */
    public void setBillingPostalCode(final String newBillingPostalCode) {
        webElementAction.setInputField(this.billingPostalCode, newBillingPostalCode);
    }

    /**
     * Sets the billingCountry element.
     *
     * @param newBillingCountry to be typed.
     */
    public void setBillingCountry(final String newBillingCountry) {
        webElementAction.setInputField(this.billingCountry, newBillingCountry);
    }

    /**
     * Sets the specialTerms element.
     *
     * @param newSpecialTerms to be typed.
     */
    public void setSpecialTerms(final String newSpecialTerms) {
        webElementAction.setInputField(this.specialTerms, newSpecialTerms);
    }

    /**
     * Sets the description element.
     *
     * @param newDescription to be typed.
     */
    public void setDescription(final String newDescription) {
        webElementAction.setInputField(this.description, newDescription);
    }

    /**
     * Clicks on the save button.
     *
     * @return a CreatedContractPage.
     */
    public CreatedContractPage clickSave() {
        webElementAction.clickElement(save);
        return new CreatedContractPage(webDriverManager);
    }

    /**
     * Clicks on the save and new button and goes to a new contract to be created.
     *
     * @return a NewContractPage.
     */
    public NewContractPage clickSaveAndNew() {
        this.saveAndNew.click();
        return new NewContractPage(webDriverManager);
    }

    /**
     * Clicks on the cancel button.
     *
     * @return a ContractsPage.
     */
    public ContractsPage clickCancel() {
        this.cancel.click();
        return new ContractsPage(webDriverManager);
    }

    /**
     * Saves actions in New work type page in map.
     *
     * @param table is map
     */
    public void fillUpField(final Map<String, String> table) {
        HashMap<String, Runnable> actionsContractMap = mapActionsContract(table);
        table.keySet().forEach(key -> actionsContractMap.get(key).run());
    }

    /**
     * Saves actions in New work type page in map.
     *
     * @param contractMap is map
     * @return a map with action of fields
     */
    private HashMap<String, Runnable> mapActionsContract(final Map<String, String> contractMap) {
        HashMap<String, Runnable> mapActions = new HashMap<>();
        mapActions.put("Account Name", () -> setAccountName(contractMap.get("Account Name")));
        mapActions.put("Contract Term (months)", () -> setContractTermMonths(contractMap
                .get("Contract Term (months)")));
        mapActions.put("Contract Start Date", () -> setContractStartDate(contractMap.get("Contract Start Date")));
        mapActions.put("Customer Signed By", () -> setCustomerSignedBy(contractMap.get("Customer Signed By")));
        mapActions.put("Customer Signed Title", () -> setCustomerSignedTittle(contractMap
                .get("Customer Signed Title")));
        mapActions.put("Customer Signed Date", () -> setCustomerSignedDate(contractMap
                .get("Customer Signed Date")));
        mapActions.put("Price Book", () -> setPriceBook(contractMap.get("Price Book")));
        mapActions.put("Owner Expiration Notice", () -> selectOwnerExpirationNotice(contractMap
                .get("Owner Expiration Notice")));
        mapActions.put("Company Signed Date", () -> setCompanySignedDate(contractMap.get("Company Signed Date")));
        mapActions.put("Billing Street", () -> setBillingStreet(contractMap.get("Billing Street")));
        mapActions.put("Billing City", () -> setBillingCity(contractMap.get("Billing City")));
        mapActions.put("Billing state", () -> setBillingState(contractMap.get("Billing state")));
        mapActions.put("Billing postal code", () -> setBillingPostalCode(contractMap.get("Billing postal code")));
        mapActions.put("Billing country", () -> setBillingCountry(contractMap.get("Billing country")));
        mapActions.put("Special Terms", () -> setSpecialTerms(contractMap.get("Special Terms")));
        mapActions.put("Description", () -> setDescription(contractMap.get("Description")));
        return mapActions;
    }
}
