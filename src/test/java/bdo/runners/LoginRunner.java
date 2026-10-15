package bdo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/products.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "bdo.steps")


public class LoginRunner {
}
