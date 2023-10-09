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


        WebElement toggleMenu = getDriver().findElement(By.cssSelector("#headerUniversalHeader > header > div > div > button.c-action-trigger.c-glyph.glyph-global-nav-button"));
        toggleMenu.click();

        WebElement menuElement = getDriver().findElement(By.cssSelector("#uhf-g-nav > ul"));
        List<String> myList = menuElement.findElements(By.tagName("a")).stream().map(WebElement::getText)
                .collect(Collectors.toList());

        assertThat(myList).contains(menuList);

        }


//        myList.forEach(element -> {
//            System.out.println(element.getText());
//
//        });


//    }

}