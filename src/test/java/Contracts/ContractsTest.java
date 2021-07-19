package Contracts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import salesforce.config.EnvConfig;
import salesforce.ui.PageTransporter;
import salesforce.ui.pages.HomePage;
import salesforce.ui.pages.LoginPage;
import salesforce.ui.pages.contracts.ContractsPage;
import salesforce.ui.pages.contracts.CreatedContractPage;
import salesforce.ui.pages.contracts.NewContractPage;

public class ContractsTest extends BaseTests {

    private HomePage homePage;
    private ContractsPage contractsPage;
    private NewContractPage newContractPage;
    private CreatedContractPage createdContractPage;

    @Test
    public void createContractTest()  {
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

}
