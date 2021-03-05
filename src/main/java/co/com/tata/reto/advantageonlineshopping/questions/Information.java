package co.com.tata.reto.advantageonlineshopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.tata.reto.advantageonlineshopping.userinterfaces.ContactUs.QUESTION_CONTACT;

public class Information implements Question<Boolean> {
    String data;

    public Information(String data) {
        this.data = data;
    }

    public static Information sent(String data) {
        return new Information(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return data.equals(Text.of(QUESTION_CONTACT).viewedBy(actor).asString());
    }
}
