package testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PaginaIncioSesion;
import pages.PaginaLaboratorios;
import pages.PaginaPrincipal;
import session.Session;

public class Laboratorios {

    PaginaIncioSesion paginaIncioSesion = new PaginaIncioSesion();
    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();

    PaginaLaboratorios paginaLaboratorios = new PaginaLaboratorios();

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

        String fullNombreLab = "Hemograma";
        String fullPreciosLab = "20";
        String fullObservaciones = "En ayunas";

        // Iniciar sesión
        Thread.sleep(3000);
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

        paginaPrincipal.laboratirios.click();
        Thread.sleep(2000);

        //Verificar la URL después de hacer clic en "Laboratorios"
        Session.getInstance().createWait(10).until(driver -> driver.getCurrentUrl().contains("/laboratorios"));
        String urlPacientes = Session.getInstance().getBrowser().getCurrentUrl();
        Assertions.assertTrue(urlPacientes.contains("/laboratorios"), "No se llegó a la página de laboratorios correctamente.");

        paginaLaboratorios.botonAnadirLab.click();
        Thread.sleep(2000);

        paginaLaboratorios.nombreLab.setText(fullNombreLab);
        Thread.sleep(2000);
        paginaLaboratorios.precioLab.setText(fullPreciosLab);
        Thread.sleep(2000);
        paginaLaboratorios.obervaciones.setText(fullObservaciones);
        Thread.sleep(2000);
        paginaLaboratorios.guardarLab.click();
        Thread.sleep(5000);


    }
}
