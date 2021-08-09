package selenium.salesforce.org.steps;

import core.selenium.WebDriverManager;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import salesforce.ui.pages.lightning.contracts.CreatedContractPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VerifyContractValuesSteps {
    private WebDriverManager webDriverManager;
    private CreatedContractPage createdContractPage;
    private Map<String,String> dataMap;
    public SoftAssert softAssert;

    public VerifyContractValuesSteps(final WebDriverManager newWebDriverManager) {
        this.webDriverManager = newWebDriverManager;
        this.softAssert = new SoftAssert();
    }

    @Then("I verify the Contract created with the set fields")
    public void iVerifyTheContractCreatedWithTheSetFields(final Map<String, String> table) {
        createdContractPage = new CreatedContractPage(webDriverManager);
        dataMap = table;
        softAssert.assertEquals(createdContractPage.getSuccessContractNumber(), createdContractPage.getContractNumber());
        List<String> valuesField = createdContractPage.getValueField(dataMap);
        softAssert.assertEquals(valuesField, new ArrayList<>(dataMap.values()));
        softAssert.assertAll();
    }
}
