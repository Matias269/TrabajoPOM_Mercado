package Test;


import Pages.Inventory;
import Pages.LandingPage;
import Pages.carrito;
import Utils.DataDriven;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class AppTest {

    private WebDriver driver;
    private static String rutaDriver = System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\chromedriver.exe";
    private static String property = "webdriver.chrome.driver";
    private static String browser = "chrome";
    private ArrayList<String> data;

    private LandingPage pagina1;
    private Inventory pagina2;
    private carrito pagina3;

    @BeforeEach
    public void Precondiciones(){
        //navegador
        data = new ArrayList<String>();

        pagina1 = new LandingPage(driver);
        pagina1.conexionDriver(browser,rutaDriver,property);

        pagina1.maximize();
        pagina1.cargarPagina("https://www.saucedemo.com/");

        pagina2 = new Inventory(pagina1.getDriver());

        pagina3= new carrito(pagina1.getDriver());


    }
    @Test
    //Test donde selecciona el inventario completo de la pagina y lo compra

    public void testCase01(){
        //data = DataDriven.getTestData("testCase01");

        pagina1.funcion("standard_user", "secret_sauce");
        pagina2.seleccion();
        pagina3.laCompra("Matias","Mercado","5300");

    }

    @Test
    //Test Seleeciona pero luego elimina de la lista

    public void testCase02(){

        pagina1.funcion("standard_user", "secret_sauce");
        pagina2.seleccion2();
        pagina3.laCompra("Matias","Mercado","5300");
    }

   @Test
   //Intenta realizar una compra y se desloguea sin cerrar la compra

   public void testCase03(){

       pagina1.funcion("standard_user", "secret_sauce");
       pagina2.seleccion3();
       pagina3.salirPagina();

   }

   @Test
//Inicia sesion en la marketplace, hace clic en la red social Twitter la abre y cierra Saucedemo
   public void testCase04(){

       pagina1.funcion("standard_user", "secret_sauce");
       pagina2.seleccion4();

   }

@Test
   public void testCase05(){
       pagina1.funcion("locked_out_user", "secret_sauce");

    //puedo agregar el assert

   }


    @AfterEach


    public void Poscondiciones(){

        //pagina1.cerrar();

    }
}
