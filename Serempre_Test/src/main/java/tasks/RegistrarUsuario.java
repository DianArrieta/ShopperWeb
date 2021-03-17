package tasks;

import interactions.SeleccionarCiudad;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.ElementosFinalizarRegistro.*;
import static userinterface.ElementosPaginaConsumidor.*;
import static userinterface.ElementosPaginaPrincipal.*;
import static userinterface.ElementosRegistroInicial.*;
import static util.GenerarAleatorios.generarNumeroCelular;

public class RegistrarUsuario implements Task {

    private String ciudad;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String dirección;

public RegistrarUsuario(List<String> datos){

    this.ciudad = datos.get(0);
    this.nombre = datos.get(1);
    this.apellido = datos.get(2);
    this.correoElectronico = datos.get(3);
    this.dirección = datos.get(4);
}

    @Override
    public <T extends Actor> void performAs(T actor) {

    String numeroCelular = generarNumeroCelular();

    actor.attemptsTo(

      Click.on(COMBO_CIUDADES),
      SeleccionarCiudad.deResidencia(ciudad,LISTADO),
      Click.on(BOTON_CONTINUAR),
      Click.on(BOTON_CONSUMIDOR),
      Enter.theValue(numeroCelular).into(CELULAR),
      Click.on(BOTON_INGRESAR),
      WaitUntil.the(TERMINOS_Y_CONDICIONES, isVisible()),
      Click.on(TERMINOS_Y_CONDICIONES),
      Click.on(POLITICA_DE_PRIVACIDAD),
      Click.on(BOTON_CONTINUAR_REGISTRO),
      Enter.theValue(nombre).into(NOMBRES),
      Enter.theValue(apellido).into(APELLIDOS),
      Enter.theValue(correoElectronico).into(CORREO_ELECTRONICO),
      Click.on(BOTON_SIGUIENTE),
      Click.on(BOTON_INGRESA_DIRECCION),
      Enter.theValue(dirección).into(DIRECCION),
      Click.on(BOTON_SELECCIONAR_DIRECCION),
      WaitUntil.the(BOTON_SELECCIONAR_UBICACION, isVisible()).forNoMoreThan(3).seconds(),
      Click.on(BOTON_SELECCIONAR_UBICACION)

    );


  }

    public static RegistrarUsuario enLaPagina(List<String> datos) {
        return instrumented(RegistrarUsuario.class, datos);
    }


}
