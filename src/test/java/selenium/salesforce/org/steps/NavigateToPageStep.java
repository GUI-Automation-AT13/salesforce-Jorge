package selenium.salesforce.org.steps;

import core.selenium.WebDriverManager;
import io.cucumber.java.en.And;
import salesforce.ui.utils.PageTransporter;

public class NavigateToPageStep {
    public WebDriverManager webDriverManager;
    public PageTransporter pageTransporter;

    public NavigateToPageStep(final WebDriverManager newWebDriverManager) {
        this.webDriverManager = newWebDriverManager;
        this.pageTransporter = new PageTransporter(webDriverManager);
    }

    @And("I navigate to the {string} page")
    public void iNavigateToThePage(final String featureName) {
        pageTransporter.navigateToFeaturePage(featureName);
    }
}
