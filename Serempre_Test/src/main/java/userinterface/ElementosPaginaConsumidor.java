package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosPaginaConsumidor {

    public static final Target BOTON_CONSUMIDOR = Target.the("Botón consumidor").located(By.xpath("//span[contains(text(),'Consumidor')]//parent::button"));

    public static final Target CELULAR = Target.the("Ingresar numero de celular").located(By.id("abi-phone"));

    public static final Target BOTON_INGRESAR = Target.the("Botón ingresar").located(By.xpath("//span[contains(text(),'Ingresar')]//parent::button"));

}
