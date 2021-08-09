package salesforce.ui.pages.classic.contracts;

import core.selenium.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import salesforce.ui.pages.BasePage;

public class ClassicNewContractPage extends BasePage {
    @FindBy(css = "#ctrc7")
    private WebElement accountName;
    @FindBy(css = "#ctrc16")
    private WebElement customerSignedBy;
    @FindBy(css = "#CustomerSignedTitle")
    private WebElement customerSignedTittle;
    @FindBy(css = "#ctrc6")
    private WebElement customerSignedDate;
    @FindBy(css = "#ctrc17")
    private WebElement priceBook;
    @FindBy(css = "#ctrc5")
    private WebElement contractStartDate;
    @FindBy(css = "#ctrc40")
    private WebElement contractTermMonths;
    @FindBy(css = "#ctrc13")
    private WebElement ownerExpirationNotice;
    @FindBy(css = "#CompanySignedDate")
    private WebElement companySignedDate;
    @FindBy(css = "#ctrc25street")
    private WebElement billingStreet;
    @FindBy(css = "#ctrc25city")
    private WebElement billingCity;
    @FindBy(css = "#ctrc25state")
    private WebElement billingState;
    @FindBy(css = "#ctrc25zip")
    private WebElement billingPostalCode;
    @FindBy(css = "#ctrc25country")
    private WebElement billingCountry;
    @FindBy(css = "#SpecialTerms")
    private WebElement specialTerms;
    @FindBy(css = "#Description")
    private WebElement description;
    @FindBy(css = "td[id='bottomButtonRow'] input[title='Save']")
    private WebElement save;
    @FindBy(css = "td[id='bottomButtonRow'] input[title='Save & New']")
    private WebElement saveAndNew;
    @FindBy(css = "td[id='bottomButtonRow'] input[title='Cancel']")
    private WebElement cancel;

    /**
     * Initializes the elements and wait for page to be loaded.
     *
     * @param newWebDriverManager to be managed.
     */
    public ClassicNewContractPage(final WebDriverManager newWebDriverManager) {
        super(newWebDriverManager);
    }

    /**
     * Waits for the page to be loaded.
     */
    @Override
    protected void waitForPageLoaded() {
        webElementAction.waitForVisible(accountName);
    }

    /**
     * Sets the account name on a contract.
     *
     * @param newAccountName
     */
    public void setAccountName(final String newAccountName) {
        webElementAction.setInputField(accountName, newAccountName);
    }

    /**
     * Sets the CustomerSignedBy element.
     *
     * @param newCustomerSignedBy to be typed.
     */
    public void setCustomerSignedBy(final String newCustomerSignedBy) {
        webElementAction.setInputField(customerSignedBy, newCustomerSignedBy);
    }

    /**
     * Sets the CustomerSignedTittle element.
     *
     * @param newCustomerSignedTittle to be typed.
     */
    public void setCustomerSignedTittle(final String newCustomerSignedTittle) {
        webElementAction.setInputField(customerSignedTittle, newCustomerSignedTittle);
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
        webElementAction.clickElement(priceBook);
        webElementAction.clickElementByLocator(By.xpath("//option[. = '" + newPriceBook + "']"));
    }

    /**
     * Sets the contractStartDate element.
     *
     * @param newContractStartDate to be typed.
     */
    public void setContractStartDate(final String newContractStartDate) {
        webElementAction.setInputField(contractStartDate, newContractStartDate);
    }

    /**
     * Sets the contractTermMonths element.
     *
     * @param newContractTermMonths to be typed.
     */
    public void setContractTermMonths(final String newContractTermMonths) {
        webElementAction.setInputField(contractTermMonths, newContractTermMonths);
    }

    /**
     * Sets the ownerExpirationNotice element.
     *
     * @param newOwnerExpirationNotice to be typed.
     */
    public void setOwnerExpirationNotice(final String newOwnerExpirationNotice) {
        webElementAction.clickElement(ownerExpirationNotice);
        webElementAction.clickElementByLocator(By.xpath("//option[. = '" + newOwnerExpirationNotice + "']"));
    }

    /**
     * Sets the companySignedDate element.
     *
     * @param newCompanySignedDate to be typed.
     */
    public void setCompanySignedDate(final String newCompanySignedDate) {
        webElementAction.setInputField(companySignedDate, newCompanySignedDate);
    }

    /**
     * Sets the billingStreet element.
     *
     * @param newBillingStreet to be typed.
     */
    public void setBillingStreet(final String newBillingStreet) {
        webElementAction.setInputField(billingStreet, newBillingStreet);
    }

    /**
     * Sets the billingCity element.
     *
     * @param newBillingCity to be typed.
     */
    public void setBillingCity(final String newBillingCity) {
        webElementAction.setInputField(billingCity, newBillingCity);
    }

    /**
     * Sets the billingState element.
     *
     * @param newBillingState to be typed.
     */
    public void setBillingState(final String newBillingState) {
        webElementAction.setInputField(billingState, newBillingState);
    }

    /**
     * Sets the billingPostalCode element.
     *
     * @param newBillingPostalCode to be typed.
     */
    public void setBillingPostalCode(final String newBillingPostalCode) {
        webElementAction.setInputField(billingPostalCode, newBillingPostalCode);
    }

    /**
     * Sets the billingCountry element.
     *
     * @param newBillingCountry to be typed.
     */
    public void setBillingCountry(final String newBillingCountry) {
        webElementAction.setInputField(billingCountry, newBillingCountry);
    }

    /**
     * Sets the specialTerms element.
     *
     * @param newSpecialTerms to be typed.
     */
    public void setSpecialTerms(final String newSpecialTerms) {
        webElementAction.setInputField(specialTerms, newSpecialTerms);
    }

    /**
     * Sets the description element.
     *
     * @param newDescription to be typed.
     */
    public void setDescription(final String newDescription) {
        webElementAction.setInputField(description, newDescription);
    }

    /**
     * Clicks on the save button.
     *
     * @return a CreatedContractPage.
     */
    public ClassicCreatedContractPage clickSave() {
        webElementAction.clickElement(save);
        return new ClassicCreatedContractPage(webDriverManager);
    }

    /**
     * Clicks on the save and new button and goes to a new contract to be created.
     *
     * @return a NewContractPage.
     */
    public ClassicNewContractPage clickSaveAndNew() {
        webElementAction.clickElement(saveAndNew);
        return new ClassicNewContractPage(webDriverManager);
    }

    /**
     * Clicks on the cancel button.
     *
     * @return a ContractsPage.
     */
    public ClassicContractsPage clickCancel() {
        webElementAction.clickElement(cancel);
        return new ClassicContractsPage(webDriverManager);
    }

}
