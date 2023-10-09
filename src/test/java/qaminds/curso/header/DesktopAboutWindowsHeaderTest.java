package qaminds.curso.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import qaminds.curso.BaseTest;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class DesktopAboutWindowsHeaderTest extends BaseTest {

    @Test(testName = "Validar el header de About Windows Menu")
    public void validateHeader(){

        WebElement winElement = getDriver().findElement(By.cssSelector("#shellmenu_2"));
        winElement.click();
        WebElement aboutWin = getDriver().findElement(By.id("c-shellmenu_48"));
        aboutWin.click();

        String[] aboutWinMenu = {"Descubre Windows 11", "Comparar Windows 10 y 11", "Seguridad de Windows 11", "Edición de fotos y películas",
                "Aplicaciones", "Juegos", "Sincroniza smartphones con la computadora","Características de accesibilidad de Windows",
                "Sugerencias y trucos"};

        WebElement menuList = getDriver().findElement(By.cssSelector("#uhf-g-nav > ul > li:nth-child(2) > div > ul"));
        List<String> myList = menuList.findElements(By.tagName("a")).stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        assertThat(myList).contains(aboutWinMenu);

        }


//        myList.forEach(element -> {
//            System.out.println(element.getText());
//
//        });


//    }

}
