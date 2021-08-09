package selenium.salesforce.org.steps;

import core.selenium.WebDriverManager;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import salesforce.ui.pages.lightning.contracts.ContractDetails;
import salesforce.ui.pages.lightning.contracts.CreatedContractPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VerifyContractValuesSteps {
    private WebDriverManager webDriverManager;
    private CreatedContractPage createdContractPage;
    private ContractDetails contractDetails;
    private Map<String,String> dataMap;
    public SoftAssert softAssert;

    public VerifyContractValuesSteps(final WebDriverManager newWebDriverManager, final SoftAssert newSoftAssert) {
        this.webDriverManager = newWebDriverManager;
        this.softAssert = newSoftAssert;
    }

    @Then("I verify the Contract created with the set fields")
    public void iVerifyTheContractCreatedWithTheSetFields(final Map<String, String> table) {
        dataMap = table;
        createdContractPage = new CreatedContractPage(webDriverManager);
        contractDetails = createdContractPage.clickDetails();
        List<String> valuesField = contractDetails.getDetailsList(dataMap);
        softAssert.assertEquals(valuesField, new ArrayList<>(dataMap.values()));
    }
}
