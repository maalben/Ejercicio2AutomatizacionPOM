package co.com.automationtesting.pageobject;

import co.com.automationtesting.utilities.Utilidades;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://practice.automationtesting.in/my-account/")
public class AutenticacionPageObject extends PageObject {

    public void autenticar(String usuario, String clave) {
        Utilidades.typeInField(this.getDriver().findElement(By.id("username")), usuario);
        Utilidades.typeInField(this.getDriver().findElement(By.id("password")), clave);
        Utilidades.clickElement(this.getDriver(), "login", "name");
    }

    public void comprobarResultado(String saludo) {
        WebElement mensajePagina = this.getDriver().findElement(By.xpath("//div[@class='woocommerce-MyAccount-content']//p[1]"));

        Assert.assertTrue(mensajePagina.getText().contains(saludo));
    }
}
