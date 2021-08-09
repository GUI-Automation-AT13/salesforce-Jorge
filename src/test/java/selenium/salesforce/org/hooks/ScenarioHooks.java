package selenium.salesforce.org.hooks;

import core.selenium.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.asserts.SoftAssert;
import salesforce.ui.utils.PageTransporter;


public class ScenarioHooks {
    private WebDriverManager webDriverManager;
    private SoftAssert softAssert;
    public PageTransporter pageTransporter;

    public ScenarioHooks(final WebDriverManager newWebDriverManager, final SoftAssert newSoftAssert) {
        this.webDriverManager = newWebDriverManager;
        this.pageTransporter = new PageTransporter(webDriverManager);
        this.softAssert = newSoftAssert;

    }
    @Before
    public void setUp() {
        webDriverManager.getWebDriver();
    }
    @After
    public void tearDown() {
        webDriverManager.quitWebDriver();
        softAssert.assertAll();
    }
}

