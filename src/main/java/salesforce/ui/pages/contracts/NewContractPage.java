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
    private WebElement CompanySignedDate;
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

    @Override
    protected void waitForPageLoaded() {
        WebDriverManager.getInstance().getWait().until(ExpectedConditions.elementToBeClickable(accountName));
    }

    public void setAccountName(String accountName) {
        this.accountName.sendKeys(accountName);
    }

    public void setCustomerSignedBy(WebElement customerSignedBy) {
        this.customerSignedBy = customerSignedBy;
    }

    public void setCustomerSignedTittle(WebElement customerSignedTittle) {
        this.customerSignedTittle = customerSignedTittle;
    }

    public void setCustomerSignedDate(WebElement customerSignedDate) {
        this.customerSignedDate = customerSignedDate;
    }

    public void setPriceBook(WebElement priceBook) {
        this.priceBook = priceBook;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate.sendKeys(contractStartDate);
    }

    public void setContractTermMonths(String contractTermMonths) {
        this.contractTermMonths.sendKeys(contractTermMonths);
    }

    public void setOwnerExpirationNotice(WebElement ownerExpirationNotice) {
        this.ownerExpirationNotice = ownerExpirationNotice;
    }

    public void setCompanySignedDate(WebElement companySignedDate) {
        CompanySignedDate = companySignedDate;
    }

    public void setBillingStreet(WebElement billingStreet) {
        this.billingStreet = billingStreet;
    }

    public void setBillingCity(WebElement billingCity) {
        this.billingCity = billingCity;
    }

    public void setBillingState(WebElement billingState) {
        this.billingState = billingState;
    }

    public void setBillingPostalCode(WebElement billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    public void setBillingCountry(WebElement billingCountry) {
        this.billingCountry = billingCountry;
    }

    public void setSpecialTerms(WebElement specialTerms) {
        this.specialTerms = specialTerms;
    }

    public void setDescription(WebElement description) {
        this.description = description;
    }

    public CreatedContractPage clickSave() {
        this.save.click();
        return new CreatedContractPage();
    }

    public void clickSaveAndNew(WebElement saveAndNew) {
        this.saveAndNew = saveAndNew;
    }

    public void clickCancel(WebElement cancel) {
        this.cancel = cancel;
    }

}
