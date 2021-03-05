package co.com.tata.reto.advantageonlineshopping.utils;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class InitialSetup {
    @Before
    public void prepareScenario() {
        OnStage.setTheStage(new OnlineCast());
    }
}
