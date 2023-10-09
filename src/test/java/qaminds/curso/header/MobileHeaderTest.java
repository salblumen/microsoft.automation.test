package qaminds.curso.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import qaminds.curso.BaseTest;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class MobileHeaderTest extends BaseTest {

    @Test(testName = "Validar el header de microsoft")
    public void validateHeader(){

        String[] menuList = {"Microsoft 365", "Teams", "Windows", "Surface", "Xbox", "Soporte"};
        String[] submenuList = {"Software","PCs y dispositivos","Entretenimiento","Empresas","Desarrollador y TI","Otros"};


        WebElement toggleMenu = getDriver().findElement(By.cssSelector("button.c-action-trigger.c-glyph.glyph-global-nav-button"));
        toggleMenu.click();

        WebElement menuElement = getDriver().findElement(By.cssSelector("li.c-w0-contr.c-w0-contr-desktop-hidden > ul"));

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(menuElement.findElements(By.tagName("a"))));

        List<String> myList = menuElement.findElements(By.tagName("a")).stream().map(WebElement::getText)
                .collect(Collectors.toList());

        List<WebElement> secondList = getDriver().findElements(By.cssSelector("#uhf-c-nav > ul li.f-sub-menu > button"));
        wait.until(ExpectedConditions.elementToBeClickable(secondList.get(0)));

        List<String> myList2 = secondList.stream()
                        .map(WebElement::getText)
                        .collect(Collectors.toList());

        assertThat(myList).contains(menuList);
        assertThat(myList2).contains(submenuList);

        }


//        myList.forEach(element -> {
//            System.out.println(element.getText());
//
//        });


//    }

}