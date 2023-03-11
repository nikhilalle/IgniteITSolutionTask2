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

public class Fiction extends BaseClass {
    WebDriver driver;

    public Fiction(WebDriver driver) {
        this.driver = driver;
    }

    By fictionModule = By.xpath("//span[text()='FICTION']");
    By fictionModuleButton = By.xpath("//h1[text()='FICTION']");


    By dracula=By.xpath("//div[@class='computer only column']//div//a//h5[text()='Dracula']");
    By theCountOfMonteCristoIllustrated=By.xpath("//div[@class='computer only column']//div//a//h5[text()='The Count of Monte Cristo, Illustrated']");
    By lesMiserables=By.xpath("//div[@class='computer only column']//div//a//h5[text()='Les Misérables']");
   // By theAdventuresOfTomSawyer=By.xpath("//div[@class='computer only column']//div//a//h5[text()='Contemporary One-Act Plays']");
    By treasureIsland=By.xpath("//div[@class='computer only column']//div//a//h5[text()='Treasure Island']");




    public void clickOnFictionModule() {
        PageActions actions = new PageActions();
        String fictionModuleExpectedTab = driver.findElement(fictionModule).getText();
        String fictionModuleActualTab = "FICTION";
        System.out.println(fictionModuleActualTab);
        System.out.println(fictionModuleExpectedTab);
        Assert.assertEquals(fictionModuleExpectedTab, fictionModuleActualTab);
        actions.clickOnElement(driver, fictionModule);
    }

    public void verifyTitle() {

        String fictionModuleActualTitle = driver.findElement(fictionModuleButton).getText();
        String fictionModuleExpectedTitle = "FICTION";
        Assert.assertEquals(fictionModuleExpectedTitle, fictionModuleActualTitle);

    }
    public void verifyBookTitle() {


        String draculaActualTitle = driver.findElement(dracula).getText();
        String draculaExpectedTitle = "Dracula";
        Assert.assertEquals(draculaExpectedTitle,draculaActualTitle);

        String theCountOfMonteCristoIllustratedActualTitle = driver.findElement(theCountOfMonteCristoIllustrated).getText();
        String theCountOfMonteCristoIllustratedExpectedTitle = "The Count of Monte Cristo, Illustrated";
        Assert.assertEquals(theCountOfMonteCristoIllustratedExpectedTitle,theCountOfMonteCristoIllustratedActualTitle);

        String lesMiserablesActualTitle = driver.findElement(lesMiserables).getText();
        String lesMiserablesExpectedTitle = "Les Misérables";
        Assert.assertEquals(lesMiserablesExpectedTitle,lesMiserablesActualTitle);




        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       String treasureIslandActualTitle = driver.findElement(treasureIsland).getText();
       String treasureIslandExpectedTitle = "Treasure Island";
       Assert.assertEquals(treasureIslandExpectedTitle,treasureIslandActualTitle);

   }


}
