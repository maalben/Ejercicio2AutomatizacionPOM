package co.com.automationtesting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/autenticacion.feature",
        glue = "co.com.automationtesting.definitions",
        snippets = SnippetType.UNDERSCORE
)

public class RunnersTag {
}