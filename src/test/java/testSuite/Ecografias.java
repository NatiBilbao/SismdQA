package testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PaginaEcografias;
import pages.PaginaIncioSesion;
import pages.PaginaPrincipal;
import session.Session;

public class Ecografias {

    PaginaIncioSesion paginaIncioSesion = new PaginaIncioSesion();
    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();

    PaginaEcografias paginaEcografias = new PaginaEcografias();

    ChromeDriver chrome;

    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get("https://sismed.mikeguerra4.com/login");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }

    @Test
    public void registrarPacientes() throws InterruptedException {

        String fullUsuario = "natabilbaocano18@gmail.com";
        String fullContrasena = "Admin123.";

        String fullNombreEco1 = "Ecografía Articular";
        String fullNombreEco2 = "Ecografía Hepatobiliar";
        String fullNombreEco3 = "Ecografía de baso";
        String fullNombreEco4 = "Ecografía renal-vesical";
        String fullNombreEco5 = "Ecografía ginecologica";
        String fullNombreEco6 = "Ecografía obstetrica";
        String fullNombreEco7 = "Ecografía prostatica";
        String fullNombreEco8 = "Ecografía mamaria bilateral";
        String fullNombreEco9 = "Ecografía de tiroides";
        String fullNombreEco10 = "Ecografía rastreo abdominal";
        String fullNombreEco11 = "Ecografía testicular";
        String fullNombreEco12 = "Ecografía partes blandas";
        String fullNombreEco13 = "Ecografía dopler";
        String fullNombreEco14 = "Ecografía estructurada";

        String fullPrecio = "0";

        // Iniciar sesión
        Thread.sleep(5000);
        paginaIncioSesion.usuario.setText(fullUsuario);
        Thread.sleep(2000);
        paginaIncioSesion.contrasena.setText(fullContrasena);
        Thread.sleep(2000);

        paginaIncioSesion.ingresar.click();
        Thread.sleep(5000);

        //Verificar que la redirección sea correcta después de login
        String urlActual = Session.getInstance().getBrowser().getCurrentUrl();
        String urlEsperada = "https://sismed.mikeguerra4.com/";
        Assertions.assertEquals(urlEsperada, urlActual, "No se redirigió a la página esperada después del login.");

        paginaPrincipal.ecografias.click();
        Thread.sleep(2000);

        //Verificar la URL después de hacer clic en "Laboratorios"
        Session.getInstance().createWait(10).until(driver -> driver.getCurrentUrl().contains("/ecografias"));
        String urlPacientes = Session.getInstance().getBrowser().getCurrentUrl();
        Assertions.assertTrue(urlPacientes.contains("/ecografias"), "No se llegó a la página de ecografias correctamente.");

        paginaEcografias.botonAnadirEco.click();
        Thread.sleep(2000);

        paginaEcografias.nombreEco.setText(fullNombreEco1);
        Thread.sleep(2000);
        paginaEcografias.precioEco.setText(fullPrecio);
        Thread.sleep(2000);
        paginaEcografias.guardarEco.click();
        Thread.sleep(5000);

        paginaEcografias.botonAnadirEco.click();
        Thread.sleep(2000);

        paginaEcografias.nombreEco.setText(fullNombreEco2);
        Thread.sleep(2000);
        paginaEcografias.precioEco.setText(fullPrecio);
        Thread.sleep(2000);
        paginaEcografias.guardarEco.click();
        Thread.sleep(5000);

        paginaEcografias.botonAnadirEco.click();
        Thread.sleep(2000);

        paginaEcografias.nombreEco.setText(fullNombreEco3);
        Thread.sleep(2000);
        paginaEcografias.precioEco.setText(fullPrecio);
        Thread.sleep(2000);
        paginaEcografias.guardarEco.click();
        Thread.sleep(5000);

        paginaEcografias.botonAnadirEco.click();
        Thread.sleep(2000);

        paginaEcografias.nombreEco.setText(fullNombreEco4);
        Thread.sleep(2000);
        paginaEcografias.precioEco.setText(fullPrecio);
        Thread.sleep(2000);
        paginaEcografias.guardarEco.click();
        Thread.sleep(5000);

        paginaEcografias.botonAnadirEco.click();
        Thread.sleep(2000);

        paginaEcografias.nombreEco.setText(fullNombreEco5);
        Thread.sleep(2000);
        paginaEcografias.precioEco.setText(fullPrecio);
        Thread.sleep(2000);
        paginaEcografias.guardarEco.click();
        Thread.sleep(5000);

        paginaEcografias.botonAnadirEco.click();
        Thread.sleep(2000);

        paginaEcografias.nombreEco.setText(fullNombreEco6);
        Thread.sleep(2000);
        paginaEcografias.precioEco.setText(fullPrecio);
        Thread.sleep(2000);
        paginaEcografias.guardarEco.click();
        Thread.sleep(5000);

        paginaEcografias.botonAnadirEco.click();
        Thread.sleep(2000);

        paginaEcografias.nombreEco.setText(fullNombreEco7);
        Thread.sleep(2000);
        paginaEcografias.precioEco.setText(fullPrecio);
        Thread.sleep(2000);
        paginaEcografias.guardarEco.click();
        Thread.sleep(5000);

        paginaEcografias.botonAnadirEco.click();
        Thread.sleep(2000);

        paginaEcografias.nombreEco.setText(fullNombreEco8);
        Thread.sleep(2000);
        paginaEcografias.precioEco.setText(fullPrecio);
        Thread.sleep(2000);
        paginaEcografias.guardarEco.click();
        Thread.sleep(5000);

        paginaEcografias.botonAnadirEco.click();
        Thread.sleep(2000);

        paginaEcografias.nombreEco.setText(fullNombreEco9);
        Thread.sleep(2000);
        paginaEcografias.precioEco.setText(fullPrecio);
        Thread.sleep(2000);
        paginaEcografias.guardarEco.click();
        Thread.sleep(5000);

        paginaEcografias.botonAnadirEco.click();
        Thread.sleep(2000);

        paginaEcografias.nombreEco.setText(fullNombreEco10);
        Thread.sleep(2000);
        paginaEcografias.precioEco.setText(fullPrecio);
        Thread.sleep(2000);
        paginaEcografias.guardarEco.click();
        Thread.sleep(5000);

        paginaEcografias.botonAnadirEco.click();
        Thread.sleep(2000);

        paginaEcografias.nombreEco.setText(fullNombreEco12);
        Thread.sleep(2000);
        paginaEcografias.precioEco.setText(fullPrecio);
        Thread.sleep(2000);
        paginaEcografias.guardarEco.click();
        Thread.sleep(5000);

        paginaEcografias.botonAnadirEco.click();
        Thread.sleep(2000);

        paginaEcografias.nombreEco.setText(fullNombreEco11);
        Thread.sleep(2000);
        paginaEcografias.precioEco.setText(fullPrecio);
        Thread.sleep(2000);
        paginaEcografias.guardarEco.click();
        Thread.sleep(5000);

        paginaEcografias.botonAnadirEco.click();
        Thread.sleep(2000);

        paginaEcografias.nombreEco.setText(fullNombreEco13);
        Thread.sleep(2000);
        paginaEcografias.precioEco.setText(fullPrecio);
        Thread.sleep(2000);
        paginaEcografias.guardarEco.click();
        Thread.sleep(5000);

        paginaEcografias.botonAnadirEco.click();
        Thread.sleep(2000);

        paginaEcografias.nombreEco.setText(fullNombreEco14);
        Thread.sleep(2000);
        paginaEcografias.precioEco.setText(fullPrecio);
        Thread.sleep(2000);
        paginaEcografias.guardarEco.click();
        Thread.sleep(5000);

    }

}
