package co.com.tata.reto.advantageonlineshopping.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static co.com.tata.reto.advantageonlineshopping.utils.Constants.ADVANTAGE_ONLINE_SHOPPING;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = ADVANTAGE_ONLINE_SHOPPING,
        tags = "@e2e",
        glue = {"co.com.tata.reto.advantageonlineshopping.stepdefinitions", "co.com.tata.reto.advantageonlineshopping.utils"},
        snippets = SnippetType.CAMELCASE
)
public class AdvantageOnlineShopping {
}
