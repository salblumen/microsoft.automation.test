package qaminds.curso.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import qaminds.curso.BaseTest;

import static  org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DesktopHeaderTest extends BaseTest {

    @Test(testName = "Validar el header de microsoft")
    public void validateHeader(){

        String[] menuList = {"Microsoft 365", "Teams", "Windows", "Surface", "Xbox", "Soporte"};

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
