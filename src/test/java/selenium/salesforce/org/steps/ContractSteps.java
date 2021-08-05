package selenium.salesforce.org.steps;

import core.selenium.WebDriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import salesforce.ui.pages.lightning.contracts.ContractsPage;
import salesforce.ui.pages.lightning.contracts.CreatedContractPage;
import salesforce.ui.pages.lightning.contracts.NewContractPage;
import salesforce.ui.utils.PageTransporter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContractSteps {

    private WebDriverManager webDriverManager;
    public PageTransporter pageTransporter;
    public SoftAssert softAssert;
    private Map<String, String> dataTable;
    ContractsPage contractsPage;
    NewContractPage newContractPage;
    CreatedContractPage createdContractPage;

    public ContractSteps(final WebDriverManager newWebDriverManager) {
        this.webDriverManager = newWebDriverManager;
        this.pageTransporter = new PageTransporter(webDriverManager);
        this.softAssert = new SoftAssert();
    }

    @When("I create a new contract with required fields")
    public void iCreateANewContractWithRequiredFields(final Map<String, String> table) {
        dataTable = table;
        contractsPage = pageTransporter.navigateToContractsPageLightning();
        newContractPage = contractsPage.clickNewContractButton();
        newContractPage.fillUpField(dataTable);
        createdContractPage = newContractPage.clickSave();
    }

    @Then("I verify the Contract created with the set fields")
    public void iVerifyTheContractCreatedWithTheSetFields() {
        List<String> valuesField = createdContractPage.getValueField(dataTable);
        Assert.assertEquals(valuesField, new ArrayList<String>(dataTable.values()));
    }
}
