package app.compensar.tasks;

import app.compensar.ui.InicioSesion;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import static app.compensar.ui.InicioSesion.BTN_OMITIR;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InicioSesionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
       // SessionId sessionId = ((RemoteWebDriver) ((WebDriverFacade) Serenity.getDriver()).getProxiedDriver()).getSessionId();
        //System.out.println("🔗 BrowserStack session URL: https://app-automate.browserstack.com/dashboard/v2/sessions/" + sessionId);

        actor.attemptsTo(

                WaitUntil.the(BTN_OMITIR, isVisible()).forNoMoreThan(50).seconds(),
                //Click.on(BTN_OMITIR).afterWaitingUntilEnabled().forNoMoreThan(10).seconds(),
                Click.on(BTN_OMITIR)
                //Click.on(BTN_OMITIR),
                //Click.on(BTN_OMITIR)

        );
        System.out.println("Se cerro correctamente");
    }

    public static InicioSesionTask inicioSesion() {
        return instrumented(InicioSesionTask.class);
    }
}
