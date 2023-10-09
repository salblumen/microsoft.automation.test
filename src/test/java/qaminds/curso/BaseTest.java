package qaminds.curso;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.SafariDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--window-size=412,919");
        ChromeOptions chromeOptions = new ChromeOptions();


        if (platform.equals("mobile")){
            chromeOptions.addArguments("--window-size=390,844");  //Screen size iPhone 12 Pro
            chromeOptions.addArguments("--user-agent=Mozilla/5.0 (iPhone; CPU iPhone OS 10_3 like Mac OS X) AppleWebKit/602.1.50 (KHTML, like Gecko) CriOS/56.0.2924.75 Mobile/14E5239e Safari/602.1");

//            driver.manage().window().setSize(new Dimension(390,844));

        }

        driver = new ChromeDriver(chromeOptions);
        driver.get("https://microsoft.com");
    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
