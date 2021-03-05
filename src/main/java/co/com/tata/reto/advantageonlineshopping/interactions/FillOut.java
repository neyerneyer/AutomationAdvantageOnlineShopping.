package co.com.tata.reto.advantageonlineshopping.interactions;

import co.com.tata.reto.advantageonlineshopping.models.ModelContact;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.tata.reto.advantageonlineshopping.userinterfaces.ContactUs.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillOut implements Interaction {
    List<ModelContact> modelContacts;

    public FillOut(List<ModelContact> modelContacts) {
        this.modelContacts = modelContacts;
    }

    public static FillOut information(List<ModelContact> modelContacts) {
        return Tasks.instrumented(FillOut.class,modelContacts);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TYPE_CATEGORY,isVisible()),
                SelectFromOptions.byVisibleText(modelContacts.get(0).getCategory()).from(TYPE_CATEGORY),
                SelectFromOptions.byVisibleText(modelContacts.get(0).getProduct()).from(PRODUCT_LIST),
                Enter.theValue(modelContacts.get(0).getEmail()).into(EMAIL_CONTACT),
                Type.theValue(modelContacts.get(0).getSubject()).into(SUBJECT),
                Click.on(SEND)
        );

    }
}
