package base;

import drivermanager.DriverFactory;
import drivermanager.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import salesforce.ui.pages.LoginPage;

import static core.EnvironmentValues.obtainEnvVariables;

public class BaseTests {
    private WebDriver driver;
    protected LoginPage loginPage;

    @BeforeClass
    public void setUP(){
        driver = DriverFactory.getDriver(DriverType.CHROME);
        driver.get(obtainEnvVariables("LOGIN_URL"));
        loginPage = new LoginPage(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
