package co.com.migrupo.certification.proyectobase.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import questions.ElResultado;
import tasks.AbrirNavegador;
import tasks.RegistrarUsuario;
import userinterface.PaginaPrincipal;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;
import static userinterface.ElementosFinalizarRegistro.MENSAJE_MOSTRADO;

public class ShopperWebStepDefinitions {

    @Dado("^que el usuario ingresa a la pagina$")
    public void queElUsuarioIngresaALaPagina() throws Exception {
        theActorInTheSpotlight().wasAbleTo(AbrirNavegador.on(new PaginaPrincipal()));
    }


    @Cuando("^ingresa los datos de registro$")
    public void ingresaLosDatosDeRegistro(List<String> datos) throws Exception {
        theActorInTheSpotlight().attemptsTo(
                RegistrarUsuario.enLaPagina(datos)
        );
    }

    @Entonces("^valida que el mensaje es (.*)$")
    public void validaQueElMensajeEs (String mensajeEsperado) throws Exception {
        theActorInTheSpotlight().should(
                seeThat(ElResultado.para(MENSAJE_MOSTRADO),is(mensajeEsperado.trim()))
        );
    }


}

