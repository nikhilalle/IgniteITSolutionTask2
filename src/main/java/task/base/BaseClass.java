package task.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    WebDriver driver;
    Properties prop;

    public WebDriver getDriver(){
        return driver;
    }

    public void initBrowser() throws IOException {
        readProperties();
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void readProperties() throws IOException {
        //String projectPath = System.getProperty("user.id");
        File file = new File("D:\\JAVA NEW 2022\\Test\\TASK 2\\Task2Automation\\src\\main\\java\\task\\config.properties");
        FileInputStream fin = new FileInputStream(file);
         prop = new Properties();
        prop.load(fin);


    }

}
