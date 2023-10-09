package chunks;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;


public class PopUpSubscriberChunk {
    private WebDriver driver;

    public PopUpSubscriberChunk(WebDriver driver){
        this.driver = driver;


    }

    public void onClickButtonClose(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(400));
        wait.until(ExpectedConditions.visibilityOf(buttonClose()));
        buttonClose().click();
    }

    //WebElements
    public WebElement buttonClose(){
        return driver.findElement(By.cssSelector("#emailSup-modal > div > div > div.modal-header > button"));
    }


}
