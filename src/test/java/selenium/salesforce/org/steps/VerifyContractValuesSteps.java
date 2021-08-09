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
    public SoftAssert softAssert;

    public VerifyContractValuesSteps(final WebDriverManager newWebDriverManager) {
        this.webDriverManager = newWebDriverManager;
        this.softAssert = new SoftAssert();
    }

    @Then("I verify the Contract created with the set fields")
    public void iVerifyTheContractCreatedWithTheSetFields(final Map<String, String> table) {
        createdContractPage = new CreatedContractPage(webDriverManager);
        List<String> valuesField = createdContractPage.getValueField(table);
        softAssert.assertEquals(valuesField, new ArrayList<>(table.values()));
        softAssert.assertAll();
    }
}
