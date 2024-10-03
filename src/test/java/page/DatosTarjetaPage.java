package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatosTarjetaPage extends BasePage {
    public DatosTarjetaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h4[1]")
    private WebElement lblNroTarjeta;

    @FindBy(xpath = "//h4[2]")
    private WebElement lblCvv;

    @FindBy(xpath = "//h4[3]")
    private WebElement lblFechaExp;






}
