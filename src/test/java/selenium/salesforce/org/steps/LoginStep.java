package selenium.salesforce.org.steps;

import io.cucumber.java.en.Given;
import org.testng.asserts.SoftAssert;
import salesforce.config.EnvConfig;
import salesforce.ui.pages.LoginPage;
import salesforce.ui.utils.PageTransporter;

public class LoginStep {
    public PageTransporter pageTransporter;
    public SoftAssert softAssert;

    public LoginStep(PageTransporter pageTransporter, SoftAssert softAssert) {
        this.pageTransporter = pageTransporter;
        this.softAssert = softAssert;
    }

    @Given("I login to SalesForce.")
    public void iLoginToSalesForce() {
        LoginPage loginPage = pageTransporter.navigateToLoginPage();
        loginPage.loginSuccessful(EnvConfig.getInstance().getUser(),
                EnvConfig.getInstance().getPassword());
    }
}
