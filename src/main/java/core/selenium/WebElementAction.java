/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */
package core.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This class the common web element actions.
 */
public class WebElementAction {
    private WebDriverManager webDriverManager;

    /**
     * Initializes the elements and wait for page to be loaded.
     *
     * @param newWebDriverManager to be managed.
     */
    public WebElementAction(final WebDriverManager newWebDriverManager) {
        this.webDriverManager = newWebDriverManager;
    }

    /**
     * Waits until a text box is visible and writes a text.
     *
     * @param webElement the web element to be waited.
     */
    public void waitForVisible(final WebElement webElement) {
        webDriverManager.getWait().until(ExpectedConditions.visibilityOf(webElement));
    }

    /**
     * Sets a webElement with a value.
     *
     * @param webElement that will be set.
     * @param typeText   value that will set.
     */
    public void setInputField(final WebElement webElement, final String typeText) {
        waitForVisible(webElement);
        webElement.clear();
        webElement.sendKeys(typeText);
    }

    /**
     * Clicks a webElement.
     *
     * @param webElement is what we want to click.
     */
    public void clickElement(final WebElement webElement) {
        waitForVisible(webElement);
        webElement.click();
    }
    /**
     * Clicks a webElement.
     *
     * @param newLocator is what we want to click.
     */
    public void clickElementByLocator(final By newLocator) {
        webDriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(newLocator));
        webDriverManager.getWebDriver().findElement(newLocator);
    }
    /**
     * Clicks a webElement.
     *
     * @param locator is what we want to click.
     */
    public void clickFieldByLinkText(final String locator) {
        webDriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(By.linkText(locator)));
        webDriverManager.getWebDriver().findElement(By.linkText(locator)).click();
    }

    /**
     * Scrolls to the end of the page.
     */
    public void scrollToBottom() {
        JavascriptExecutor jse = (JavascriptExecutor) webDriverManager.getWebDriver();
        jse.executeScript("window.scrollBy(0,250)");
    }

    /**
     * Gets the text of a web element.
     *
     * @param webElement web element to get text.
     * @return web element's text
     */
    public String getTextOfElement(final WebElement webElement) {
        waitForVisible(webElement);
        return webElement.getText();
    }

    /**
     * Gets the text of a web element.
     *
     * @param field web element to get text.
     * @return web element's text
     */
    public String getTextOfElementByField(final String field) {
        return webDriverManager.getWebDriver().findElement(By.xpath(field)).getText();
    }
}
