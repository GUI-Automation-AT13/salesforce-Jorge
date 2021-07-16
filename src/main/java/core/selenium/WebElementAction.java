package core.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebElementAction {

    public void waitForVisible(WebElement webElement, String typeText){
        WebDriverManager.getInstance().getWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(typeText);
    }
}
