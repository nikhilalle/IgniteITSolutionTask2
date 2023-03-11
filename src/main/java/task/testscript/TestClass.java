package task.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import task.base.BaseClass;
import task.pages.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class TestClass extends BaseClass {
    WebDriver driver;
    Fiction fiction;
    Drama drama;
    Humor humor;
    Politics politics;


    @BeforeMethod
    public void openBrowser() throws IOException {
        initBrowser();
    }

    @Test
    public void verifyPageHeading() {
        String actualTitle = driver.findElement(By.tagName("h1")).getText();
        String expectedTitle = "Gutenberg Project";
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println(actualTitle);
        System.out.println(expectedTitle);
    }

    @Test
    public void verifyFictionModule() throws InterruptedException {
        fiction = new Fiction(getDriver());
        fiction.clickOnFictionModule();
        fiction.verifyTitle();
        fiction.verifyBookTitle();

    }

    @Test
    public void verifyDramaModule() throws InterruptedException {
        drama = new Drama(getDriver());
        drama.clickOnDramaModule();
        drama.verifyTitle();
        drama.verifyBookTitle();

    }

    @Test
    public void verifyHumorModule() throws InterruptedException {
        humor = new Humor(getDriver());
        humor.clickOnHumorModule();
        humor.verifyTitle();
        humor.verifyBookTitle();


    }

    @Test
    public void verifyPoliticsModule() throws InterruptedException {
        politics = new Politics(getDriver());
        politics.clickOnPoliticsModule();
        politics.verifyTitle();
        politics.verifyBookTitle();

    }


     @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}