package app.compensar.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioSesion {
    public static final Target BTN_OMITIR = Target.the("botón para omitir el onboarding")
            .located(By.xpath("//android.view.View[@content-desc=\"Siguiente\"]"));
}
