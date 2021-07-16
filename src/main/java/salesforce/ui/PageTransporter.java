package salesforce.ui;

import core.selenium.WebDriverManager;
import salesforce.config.EnvConfig;
import salesforce.ui.pages.contracts.ContractsPage;

public class PageTransporter {

    private String baseUrl = EnvConfig.getInstance().getBaseUrl();

    public void goToURL(final String url) {
        WebDriverManager.getInstance().getWebDriver().navigate().to(url);
    }

    /**
     * navigates to Contracts page.
     *
     * @return Contracts' instance.
     */
    public ContractsPage navigateToContractsPage() {
        goToURL(baseUrl.concat("800/o"));
        return new  ContractsPage();
    }
}
