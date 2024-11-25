package Pages;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Inventory extends BaseClass {


    public Inventory(WebDriver driver) {
        super(driver);
    }
    public void seleccion(){

        click(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']"));
        click(By.xpath("//button[@data-test='add-to-cart-sauce-labs-bike-light']"));
        click(By.xpath("//button[@data-test='add-to-cart-sauce-labs-bolt-t-shirt']"));
        click(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"));
        click(By.xpath("//button[@data-test='add-to-cart-sauce-labs-onesie']"));
        click(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));

        click(By.xpath("//a [@data-test='shopping-cart-link']"));
        click(By.xpath("//button[@data-test='checkout']"));

    }

    public void seleccion2(){

        click(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']"));
        click(By.xpath("//button[@data-test='add-to-cart-sauce-labs-bike-light']"));
        click(By.xpath("//button[@data-test='add-to-cart-sauce-labs-bolt-t-shirt']"));
        click(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"));
        click(By.xpath("//button[@data-test='add-to-cart-sauce-labs-onesie']"));
        click(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));


        click(By.xpath("//a [@data-test='shopping-cart-link']"));
        // cancelo elementos del carrito

        click(By.xpath("//button[@data-test='remove-sauce-labs-onesie']"));
        click(By.xpath("//button[@data-test='remove-sauce-labs-bike-light']"));


        click(By.xpath("//button[@data-test='checkout']"));
    }

    public void seleccion3(){
        //selecciona un item de la pagina pero luego de va sin comprar
        click(By.xpath("//button[@data-test=\"add-to-cart-sauce-labs-bike-light\"]"));
        click(By.xpath("//a [@data-test='shopping-cart-link']"));

        click(By.xpath("//button[@data-test='continue-shopping']"));

    }

    public void seleccion4(){
        //Ingreso a redes sociales desde la page de compras
        click(By.xpath("//a[@data-test=\"social-twitter\"]"));



    }




}
