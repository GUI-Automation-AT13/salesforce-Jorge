package selenium.salesforce.org.steps;

import core.selenium.WebDriverManager;
import io.cucumber.java.en.Given;
import org.testng.asserts.SoftAssert;
import salesforce.config.EnvConfig;
import salesforce.ui.pages.LoginPage;
import salesforce.ui.utils.PageTransporter;

public class LoginStep {

    public WebDriverManager webDriverManager;
    public PageTransporter pageTransporter;
    public  SoftAssert softAssert;

    public LoginStep(final WebDriverManager newWebDriverManager, final SoftAssert newSoftAssert) {
        this.webDriverManager = newWebDriverManager;
        this.pageTransporter = new PageTransporter(webDriverManager);
        this.softAssert = newSoftAssert;
    }

    @Given("I login to SalesForce.")
    public void iLoginToSalesForce() {
        LoginPage loginPage = pageTransporter.navigateToLoginPage();
        loginPage.loginSuccessful(EnvConfig.getInstance().getUser(),
                EnvConfig.getInstance().getPassword());
    }
}
