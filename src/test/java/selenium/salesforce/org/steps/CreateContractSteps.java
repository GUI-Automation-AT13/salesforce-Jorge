package selenium.salesforce.org.steps;

import core.selenium.WebDriverManager;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import salesforce.ui.pages.lightning.contracts.ContractsPage;
import salesforce.ui.pages.lightning.contracts.NewContractPage;
import salesforce.ui.utils.PageTransporter;
import java.util.Map;

public class CreateContractSteps {

    private WebDriverManager webDriverManager;
    public PageTransporter pageTransporter;
    public SoftAssert softAssert;
    ContractsPage contractsPage;
    NewContractPage newContractPage;

    public CreateContractSteps(final WebDriverManager newWebDriverManager) {
        this.webDriverManager = newWebDriverManager;
        this.pageTransporter = new PageTransporter(webDriverManager);
        this.softAssert = new SoftAssert();
    }

    @When("I create a new contract with required fields")
    public void iCreateANewContractWithRequiredFields(final Map<String, String> table) {
        contractsPage = new ContractsPage(webDriverManager);
        newContractPage = contractsPage.clickNewContractButton();
        newContractPage.fillUpField(table);
        newContractPage.clickSave();
    }

}
