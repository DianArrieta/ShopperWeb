package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosFinalizarRegistro {

    public static final Target NOMBRES = Target.the("Ingresar nombres").located(By.id("register-name"));

    public static final Target APELLIDOS = Target.the("Ingresar apellidos").located(By.id("register-lastName"));

    public static final Target CORREO_ELECTRONICO = Target.the("Ingresar correo electronico").located(By.id("register-email"));

    public static final Target BOTON_SIGUIENTE = Target.the("botón siguiente").located(By.xpath("//span[contains(text(),'Siguiente')]//parent::button"));

    public static final Target BOTON_INGRESA_DIRECCION = Target.the("botón ingresa dirección").located(By.xpath("//span[contains(text(),'Ingresa dirección')]//parent::button"));

    public static final Target DIRECCION = Target.the("Igresar direccion").located(By.id("address"));

    public static final Target BOTON_SELECCIONAR_DIRECCION = Target.the("Seleccionar dirección").located(By.className("sc-gXfWUo"));

    public static final Target BOTON_SELECCIONAR_UBICACION = Target.the("botón Seleccionar ubicación").located(By.xpath("//span[contains(text(),'Seleccionar ubicación')]//parent::button[@type='submit']"));

    public static final Target MENSAJE_MOSTRADO = Target.the("body").locatedBy("div.sc-eQxocO p.sc-carGAA");
}
