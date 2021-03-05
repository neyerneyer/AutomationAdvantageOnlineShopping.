package co.com.tata.reto.advantageonlineshopping.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.tata.reto.advantageonlineshopping.userinterfaces.RegisterUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillOutForm implements Interaction {
    public static FillOutForm account() {
        return instrumented(FillOutForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember("user","bquevedo");
        actor.attemptsTo(
                Click.on(MENU_USER),
                WaitUntil.the(CREATE_NEW_ACCOUNT,isVisible()),
                Click.on(CREATE_NEW_ACCOUNT));
        actor.attemptsTo(
                WaitUntil.the(USER_NAME,isVisible()),
                Enter.theValue(actor.recall("user")).into(USER_NAME),
                Enter.theValue("funezneyer@gmail.com").into(EMAIL),
                Enter.theValue("Bq12345").into(PASSWORD),
                Enter.theValue("Bq12345").into(CONFIRM_PASSWORD),
                Click.on(CHECK_PRIVACY),
                Click.on(BUTTON_REGISTER)
                );
    }
}
