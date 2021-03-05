package co.com.tata.reto.advantageonlineshopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.tata.reto.advantageonlineshopping.userinterfaces.RegisterUser.QUESTION_REGISTER;

public class User implements Question <Boolean> {
    public static User registration() {
        return new User();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return actor.recall("user").equals(Text.of(QUESTION_REGISTER).viewedBy(actor).asString());

    }
}
