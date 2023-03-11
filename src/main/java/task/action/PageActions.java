package task.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PageActions {
    Actions actions;
    Select select;

    public void type(WebDriver driver, By locator, String value){
        driver.findElement(locator).sendKeys(value);
    }
    public void clickOnElement(WebDriver driver, By locator){
        driver.findElement(locator).click();
    }
    public String getElementText(WebDriver driver, By locator){
        return driver.findElement(locator).getText();
    }

    public void clearElement(WebDriver driver, By locator) {
        driver.findElement(locator).clear();
    }

    public void mouseDoubleClickToElement(WebDriver driver, By locator) {
        actions = new Actions(driver);
        actions.doubleClick(driver.findElement(locator)).click().build().perform();

    }
    public void mouseRightClickToElement(WebDriver driver, By locator) {
        actions = new Actions(driver);
        actions.contextClick(driver.findElement(locator)).click().build().perform();

    }
    public void mouseClickToElement(WebDriver driver, By locator) {
        actions = new Actions(driver);
        actions.moveToElement(driver.findElement(locator)).click().build().perform();

    }
    public void mouseDraDropToElement(WebDriver driver, By source,By destination) {
        actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(source),driver.findElement(destination)).build().perform();
    }

    public List<WebElement> getElements(WebDriver driver, By locator) {
        return driver.findElements(locator);
    }

    public void selectByValue(WebDriver driver, By location, String value) {
       select = new Select(driver.findElement(location));
        select.selectByValue(value);
    }
    public void selectByText(WebDriver driver, By location, String value) {
        select = new Select(driver.findElement(location));
        select.selectByVisibleText(value);
    }
    public void selectByIndex(WebDriver driver, By location, int value) {
        select = new Select(driver.findElement(location));
        select.selectByIndex(value);
    }

    public WebElement getElement(WebDriver driver, By locator) {
        return driver.findElement(locator);
    }

}
