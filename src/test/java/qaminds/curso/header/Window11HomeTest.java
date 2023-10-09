package qaminds.curso.header;

import org.testng.annotations.Test;
import pages.Windows11HomePage;
import pages.WindowsHomePage;
import pages.WindowsPage;
import qaminds.curso.BaseTest;

import java.util.Base64;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Window11HomeTest extends BaseTest {

    @Test(testName = "Validate Windows 11 Home Page", description="Validate Windows 11 Home buy button in Windows page")
    public void ValidateWindows11Home(){
        //paso 1; Dar click on Windows option
        WindowsHomePage whp = new WindowsHomePage(getDriver());
        WindowsPage wp = whp.onClickOptionWindows();

        //paso 2: Dar click en Obtener Windows
        wp.onClickMenuOptionObtenerWindows();

        //Paso 3 click en comprar Windows
        Windows11HomePage w11hp = wp.onClickMenuOptionsWindows11Home();

        // Paso 4: cerrar el PopUp
        w11hp.closePopUpSubscriber();

        // Paso 5: Validar el titulo del producto
        assertThat(w11hp.labelTitleProductGetText())
                .as("El titulo del producto no es el esperado")
                .isEqualTo("Windows 11 Home (Download)");


    }
}
