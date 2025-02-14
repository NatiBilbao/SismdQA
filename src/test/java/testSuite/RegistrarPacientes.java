package testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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

        paginaIncioSesion.usuario.setText(fullUsuario);
        Thread.sleep(5000);
        paginaIncioSesion.contrasena.setText(fullContrasena);
        Thread.sleep(5000);

        paginaIncioSesion.ingresar.click();
        Thread.sleep(5000);

        Thread.sleep(5000);
    }
}
