package testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PaginaIncioSesion;
import pages.PaginaPrincipal;
import session.Session;

public class RegistrarPacientes {

    PaginaIncioSesion paginaIncioSesion = new PaginaIncioSesion();

    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();

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

        paginaPrincipal.pacientes.click();
        Thread.sleep(2000);

        //Verificar la URL después de hacer clic en "Pacientes"
        Session.getInstance().createWait(10).until(driver -> driver.getCurrentUrl().contains("/pacientes"));
        String urlPacientes = Session.getInstance().getBrowser().getCurrentUrl();
        Assertions.assertTrue(urlPacientes.contains("/pacientes"), "No se llegó a la página de pacientes correctamente.");
    }
}
