package salesforce.config;

import core.utils.PropertiesReader;

import java.util.Properties;

public class EnvConfig {
    private static EnvConfig envConfig;

    private String loginUrl;
    private String baseUrl;
    private String user;
    private String password;

    public String getLoginUrl() {
        return loginUrl;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    private EnvConfig(){
        initialize();
    }
    public static EnvConfig getInstance(){
        if(envConfig == null){
            envConfig = new EnvConfig();
        }
        return envConfig;
    }
    private void initialize(){
        Properties properties = PropertiesReader.getProperties("config.properties");
        loginUrl = properties.getProperty("loginURL");
        baseUrl = properties.getProperty("baseURL");
        user = properties.getProperty("user");
        password = properties.getProperty("password");
    }

}