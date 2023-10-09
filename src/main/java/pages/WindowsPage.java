package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WindowsPage {
    //Webdriver
    private WebDriver driver;
    private WebDriverWait wait;
    //constructor
    public WindowsPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    }

    public void onClickMenuOptionObtenerWindows(){
        wait.until(ExpectedConditions.visibilityOf(buttonMenuOptionGetWindows()));
        buttonMenuOptionGetWindows().click();
    }
    public Windows11HomePage onClickMenuOptionsWindows11Home(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonOptionWindows11Home()));
        buttonOptionWindows11Home().click();
        return new Windows11HomePage(driver);
    }


    //WebElements
    private WebElement buttonMenuOptionGetWindows(){
        return driver.findElement(By.id("c-shellmenu_58"));
    }
    private WebElement buttonOptionWindows11Home(){

        return driver.findElement(By.id("c-shellmenu_63"));
    }

}
