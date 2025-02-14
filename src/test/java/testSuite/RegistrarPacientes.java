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
        Session.getInstance().getBrowser().get("https://theloniousmed.com/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }

    @Test
    public void registrarPacientes() throws InterruptedException {

        String fullEmail = "diego2@gmail.com";
        String fullPassword = "40987Diego.";
        String fullNombres = "Diego";
        String fullApellidoPaterno = "Bilbao";
        String fullApellidoMaterno = "Bilbao";
        String fullFechaNacimiento ="15/10/2004";
        String fullTelefono = "61143119";
        String fullTelefonoReferencia = "76259961";
        String fullNumeroDocumento = "12452756";

        paginaInicial.registroUsuario.click();
        Thread.sleep(5000);

        paginaRegistros.email.setText(fullEmail);
        paginaRegistros.password.setText(fullPassword);
        paginaRegistros.nombres.setText(fullNombres);
        paginaRegistros.apellidoPaterno.setText(fullApellidoPaterno);
        paginaRegistros.apellidoMaterno.setText(fullApellidoMaterno);
        paginaRegistros.fechaNacimiento.setText(fullFechaNacimiento);
        paginaRegistros.genero.click();
        Thread.sleep(5000);
        paginaRegistros.generoMasculino.click();
        Thread.sleep(5000);
        paginaRegistros.telefono.setText(fullTelefono);
        paginaRegistros.telefonoReferencia.setText(fullTelefonoReferencia);
        paginaRegistros.numeroDocumento.setText(fullNumeroDocumento);
        paginaRegistros.tipoDocumento.click();
        Thread.sleep(5000);
        paginaRegistros.carnetIdentidad.click();
        Thread.sleep(5000);
        paginaRegistros.guardarRegistro.click();
        Thread.sleep(5000);

        Thread.sleep(5000);
    }
}
