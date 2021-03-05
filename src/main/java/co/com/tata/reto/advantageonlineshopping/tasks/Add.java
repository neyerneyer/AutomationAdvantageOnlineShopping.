package co.com.tata.reto.advantageonlineshopping.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.tata.reto.advantageonlineshopping.userinterfaces.OurProducts.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class Add implements Task {
    String speaker;

    public Add(String speaker) {
        this.speaker = speaker;
    }

    public static Add product(String speaker) {
        return Tasks.instrumented(Add.class,speaker);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(LOADER, isNotVisible()).forNoMoreThan(5).seconds());
        actor.attemptsTo(Click.on(SPEAKERS));
        actor.attemptsTo(Click.on(PRODUCT_NAME.of(speaker)));
        actor.attemptsTo(Click.on(ADD_TO_CART));
        actor.attemptsTo(Click.on(MENU_CART));
        actor.remember("speaker",speaker);
    }

}
