package selenium.salesforce.org.hooks;

import core.selenium.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import salesforce.ui.utils.PageTransporter;


public class ScenarioHooks {
    private WebDriverManager webDriverManager;
    public PageTransporter pageTransporter;

    public ScenarioHooks(final WebDriverManager newWebDriverManager) {
        this.webDriverManager = newWebDriverManager;
        this.pageTransporter = new PageTransporter(webDriverManager);

    }
    @Before
    public void setUp() {
        webDriverManager.getWebDriver();
    }
    @After
    public void tearDown() {
        webDriverManager.quitWebDriver();
    }
}

