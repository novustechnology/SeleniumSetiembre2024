package step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.DatosTarjetaPage;
import page.HomePage;

public class CarritoStep {

    HomePage homePage;


    public CarritoStep() {
        homePage= new HomePage(Hooks.driver);

    }

    @Given("que accedo a la pagina DemoGuru")
    public void queAccedoALaPaginaDemoGuru() {
       Hooks.driver.get("https://demo.guru99.com/payment-gateway/index.php");
    }

    @When("doy click en generar tarjeta")
    public void doyClickEnGenerarTarjeta() {
        homePage.clickGenerarTarjeta();
    }

    @And("capturo los datos de la tarjeta")
    public void capturoLosDatosDeLaTarjeta() {
    }

    @And("selecciono la cantidad de productos al carrito y le doy comprar")
    public void seleccionoLaCantidadDeProductosAlCarritoYLeDoyComprar() {
    }

    @Then("ingreso los datos de la tarjeta")
    public void ingresoLosDatosDeLaTarjeta() {
    }
}
