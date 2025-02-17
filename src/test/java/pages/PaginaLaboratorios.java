package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class PaginaLaboratorios {

    public Button botonAnadirLab = new Button(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[2]/div/button"));

    public TextBox nombreLab = new TextBox(By.xpath("/html/body/div[1]/div[1]/div[2]/div/form/div[1]/div[2]/input"));

    public TextBox precioLab = new TextBox(By.xpath("/html/body/div[1]/div[1]/div[2]/div/form/div[2]/div[2]/span/input"));

    public TextBox obervaciones = new TextBox(By.xpath("/html/body/div[1]/div[1]/div[2]/div/form/div[3]/div[2]/input"));

    public Button guardarLab = new Button(By.xpath("/html/body/div[1]/div[1]/div[2]/div/form/div[4]/button[1]"));

    public Button cancelarLab = new Button(By.xpath("/html/body/div[1]/div[1]/div[2]/div/form/div[4]/button[2]"));
}
