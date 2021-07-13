package base;

import drivermanager.DriverFactory;
import drivermanager.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import salesforce.ui.pages.LoginPage;

public class BaseTests {
    private WebDriver driver;
    protected LoginPage loginPage;

    @BeforeClass
    public void setUP(){
        driver = DriverFactory.getDriver(DriverType.CHROME);
        loginPage = new LoginPage(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
