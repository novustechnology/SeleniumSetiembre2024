package step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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
    public void ingresoLosDatosDelFormulario() {
        formularioPage.ingresarDatosFormulario();
    }
}
