package co.com.tata.reto.advantageonlineshopping.tasks;

import co.com.tata.reto.advantageonlineshopping.models.ModelLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.tata.reto.advantageonlineshopping.userinterfaces.LoginUser.*;
import static co.com.tata.reto.advantageonlineshopping.userinterfaces.RegisterUser.MENU_USER;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class StartSession implements Task {
    List<ModelLogin> modelLogins;

    public StartSession(List<ModelLogin> modelLogins) {
        this.modelLogins = modelLogins;
    }

    public static StartSession with(List<ModelLogin> modelLogins) {
        return Tasks.instrumented(StartSession.class,modelLogins);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_USER),
                WaitUntil.the(POP_UP,isVisible()).forNoMoreThan(2).seconds(),
                Type.theValue(modelLogins.get(0).getUser()).into(LOGIN_USERNAME),
                Type.theValue(modelLogins.get(0).getPass()).into(LOGIN_PASSWORD),
                Click.on(REMEMBER_ME),
                Click.on(SIGN_IN)
        );
        actor.remember("userLogin",modelLogins.get(0).getUser());
    }
}
