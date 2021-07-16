package salesforce.ui.pages.contracts;

import core.selenium.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;

public class ContractsPage extends BasePage {

    @FindBy(css = "input[title='New']")
    private WebElement newContractButton;

    @FindBy(id = "tryLexDialogX")
    private WebElement popup;

    @Override
    protected void waitForPageLoaded() {
        WebDriverManager.getInstance().getWait().until(ExpectedConditions.elementToBeClickable(newContractButton));
    }
    public void clickPopUP(){
        WebDriverManager.getInstance().getWait().until(ExpectedConditions.elementToBeClickable(By.id("tryLexDialogX")));
        popup.click();
    }

    public NewContractPage clickNew(){
        newContractButton.click();
        return new NewContractPage();
    }

}
