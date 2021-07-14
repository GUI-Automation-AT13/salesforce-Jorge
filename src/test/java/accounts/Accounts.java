package accounts;

import base.BaseTests;
import org.testng.annotations.Test;
import salesforce.ui.pages.HomePage;

import static core.EnvironmentValues.obtainEnvVariables;

public class Accounts extends BaseTests {

    @Test
    public void createAccount() {
    HomePage homePage = loginPage.loginSuccessful(obtainEnvVariables("USER"), obtainEnvVariables("PASSWORD"));
    }
}

