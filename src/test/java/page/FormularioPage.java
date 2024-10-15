package page;

import base.BasePage;
import base.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FormularioPage extends BasePage {
    public FormularioPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    ConfigFileReader configFileReader = new ConfigFileReader();

    @FindBy(xpath = "//img[@alt='Loader']")
    private WebElement loader;


    public void ingresarUrl() {
        driver.get(configFileReader.getProp("url1"));
    }

    public void ingresarDatosFormulario(){
        wait.until(ExpectedConditions.invisibilityOf(loader));

    }


}
