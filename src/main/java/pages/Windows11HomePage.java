package pages;

import chunks.PopUpSubscriberChunk;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Windows11HomePage {
    private WebDriver driver;
    private WebDriverWait wait;
    public Windows11HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(180));
    }

    public void closePopUpSubscriber() {
        new PopUpSubscriberChunk(driver).onClickButtonClose();
    }

    public String labelTitleProductGetText(){
        wait.until(ExpectedConditions.visibilityOf(labelTitleProduct()));
        return labelTitleProduct().getText();
    }

    private WebElement labelTitleProduct() {
        return driver.findElement(By.cssSelector("div.buy-box-middle-col.col-lg-6.col-xl-7 > div > h1"));
    }

}
