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

public class Politics extends BaseClass {
    WebDriver driver;


    public Politics(WebDriver driver) {
        this.driver = driver;
    }

    By politicsModule = By.xpath("//span[text()=' POLITICS']");
    By politicsModuleButton = By.xpath("//h1[text()='Politics']");

    By the2010CIAWorldFactbook=By.xpath("//div[@class='computer only column']//div//a//h5[text()='The 2010 CIA World Factbook']");
    By the2000CIAWorldFactbook=By.xpath("//div[@class='computer only column']/div/a/h5[text()='The 2000 CIA World Factbook']");
    By the2001CIAWorldFactbook=By.xpath("//div[@class='computer only column']/div/a/h5[text()='The 2001 CIA World Factbook']");

    By thtAmericanOccupationOfThePhilippines18981912=By.xpath("//div[@class='computer only column']/div/a/h5[text()='The American Occupation of the Philippines 1898-1912']");

    By theCrimeOfTheCongo=By.xpath(" //div[@class='computer only column']//div//a//h5[text()='The Crime of the Congo']");

    //div[@class='computer only column']//div//a//h5[text()='The Crime of the Congo']





    public void clickOnPoliticsModule() {
        PageActions actions = new PageActions();
        String politicsModuleExpectedTab = driver.findElement(politicsModule).getText();
        String politicsModuleActualTab = "POLITICS";
        System.out.println(politicsModuleActualTab);
        System.out.println(politicsModuleExpectedTab);
        Assert.assertEquals(politicsModuleExpectedTab, politicsModuleActualTab);
        actions.clickOnElement(driver, politicsModule);
    }

    public void verifyTitle() {

        String politicsModuleActualTitle = driver.findElement(politicsModuleButton).getText();
        String politicsModuleExpectedTitle = "Politics";
        Assert.assertEquals(politicsModuleExpectedTitle, politicsModuleActualTitle);

    }
    public void verifyBookTitle() {


        String the2010CIAWorldFactbookActualTitle = driver.findElement(the2010CIAWorldFactbook).getText();
        String the2010CIAWorldFactbookExpectedTitle = "The 2010 CIA World Factbook";
        Assert.assertEquals(the2010CIAWorldFactbookExpectedTitle,the2010CIAWorldFactbookActualTitle);
        System.out.println(the2010CIAWorldFactbookActualTitle);

        String the2000CIAWorldFactbookActualTitle = driver.findElement(the2000CIAWorldFactbook).getText();
        String the2000CIAWorldFactbookExpectedTitle = "The 2000 CIA World Factbook";
        Assert.assertEquals(the2000CIAWorldFactbookExpectedTitle,the2000CIAWorldFactbookActualTitle);

        String the2001CIAWorldFactbookActualTitle = driver.findElement(the2001CIAWorldFactbook).getText();
        String the2001CIAWorldFactbookExpectedTitle = "The 2001 CIA World Factbook";
        Assert.assertEquals(the2001CIAWorldFactbookExpectedTitle,the2001CIAWorldFactbookActualTitle);


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String thtAmericanOccupationOfThePhilippines18981912ActualTitle = driver.findElement(thtAmericanOccupationOfThePhilippines18981912).getText();
        String thtAmericanOccupationOfThePhilippines18981912ExpectedTitle = "The American Occupation of the Philippines 1898-1912";
        Assert.assertEquals(thtAmericanOccupationOfThePhilippines18981912ExpectedTitle,thtAmericanOccupationOfThePhilippines18981912ActualTitle);
        System.out.println(the2001CIAWorldFactbookExpectedTitle);



        String theCrimeOfTheCongo2ActualTitle = driver.findElement(theCrimeOfTheCongo).getText();
        String theCrimeOfTheCongoExpectedTitle = "The Crime of the Congo";
        Assert.assertEquals(theCrimeOfTheCongoExpectedTitle,theCrimeOfTheCongo2ActualTitle);
        System.out.println(the2001CIAWorldFactbookExpectedTitle);

    }




}
