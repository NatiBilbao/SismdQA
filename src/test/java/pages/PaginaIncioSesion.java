package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class PaginaIncioSesion {

    public TextBox usuario = new TextBox(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/form/div/div[1]/div[1]/div/input"));

    public TextBox contrasena = new TextBox(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/form/div/div[1]/div[2]/div/input"));

    public Button ingresar = new Button(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/form/div/div[1]/div[3]/div/button/span/span"));
}
