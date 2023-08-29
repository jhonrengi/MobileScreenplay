package app.exito.tasks;

import app.exito.ui.Registro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class VerificacionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(Registro.CODIGO_VERIFICACION,isClickable()).forNoMoreThan(60).seconds(),
                Enter.theValue(" ").into(Registro.CODIGO_VERIFICACION),
                Enter.theValue("ABCDEabcde12").into(Registro.CONTRASEÑA),
                Enter.theValue("ABCDEabcde12").into(Registro.CONFIRMAR_CONTRASEÑA),
                Click.on(Registro.BTN_CREAR),
                Click.on(Registro.BTN_MICUENTA)

        );
    }
}
