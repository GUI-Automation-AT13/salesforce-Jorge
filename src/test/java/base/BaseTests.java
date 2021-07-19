package base;

import core.selenium.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import salesforce.config.EnvConfig;
import salesforce.ui.PageTransporter;

public class BaseTests {
    public PageTransporter pageTransporter = new PageTransporter();

    @BeforeClass
    public void setup() {
        WebDriverManager.getInstance().getWebDriver().get(EnvConfig.getInstance().getLoginUrl());
    }
    @AfterClass
    public void tearDown(){
        WebDriverManager.getInstance().getWebDriver().quit();
    }
}
