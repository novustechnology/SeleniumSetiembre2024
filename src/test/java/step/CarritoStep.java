package step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.DatosPagoPage;
import page.DatosTarjetaPage;
import page.HomePage;
import page.ValidarPagoPage;

public class CarritoStep {

    HomePage homePage;
    DatosTarjetaPage datosTarjetaPage;
    DatosPagoPage datosPagoPage;
    ValidarPagoPage validarPagoPage;

    public CarritoStep() {
        homePage = new HomePage(Hooks.driver);
        datosTarjetaPage = new DatosTarjetaPage(Hooks.driver);
        datosPagoPage = new DatosPagoPage(Hooks.driver);
        validarPagoPage = new ValidarPagoPage(Hooks.driver);
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
        datosTarjetaPage.cambiarVentana();
        datosTarjetaPage.capturarTarjeta();
        datosTarjetaPage.capturarCvv();
        datosTarjetaPage.capturarFechaExp();
        datosTarjetaPage.cerrarVentana();
    }

    @And("selecciono la cantidad de productos al carrito y le doy comprar")
    public void seleccionoLaCantidadDeProductosAlCarritoYLeDoyComprar() {
        homePage.seleccionarCant();
        homePage.clickComprar();
    }

    @And("agrego una cantidad {string} de productos al carrito")
    public void agregoUnaCantidadDeProductosAlCarrito(String cant) {
        homePage.seleccionarCantFinal(cant);
        homePage.clickComprar();
    }

    @Then("ingreso los datos de la tarjeta")
    public void ingresoLosDatosDeLaTarjeta() {
        datosPagoPage.ingresarDatos();
    }

    @Then("validamos que el pago fue exitoso {string}")
    public void validamosQueElPagoFueExitoso(String txtPagoExitoso) {
        Assert.assertEquals(txtPagoExitoso,validarPagoPage.validarMensajePago());
        Assert.assertTrue(validarPagoPage.validarPresenciaBoton());

    }
}
