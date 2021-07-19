package salesforce.ui.pages.contracts;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;

public class NewContractPage extends BasePage {
    @FindBy(css = "#ctrc7")
    private WebElement accountName;
    @FindBy(css = "#ctrc16")
    private WebElement customerSignedBy;
    @FindBy(css = "#CustomerSignedTitle")
    private WebElement customerSignedTittle;
    @FindBy(css = "#ctrc6']")
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
     * Waits for the page to be loaded.
     */
    @Override
    protected void waitForPageLoaded() {
        WebDriverManager.getInstance().getWait().until(ExpectedConditions.elementToBeClickable(accountName));
    }

    /**
     * Sets the account name on a contract.
     *
     * @param newAccountName
     */
    public void setAccountName(final String newAccountName) {
        this.accountName.sendKeys(newAccountName);
    }
    /**
     * Sets the CustomerSignedBy element.
     *
     * @param newCustomerSignedBy to be typed.
     */
    public void setCustomerSignedBy(final WebElement newCustomerSignedBy) {
        this.customerSignedBy = newCustomerSignedBy;
    }
    /**
     * Sets the CustomerSignedTittle element.
     *
     * @param newCustomerSignedTittle to be typed.
     */
    public void setCustomerSignedTittle(final WebElement newCustomerSignedTittle) {
        this.customerSignedTittle = newCustomerSignedTittle;
    }
    /**
     * Sets the customerSignedDate element.
     *
     * @param newCustomerSignedDate to be typed.
     */
    public void setCustomerSignedDate(final WebElement newCustomerSignedDate) {
        this.customerSignedDate = newCustomerSignedDate;
    }
    /**
     * Sets the priceBook element.
     *
     * @param newPriceBook to be typed.
     */
    public void setPriceBook(final WebElement newPriceBook) {
        this.priceBook = newPriceBook;
    }
    /**
     * Sets the contractStartDate element.
     *
     * @param newContractStartDate to be typed.
     */
    public void setContractStartDate(final String newContractStartDate) {
        this.contractStartDate.sendKeys(newContractStartDate);
    }
    /**
     * Sets the contractTermMonths element.
     *
     * @param newContractTermMonths to be typed.
     */
    public void setContractTermMonths(final String newContractTermMonths) {
        this.contractTermMonths.sendKeys(newContractTermMonths);
    }
    /**
     * Sets the ownerExpirationNotice element.
     *
     * @param newOwnerExpirationNotice to be typed.
     */
    public void setOwnerExpirationNotice(final WebElement newOwnerExpirationNotice) {
        this.ownerExpirationNotice = newOwnerExpirationNotice;
    }
    /**
     * Sets the companySignedDate element.
     *
     * @param newCompanySignedDate to be typed.
     */
    public void setCompanySignedDate(final WebElement newCompanySignedDate) {
        this.companySignedDate = newCompanySignedDate;
    }
    /**
     * Sets the billingStreet element.
     *
     * @param newBillingStreet to be typed.
     */
    public void setBillingStreet(final WebElement newBillingStreet) {
        this.billingStreet = newBillingStreet;
    }
    /**
     * Sets the billingCity element.
     *
     * @param newBillingCity to be typed.
     */
    public void setBillingCity(final WebElement newBillingCity) {
        this.billingCity = newBillingCity;
    }
    /**
     * Sets the billingState element.
     *
     * @param newBillingState to be typed.
     */
    public void setBillingState(final WebElement newBillingState) {
        this.billingState = newBillingState;
    }
    /**
     * Sets the billingPostalCode element.
     *
     * @param newBillingPostalCode to be typed.
     */
    public void setBillingPostalCode(final WebElement newBillingPostalCode) {
        this.billingPostalCode = newBillingPostalCode;
    }
    /**
     * Sets the billingCountry element.
     *
     * @param newBillingCountry to be typed.
     */
    public void setBillingCountry(final WebElement newBillingCountry) {
        this.billingCountry = newBillingCountry;
    }
    /**
     * Sets the specialTerms element.
     *
     * @param newSpecialTerms to be typed.
     */
    public void setSpecialTerms(final WebElement newSpecialTerms) {
        this.specialTerms = newSpecialTerms;
    }
    /**
     * Sets the description element.
     *
     * @param newDescription to be typed.
     */
    public void setDescription(final WebElement newDescription) {
        this.description = newDescription;
    }
    /**
     * Clicks on the save button.
     *
     * @return a CreatedContractPage.
     */
    public CreatedContractPage clickSave() {
        this.save.click();
        return new CreatedContractPage();
    }
    /**
     * Clicks on the save and new button and goes to a new contract to be created.
     *
     * @return a NewContractPage.
     */
    public NewContractPage clickSaveAndNew() {
        this.saveAndNew.click();
        return new NewContractPage();
    }
    /**
     * Clicks on the cancel button.
     *
     * @return a ContractsPage.
     */
    public ContractsPage clickCancel() {
        this.cancel.click();
        return new ContractsPage();
    }

}
