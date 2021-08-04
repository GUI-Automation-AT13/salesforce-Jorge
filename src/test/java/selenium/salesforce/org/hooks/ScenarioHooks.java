package selenium.salesforce.org.hooks;

import core.selenium.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.asserts.SoftAssert;
import salesforce.ui.utils.PageTransporter;


public class ScenarioHooks {
    public PageTransporter pageTransporter;
    public SoftAssert softAssert;

    public ScenarioHooks(PageTransporter pageTransporter, SoftAssert softAssert) {
        this.pageTransporter = pageTransporter;
        this.softAssert = softAssert;
    }
    @Before
    public void setUp() {
        WebDriverManager.getInstance().getWebDriver();
    }
    @After
    public void tearDown() {
        WebDriverManager.getInstance().resetWebDriver();
    }
}

