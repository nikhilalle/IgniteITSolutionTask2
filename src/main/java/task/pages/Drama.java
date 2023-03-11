package task.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import task.action.PageActions;
import task.base.BaseClass;

public class Drama extends BaseClass {
    WebDriver driver;

    public Drama(WebDriver driver) {
        this.driver = driver;
    }

    By dramaModule = By.xpath("//span[contains(text(),'DRAMA')]");
    By dramaModuleButton = By.xpath("//h1[contains(text(),'Drama')]");

    By contemporaryOneActPlays=By.xpath("//div[@class='computer only column']//div//a//h5[text()='Contemporary One-Act Plays']");

    By poems=By.xpath("//div[@class='computer only column']//div//a//h5[text()='Poems']");

    By theBeauxStratagem=By.xpath("//div[@class='computer only column']//div//a//h5[contains(text() ,'The Beaux-Stratagem')]");
    By theLostPrincessOfOz=By.xpath("//div[@class='computer only column']//div//a//h5[text()='The Lost Princess of Oz']");
    By theWorldsGreatestBooksVolume17PoetryAndDrama=By.xpath("//div[@class='computer only column']//div//a//h5[text()='Night of the Living Dead']");
    public void clickOnDramaModule() {
        PageActions actions = new PageActions();
        String dramaModuleExpectedTab = driver.findElement(dramaModule).getText();
        String dramaModuleActualTab = "DRAMA";
        System.out.println(dramaModuleActualTab);
        System.out.println(dramaModuleExpectedTab);
        Assert.assertEquals(dramaModuleExpectedTab, dramaModuleActualTab);
        actions.clickOnElement(driver, dramaModule);
    }

    @Test
    public void verifyTitle() {
        String dramaModuleActualTitle = driver.findElement(dramaModuleButton).getText();
        String dramaModuleExpectedTitle = "Drama";
        Assert.assertEquals(dramaModuleActualTitle, dramaModuleExpectedTitle);


    }
    public void verifyBookTitle() {

        String contemporaryOneActPlaysActualTitle = driver.findElement(contemporaryOneActPlays).getText();
        String contemporaryOneActPlaysExpectedTitle = "Contemporary One-Act Plays";
        Assert.assertEquals(contemporaryOneActPlaysExpectedTitle,contemporaryOneActPlaysActualTitle);


        String poemsActualTitle = driver.findElement(poems).getText();
        String poemsExpectedTitle = "Poems";
        Assert.assertEquals(poemsExpectedTitle,poemsActualTitle);

        String theLostPrincessOfOzActualTitle = driver.findElement(theLostPrincessOfOz).getText();
        String theLostPrincessOfOzExpectedTitle = "The Lost Princess of Oz";

        Assert.assertEquals(theLostPrincessOfOzExpectedTitle,theLostPrincessOfOzActualTitle);
        System.out.println(theLostPrincessOfOzActualTitle);

        String prideAndPrejudiceAPlayFoundedOnJaneAustenNovelActualTitle = driver.findElement(theBeauxStratagem).getText();
        String prideAndPrejudiceAPlayFoundedOnJaneAustenNovelExpectedTitle = "The Beaux-Stratagem";

        Assert.assertEquals(prideAndPrejudiceAPlayFoundedOnJaneAustenNovelExpectedTitle,prideAndPrejudiceAPlayFoundedOnJaneAustenNovelActualTitle);


        String theWorldsGreatestBooksVolume17PoetryAndDramaActualTitle = driver.findElement( theWorldsGreatestBooksVolume17PoetryAndDrama).getText();
        String theWorldsGreatestBooksVolume17PoetryAndDramaExpectedTitle = "Night of the Living Dead";

        Assert.assertEquals(theWorldsGreatestBooksVolume17PoetryAndDramaExpectedTitle,theWorldsGreatestBooksVolume17PoetryAndDramaActualTitle);
        System.out.println(theWorldsGreatestBooksVolume17PoetryAndDramaActualTitle);





    }

}
