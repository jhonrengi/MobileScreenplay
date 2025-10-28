package app.compensar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirLaAplicacionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Aquí no necesitas código adicional, Appium abrirá la app automáticamente
        System.out.println("App abierta correctamente por Appium.");
    }

    public static AbrirLaAplicacionTask enElDispositivo() {
        return instrumented(AbrirLaAplicacionTask.class);
    }
}
