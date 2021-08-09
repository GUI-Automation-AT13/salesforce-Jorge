package selenium.salesforce.org.steps;

import core.selenium.WebDriverManager;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import salesforce.ui.pages.lightning.contracts.CreatedContractPage;

public class VerifyMessageStep {
    private WebDriverManager webDriverManager;
    private CreatedContractPage createdContractPage;
    private SoftAssert softAssert;

    public VerifyMessageStep(final WebDriverManager newWebDriverManager, final SoftAssert newSoftAssert) {
        this.webDriverManager = newWebDriverManager;
        this.softAssert = newSoftAssert;
    }

    @Then("I verify the success message")
    public void iVerifyTheSuccessMessage() {
        createdContractPage = new CreatedContractPage(webDriverManager);
        softAssert.assertEquals(createdContractPage.getSuccessContractNumber(), createdContractPage.getContractNumber());
    }
}
