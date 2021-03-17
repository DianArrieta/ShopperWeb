package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosRegistroInicial {

    public static final Target TERMINOS_Y_CONDICIONES = Target.the("checkbox para aceptar terminos y condiciones").located(By.id("abi-checkbox-terms"));

    public static final Target POLITICA_DE_PRIVACIDAD = Target.the("checkbox para aceptar politica de privacidad").located(By.id("abi-checkbox-policies"));

    public static final Target BOTON_CONTINUAR_REGISTRO = Target.the("Botón continuar").located(By.xpath("//span[contains(text(),'Continuar')]//parent::button"));

}
