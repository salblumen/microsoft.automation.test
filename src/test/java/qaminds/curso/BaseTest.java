package qaminds.curso;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.SafariDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BaseTest {
    WebDriver driver;

    @Parameters("platform")
    @BeforeTest
    public void beforeTest(String platform){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.manage().window().setSize(new Dimension(375,667));

        if (platform.equals("mobile")){
            driver.manage().window().setSize(new Dimension(412,919));
            //SafariOptions.fromCapabilities("--headless");
        } else if (platform.equals("desktop")) {

            driver.manage().window().maximize();
            driver.get("https://microsoft.com");
        }
    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
