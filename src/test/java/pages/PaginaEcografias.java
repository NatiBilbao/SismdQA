package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class PaginaEcografias {

    public Button botonAnadirEco = new Button(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[2]/div/button"));

    public TextBox nombreEco = new TextBox(By.xpath("/html/body/div[1]/div[1]/div[2]/div/form/div[1]/div[2]/input"));

    public TextBox precioEco = new TextBox(By.xpath("/html/body/div[1]/div[1]/div[2]/div/form/div[2]/div[2]/span/input"));

    public Button guardarEco = new Button(By.xpath("/html/body/div[1]/div[1]/div[2]/div/form/div[3]/button[1]"));

    public Button cancelarEco = new Button(By.xpath("/html/body/div[1]/div[1]/div[2]/div/form/div[3]/button[2]"));
}
