package step;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.FormularioPage;

public class FormularioStep {

    FormularioPage formularioPage;

    public FormularioStep(){
        formularioPage = new FormularioPage(Hooks.driver);
    }

    @Given("ingreso a la pagina de NovusTechnology")
    public void ingresoALaPaginaDeNovusTechnology() {
        formularioPage.ingresarUrl();
    }

    @And("ingreso los datos del formulario")
    public void ingresoLosDatosDelFormulario(DataTable dataTable) {
        formularioPage.ingresarDatosFormulario(dataTable);
    }

    @And("ingresamos el numero de telefono y correo electronico {string}")
    public void ingresamosElNumeroDeTelefonoYCorreoElectronico(String email) {
        formularioPage.ingresarTelefonoCorreo(email);
    }

    @And("seleccionamos {string} y la primera ciudad")
    public void seleccionamosYLaPrimeraCiudad(String departamento) {
        formularioPage.seleccionarDepartamento(departamento);
    }

    @And("seleccionamoslos comandos de selenium y cargamos una imagen")
    public void seleccionamoslosComandosDeSeleniumYCargamosUnaImagen() throws InterruptedException {
        formularioPage.seleccionarComandoSelenium();
        formularioPage.cargarImagen();
    }

    @Then("hacemos click en el boton enviar y valida el mensaje {string}")
    public void hacemosClickEnElBotonEnviarYValidaElMensaje(String txtInfoPersonal) {
        formularioPage.clickEnviar();
        Assert.assertEquals(formularioPage.validarMensajeInfo(),txtInfoPersonal);
    }

    @And("valido el mensaje de error {string}")
    public void validoElMensajeDeError(String txtError) {
        Assert.assertEquals(formularioPage.validarMensajeError(),txtError);
    }
}
