package accounts;

import base.BaseTests;
import salesforce.ui.pages.HomePage;

import static core.EnvironmentValues.obtainEnvVariables;

public class Accounts extends BaseTests {
    HomePage homePage = loginPage.loginSuccessful(obtainEnvVariables("USER"),obtainEnvVariables("PASSWORD"));
}
