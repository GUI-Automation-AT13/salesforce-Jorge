package core.selenium;

import core.drivermanager.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebDriverManager {
    private WebDriverConfig webDriverConfig = WebDriverConfig.getInstance();
    private WebDriver webDriver;
    private WebDriverWait wait;

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
    public void quitWebDriver(){
        webDriver.quit();
    }
    public void closeWebDriver(){
        webDriver.close();
    }

    private static WebDriverManager instance = null;

    public WebDriverManager() {
        initialize();
    }

    public static WebDriverManager getInstance() {
        if (instance == null || instance.webDriver == null) {
            instance = new WebDriverManager();
        }
        return instance;
    }

    private void initialize() {
        this.webDriver = DriverFactory.getDriver(webDriverConfig.getBrowser());
        this.webDriver.manage().timeouts()
                .implicitlyWait(webDriverConfig.getImplicitWaitTime(), TimeUnit.SECONDS);
        wait = new WebDriverWait(webDriver, webDriverConfig.getExplicitWaitTime(),
                webDriverConfig.getWaitSleepTime());
    }
}
