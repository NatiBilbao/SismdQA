package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class PaginaPrincipal {

    public Button inicio = new Button(By.xpath("/html/body/div[2]/div[3]/ul/li[1]/div/a/span"));

    public Button pacientes = new Button(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div/div/a[1]/span"));

    public Button laboratirios = new Button(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div/div/a[8]/span"));
}
