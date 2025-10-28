package app.compensar.questions;


import app.compensar.ui.Registro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MiCuenta implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Registro.LBL_NOMBRE.resolveFor(actor).isVisible();
    }
    public static Question from(){
        return new MiCuenta();
    }

}
