package selenium.salesforce.org.steps;

import io.cucumber.java.en.And;
import org.testng.asserts.SoftAssert;
import salesforce.ui.utils.PageTransporter;

public class NavigateToPageStep {
    public PageTransporter pageTransporter;
    public SoftAssert softAssert;

    public NavigateToPageStep(PageTransporter pageTransporter, SoftAssert softAssert) {
        this.pageTransporter = pageTransporter;
        this.softAssert = softAssert;
    }

    @And("I navigate to the {string} page")
    public void iNavigateToThePage(final String featureName) {
        pageTransporter.navigateToFeaturePage(featureName);
    }
}
