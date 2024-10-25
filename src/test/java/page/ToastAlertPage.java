package page;

import base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ToastAlertPage extends BasePage {
    public ToastAlertPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@alt='Loader']")
    private WebElement loader;

    @FindBy(id = "liveToastBtn")
    private WebElement btnToast;

    @FindBy(className = "toast-body")
    private WebElement modalToast;

    @FindBy(id = "mostrarAlerta")
    private WebElement btnAlerta;


    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void clickToast() {
        wait.until(ExpectedConditions.invisibilityOf(loader));
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        wait.until(ExpectedConditions.elementToBeClickable(btnToast)).click();
    }

    public boolean validarToast(){
        wait.until(ExpectedConditions.visibilityOf(modalToast));
        return modalToast.isDisplayed();
    }


    public void aceptarCancelarAlerta(){
        wait.until(ExpectedConditions.invisibilityOf(loader));
        wait.until(ExpectedConditions.elementToBeClickable(btnAlerta)).click();
        wait.until(ExpectedConditions.alertIsPresent()).dismiss();
        //Alert alerta = driver.switchTo().alert();
        //alerta.accept();

    }

}
