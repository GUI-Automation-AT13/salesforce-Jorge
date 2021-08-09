package selenium.salesforce.org.steps;

import core.selenium.WebDriverManager;
import io.cucumber.java.en.And;
import org.testng.asserts.SoftAssert;
import salesforce.ui.utils.PageTransporter;

public class NavigateToPageStep {
    public WebDriverManager webDriverManager;
    public PageTransporter pageTransporter;
    public SoftAssert softAssert;

    public NavigateToPageStep(final WebDriverManager newWebDriverManager, final SoftAssert newSoftAssert) {
        this.webDriverManager = newWebDriverManager;
        this.pageTransporter = new PageTransporter(webDriverManager);
        this.softAssert = newSoftAssert;
    }

    @And("I navigate to the {string} page")
    public void iNavigateToThePage(final String featureName) {
        pageTransporter.navigateToFeaturePage(featureName);
    }
}
