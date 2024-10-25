package step;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.ToastAlertPage;

public class ToastAlertStep {

    ToastAlertPage toastAlertPage;

    public ToastAlertStep() {
        toastAlertPage= new ToastAlertPage(Hooks.driver);
    }

    @When("doy click al Toast")
    public void doyClickAlToast() {
        toastAlertPage.clickToast();
    }

    @Then("valido que se muestre el Toast")
    public void validoQueSeMuestreElToast() {
        Assert.assertTrue("El toast no se mostró correctamente ", toastAlertPage.validarToast());
    }

    @Then("valido que al aceptar se abra una nueva ventana y si hago click en cancelar no haga nada")
    public void validoQueAlAceptarSeAbraUnaNuevaVentanaYSiHagoClickEnCancelarNoHagaNada() {
        toastAlertPage.aceptarCancelarAlerta();
    }
}
