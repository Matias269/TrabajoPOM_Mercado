package Pages;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends BaseClass {


    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void funcion(String username, String password){

        agregarTexto(esperaExplicita(By.xpath("//input[@data-test='username']"),10),username);

        agregarTexto(esperaExplicita(By.xpath("//input[@data-test='password']"),10),password);

        click(By.xpath("//input[@data-test='login-button']"));

///
    }




}

