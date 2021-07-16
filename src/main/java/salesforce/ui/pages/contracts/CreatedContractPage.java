package salesforce.ui.pages.contracts;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;
import salesforce.ui.pages.HomePageObjects;

public class CreatedContractPage extends BasePage {

    @FindBy(css = "div[id*=\"ctrc7_ileinner\"]")
    private WebElement accountName;

    @FindBy(css = ".allTabsArrow")
    private WebElement addObjects;

    @Override
    protected void waitForPageLoaded() {
        WebDriverManager.getInstance().getWait().until(ExpectedConditions.elementToBeClickable(addObjects));
    }

    public HomePageObjects clickAddObjects() {
        addObjects.click();
        return new HomePageObjects();
    }

    public String getAccountName() {
        return accountName.getText();
    }
}
