package salesforce.ui.pages.classic;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;
import salesforce.ui.pages.classic.contracts.ClassicContractsPage;

public class ClassicHomePageObjects extends BasePage {

    @FindBy(css = ".listRelatedObject.contractBlock.title")
    private WebElement contractBtn;

    /**
     * Waits for the page to be loaded.
     */
    @Override
    protected void waitForPageLoaded() {
        WebDriverManager.getInstance().getWait().until(ExpectedConditions.elementToBeClickable(contractBtn));
    }
    /**
     * Clicks on the add object button.
     *
     * @return a new ContractsPage
     */
    public ClassicContractsPage clickAddObject() {
        contractBtn.click();
        return new ClassicContractsPage();
    }
}
