package task.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import task.action.PageActions;
import task.base.BaseClass;

import java.util.concurrent.TimeUnit;

public class Humor extends BaseClass {
    WebDriver driver;

    public Humor(WebDriver driver) {
        this.driver = driver;
    }

    By humorModule = By.xpath("//span[text()=' HUMOR']");
    By humorModuleButton = By.xpath("//span[text()=' HUMOR']");

    By humor=By.xpath("//h1[text()='Humor']");

    By theAdventuresOfTomSawyer=By.xpath("//div[@class='computer only column']//div//a//h5[text()='The Adventures of Tom Sawyer']");
    By adventuresOfHuckleberryFinn=By.xpath("//div[@class='computer only column']//div//a//h5[text()='Adventures of Huckleberry Finn']");
    By aTrampAbroad=By.xpath("//div[@class='computer only column']//div//a//h5[text()='A Tramp Abroad']");

    By theWindInTheWillows=By.xpath("//div[@class='computer only column']//div//a//h5[text()='The Wind in the Willows']");

    By sketchesNewAndOld=By.xpath("//div[@class='computer only column']//div//a//h5[text()='Sketches New and Old']");
    public void clickOnHumorModule() {
        PageActions actions = new PageActions();
        String humorModuleExpectedTab = driver.findElement(humorModule).getText();
        String humorModuleActualTab = "HUMOR";
        System.out.println(humorModuleActualTab);
        System.out.println(humorModuleExpectedTab);
        Assert.assertEquals(humorModuleExpectedTab, humorModuleActualTab);

        actions.clickOnElement(driver, humorModuleButton);
    }

    public void verifyTitle() {

        String humorModuleActualTitle = driver.findElement(humor).getText();
        String humorModuleExpectedTitle = "Humor";
        Assert.assertEquals(humorModuleExpectedTitle, humorModuleActualTitle);

    }

    public void verifyBookTitle() {


        String theAdventuresOfTomSawyerActualTitle = driver.findElement(theAdventuresOfTomSawyer).getText();
        String theAdventuresOfTomSawyerExpectedTitle = "The Adventures of Tom Sawyer";
        Assert.assertEquals(theAdventuresOfTomSawyerExpectedTitle,theAdventuresOfTomSawyerActualTitle);


        String adventuresOfHuckleberryFinnActualTitle = driver.findElement(adventuresOfHuckleberryFinn).getText();
        String adventuresOfHuckleberryFinnExpectedTitle = "Adventures of Huckleberry Finn";
        Assert.assertEquals(adventuresOfHuckleberryFinnExpectedTitle,adventuresOfHuckleberryFinnActualTitle);


        String aTrampAbroadActualTitle = driver.findElement(aTrampAbroad).getText();
        String aTrampAbroadExpectedTitle = "A Tramp Abroad";
        Assert.assertEquals(aTrampAbroadExpectedTitle,aTrampAbroadActualTitle);


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String theWindInTheWillowsActualTitle = driver.findElement(theWindInTheWillows).getText();
        String theWindInTheWillowsExpectedTitle = "The Wind in the Willows'";
        Assert.assertEquals(theWindInTheWillowsExpectedTitle,theWindInTheWillowsActualTitle);




        String sketchesNewAndOldActualTitle = driver.findElement(sketchesNewAndOld).getText();
        String sketchesNewAndOldExpectedTitle = "Sketches New and Old";
        Assert.assertEquals(sketchesNewAndOldExpectedTitle,sketchesNewAndOldActualTitle);

    }

}
