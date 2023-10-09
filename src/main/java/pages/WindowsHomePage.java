package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WindowsHomePage {
    private WebDriver driver;
    private WebDriverWait wait;
    public WindowsHomePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public WindowsPage onClickOptionWindows(){
        wait.until(ExpectedConditions.visibilityOf(buttonMenuOptionWindows()));
        buttonMenuOptionWindows().click();
        return new WindowsPage(driver);
    }

    //WebElements
    public WebElement buttonMenuOptionWindows(){
        return driver.findElement(By.id("shellmenu_2"));
    }



}
