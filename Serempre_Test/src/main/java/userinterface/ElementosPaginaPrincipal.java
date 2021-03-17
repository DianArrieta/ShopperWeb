package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ElementosPaginaPrincipal extends PageObject {

    public static final Target COMBO_CIUDADES = Target.the("ciudad").located(By.id("cityLocation"));

    public static final Target LISTADO = Target.the("lsitado ciudades").locatedBy("#cityLocation div.react-select__menu div.react-select__menu-list .react-select__option");

    public static final Target BOTON_CONTINUAR = Target.the("Botón continuar").located(By.xpath("//span[contains(text(),'Continuar')]//parent::button"));


    }

