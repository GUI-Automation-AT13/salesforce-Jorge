package core.selenium;

import core.utils.PropertiesReader;

import java.util.Properties;

public class WebDriverConfig {
    private String browser;
    private int implicitWaitTime;
    private int explicitWaitTime;
    private int waitSleepTime;
    private static WebDriverConfig instance;

    public WebDriverConfig() {
        initialize();
    }
    public static WebDriverConfig getInstance(){
        if (instance == null) {
            instance = new WebDriverConfig();
        }
        return instance;
    }
    public void initialize(){
        Properties properties = PropertiesReader.getProperties("config.properties");
        browser = properties.getProperty("browser");
        implicitWaitTime = Integer.parseInt(properties.getProperty("implicitTime"));
        explicitWaitTime = Integer.parseInt(properties.getProperty("explicitTime"));
        waitSleepTime = Integer.parseInt(properties.getProperty("sleepTime"));
    }

    public String getBrowser() {
        return browser;
    }

    public int getImplicitWaitTime() {
        return implicitWaitTime;
    }

    public int getExplicitWaitTime() {
        return explicitWaitTime;
    }

    public int getWaitSleepTime() {
        return waitSleepTime;
    }

}
