/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */
package salesforce.ui.utils;

import core.selenium.WebDriverManager;
import salesforce.config.EnvConfig;
import salesforce.ui.pages.LoginPage;
import salesforce.ui.pages.classic.contracts.ClassicContractsPage;
import salesforce.ui.pages.lightning.contracts.ContractsPage;

public class PageTransporter {

    private String baseUrl = EnvConfig.getInstance().getBaseUrl();
    private String featureUrl = "lightning/o/%s/list?filterName=Recent";

    /**
     * Goes directly to a page by an url.
     *
     * @param url to go.
     */
    public void goToURL(final String url) {
        WebDriverManager.getInstance().getWebDriver().navigate().to(url);
        WebDriverManager.getInstance().getWebDriver().manage().window().maximize();
    }

    /**
     * Navigates to Contracts page.
     *
     * @return Contracts' instance.
     */
    public ClassicContractsPage navigateToContractsPage() {
        goToURL(baseUrl.concat("800/o"));
        return new ClassicContractsPage();
    }

    /**
     * Navigates to Contracts page on lightning version.
     *
     * @return Contracts' instance.
     */
    public ContractsPage navigateToContractsPageLightning() {
        goToURL(baseUrl.concat("lightning/o/Contract/list?filterName=Recent"));
        return new ContractsPage();
    }

    /**
     * Navigates to feature page on lightning version.
     *
     * @param featureName .
     */
    public void navigateToFeaturePage(final String featureName) {
        goToURL(baseUrl.concat(String.format(featureUrl, featureName)));
    }

    /**
     * Navigates to login page.
     *
     * @return the login page.
     */
    public LoginPage navigateToLoginPage() {
        goToURL(baseUrl);
        return new LoginPage();
    }
}
