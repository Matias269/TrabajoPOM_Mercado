package Pages;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class carrito extends BaseClass {

    public carrito(WebDriver driver) {
        super(driver);
    }

    public void laCompra(String firstName, String lastName,String postalCode){

           agregarTexto(esperaExplicita(By.xpath("//input[@data-test='firstName']"),10),firstName);

            agregarTexto(esperaExplicita(By.xpath("//input[@data-test='lastName']"),10),lastName);

            agregarTexto(esperaExplicita(By.xpath("//input[@data-test='postalCode']"),10),postalCode);

            click(By.xpath("//input[@data-test='continue']"));

            click(By.xpath("//button[@data-test='finish']"));

            click(esperaExplicita(By.xpath("//button[@data-test='back-to-products']"),15));


    }

    public void salirPagina(){

        click(By.xpath("//button[@id='react-burger-menu-btn']"));
        click(By.xpath("//a[@id='logout_sidebar_link']"));

    }

}

















