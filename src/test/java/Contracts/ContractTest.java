package Contracts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import salesforce.config.EnvConfig;
import salesforce.ui.pages.LoginPage;
import salesforce.ui.pages.lightning.HomePage;
import salesforce.ui.pages.lightning.contracts.ContractsPage;
import salesforce.ui.pages.lightning.contracts.CreatedContractPage;
import salesforce.ui.pages.lightning.contracts.NewContractPage;

public class ContractTest extends BaseTests {
    private HomePage homePage;
    private ContractsPage contractsPage;
    private NewContractPage newContractPage;
    private CreatedContractPage createdContractPage;

    @Test
    public void createAContract(){
        LoginPage loginPage = new LoginPage();
        homePage = loginPage.loginSuccessful(EnvConfig.getInstance().getUser(),
                EnvConfig.getInstance().getPassword());

        contractsPage = pageTransporter.navigateToContractsPageLightning();
        newContractPage = contractsPage.clickNewContractButton();
        newContractPage.setAccountName("TestAccount");
        newContractPage.clickAccountSelector();
        newContractPage.setContractTermMonths("2");
        newContractPage.setContractStartDate("7/15/2021");
        newContractPage.setCustomerSignedBy("TestContact");
        newContractPage.clickContactSelector();
        newContractPage.setCustomerSignedTittle("tittle");
        newContractPage.setCustomerSignedDate("7/15/2021");
        newContractPage.setPriceBook("Standard");
        newContractPage.selectPriceBook();
        newContractPage.clickOwnerExpirationNotice();
        newContractPage.selectOwnerExpirationNotice();
        newContractPage.setCompanySignedDate("7/19/2021");
        newContractPage.setBillingStreet("Billing Street");
        newContractPage.setBillingCity("Billing City");
        newContractPage.setBillingStreet("Billing Street");
        newContractPage.setBillingState("Billing state");
        newContractPage.setBillingPostalCode("Billing postal code");
        newContractPage.setBillingCountry("Billing country");
        newContractPage.setSpecialTerms("SpecialTerms");
        newContractPage.setDescription("Description");
        createdContractPage = newContractPage.clickSave();
        Assert.assertEquals(createdContractPage.getAccountName(), "TestAccount");
    }
}
