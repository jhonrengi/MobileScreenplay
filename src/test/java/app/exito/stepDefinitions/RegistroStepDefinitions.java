package app.exito.stepDefinitions;



import app.exito.questions.MiCuenta;
import app.exito.tasks.RegistroTask;
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

    @Dado("que el usuario abre la aplicacion exito {string}")
    public void queElUsuarioAbreLaAplicacionExito(String actor) {
        System.out.print(actor);
        OnStage.setTheStage(new OnlineCast());
    }
    @Cuando("El usuario se registra en la aplicacion")
    public void elUsuarioSeRegistraEnLaAplicacion() {
        theActorCalled("Usuario").attemptsTo(
                RegistroTask.operacion()
        );
    }
    @Entonces("El usuario visualiza su informacion")
    public void elUsuarioVisualizaSuInformacion() {
        theActorInTheSpotlight().should(
                seeThat(
                        MiCuenta.from(), Matchers.equalTo(true)
                )
        );
    }


}
