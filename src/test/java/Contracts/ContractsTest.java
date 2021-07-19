package Contracts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import salesforce.config.EnvConfig;
import salesforce.ui.pages.classic.HomePage;
import salesforce.ui.pages.LoginPage;
import salesforce.ui.pages.classic.contracts.ContractsPage;
import salesforce.ui.pages.classic.contracts.CreatedContractPage;
import salesforce.ui.pages.classic.contracts.NewContractPage;

public class ContractsTest extends BaseTests {

    private HomePage homePage;
    private ContractsPage contractsPage;
    private NewContractPage newContractPage;
    private CreatedContractPage createdContractPage;

    @Test
    public void createContractWithRequiredValuesTest()  {
        LoginPage loginPage = new LoginPage();
        String accountName = "TestAccount";
        homePage = loginPage.loginSuccessful(EnvConfig.getInstance().getUser(),
                EnvConfig.getInstance().getPassword());
        contractsPage = pageTransporter.navigateToContractsPage();
        contractsPage.clickPopUP();
        newContractPage = contractsPage.clickNew();
        newContractPage.setAccountName(accountName);
        newContractPage.setContractTermMonths("2");
        newContractPage.setContractStartDate("7/15/2021");
        createdContractPage = newContractPage.clickSave();
        Assert.assertEquals(createdContractPage.getAccountName(), "TestAccount");
    }
    @Test
    public void createContractWithAllValuesTest()  {
        LoginPage loginPage = new LoginPage();
        String accountName = "TestAccount";
        homePage = loginPage.loginSuccessful(EnvConfig.getInstance().getUser(),
                EnvConfig.getInstance().getPassword());
        contractsPage = pageTransporter.navigateToContractsPage();
        contractsPage.clickPopUP();
        newContractPage = contractsPage.clickNew();
        newContractPage.setAccountName(accountName);
        newContractPage.setContractTermMonths("2");
        newContractPage.setContractStartDate("7/15/2021");
        newContractPage.setCustomerSignedBy("TestContact");
        newContractPage.setCustomerSignedTittle("tittle");
        newContractPage.setCustomerSignedDate("7/15/2021");
        newContractPage.setPriceBook("Standard");
        newContractPage.setOwnerExpirationNotice("90 Days");
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
