package app.compensar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import app.compensar.ui.Registro;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class RegistroTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(Registro.BTN_REGISTRARSE,isClickable()).forNoMoreThan(60).seconds(),
                Click.on(Registro.BTN_REGISTRARSE),
                Enter.theValue(" JUAN").into(Registro.TXT_NOMBRE),
                Enter.theValue(" lopez").into(Registro.TXT_APELLIDO),
                Enter.theValue(" 12345678").into(Registro.TXT_CEDULA),
                Select.option("1998").from(Registro.SELECT_ANO),
                Select.option("1998").from(Registro.SELECT_MES),
                Select.option("1998").from(Registro.SELECT_DIA),
                Enter.theValue(" JUAN").into(Registro.CELULAR),
                Enter.theValue(" JUAN").into(Registro.CORREO),
                Click.on(Registro.CBX_ACEPTOC),
                Click.on(Registro.CBX_ACEPTOP),
                Click.on(Registro.BTN_CONFIRMAR)


        );
    }
    public static Performable operacion () {
        return instrumented(RegistroTask.class);
    }
}
