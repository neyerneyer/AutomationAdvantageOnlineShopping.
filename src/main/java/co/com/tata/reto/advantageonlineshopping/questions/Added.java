package co.com.tata.reto.advantageonlineshopping.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.tata.reto.advantageonlineshopping.userinterfaces.OurProducts.QUESTIONS_PRODUCT;

public class Added implements Question<Boolean> {
    public static Added theProduct() {
        return new Added();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return actor.recall("speaker").toString().equalsIgnoreCase(Text.of(QUESTIONS_PRODUCT).viewedBy(actor).asString());
    }
}
