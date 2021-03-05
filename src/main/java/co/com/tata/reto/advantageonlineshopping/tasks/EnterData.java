package co.com.tata.reto.advantageonlineshopping.tasks;

import co.com.tata.reto.advantageonlineshopping.interactions.FillOut;
import co.com.tata.reto.advantageonlineshopping.models.ModelContact;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

import static co.com.tata.reto.advantageonlineshopping.userinterfaces.ContactUs.TEXT_CONTACT_US;

public class EnterData implements Task {
    List<ModelContact> modelContacts;

    public EnterData(List<ModelContact> modelContacts) {
        this.modelContacts = modelContacts;
    }

    public static EnterData contactInformation(List<ModelContact> modelContacts) {
        return Tasks.instrumented(EnterData.class,modelContacts);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TEXT_CONTACT_US));
        actor.attemptsTo(FillOut.information(modelContacts));
    }
}
