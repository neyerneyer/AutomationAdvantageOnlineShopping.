package co.com.tata.reto.advantageonlineshopping.tasks;

import co.com.tata.reto.advantageonlineshopping.userinterfaces.HomeAdvantageOnlineShopping;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Launch implements Task {
    HomeAdvantageOnlineShopping homeAdvantageOnlineShopping;
    public static Performable browser() {
        return Tasks.instrumented(Launch.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(homeAdvantageOnlineShopping));
    }
}
