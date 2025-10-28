package app.compensar.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/iniciarSesion.feature",
        glue = "app.compensar.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class Runner {
}
