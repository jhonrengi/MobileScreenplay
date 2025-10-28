package app.compensar.stepDefinitions;



import app.compensar.questions.MiCuenta;
import app.compensar.tasks.AbrirLaAplicacionTask;
import app.compensar.tasks.InicioSesionTask;
import app.compensar.tasks.RegistroTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class RegistroStepDefinitions {

    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario está en la pantalla de inicio de sesión")
    public void queElUsuarioEstáEnLaPantallaDeInicioDeSesión() {

        theActorCalled("Usuario").wasAbleTo(
                AbrirLaAplicacionTask.enElDispositivo()
        );
    }
    @Cuando("El usuario ingrersa")
    public void elUsuarioIngrersa() {
        System.out.println("Empezo el cuando");
        theActorInTheSpotlight().attemptsTo(
                InicioSesionTask.inicioSesion()

        );
    }
    @Entonces("El usuario accede correctamente a la plataforma")
    public void elUsuarioAccedeCorrectamenteALaPlataforma() {

    }


}
