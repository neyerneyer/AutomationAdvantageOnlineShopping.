package co.com.tata.reto.advantageonlineshopping.tasks;

import co.com.tata.reto.advantageonlineshopping.interactions.FillOutForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Create implements Task {
    public static Performable theRegistration() {
        return Tasks.instrumented(Create.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(FillOutForm.account());
    }
}
