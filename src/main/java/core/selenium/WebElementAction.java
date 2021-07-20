/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */
package core.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This class the common web element actions.
 */
public class WebElementAction {

    /**
     * Waits until a text box is visible and writes a text.
     *
     * @param webElement the web element to be waited.
     */
    public void waitForVisible(final WebElement webElement) {
        WebDriverManager.getInstance().getWait().until(ExpectedConditions.visibilityOf(webElement));
    }
    /**
     * Sets a webElement with a value.
     *
     * @param webElement that will be set.
     * @param typeText value that will set.
     */
    public void setInputField(final WebElement webElement, final String typeText) {
        WebDriverManager.getInstance().getWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(typeText);
    }

    /**
     * Clicks a webElement.
     *
     * @param webElement is what we want to click.
     */
    public void clickField(final WebElement webElement) {
        WebDriverManager.getInstance().getWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.click();
    }

    /**
     * Gets the text of a web element.
     *
     * @param webElement web element to get text.
     * @return web element's text
     */
    public String getTextOfElement(final WebElement webElement) {
        WebDriverManager.getInstance().getWait().until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }
}
