package co.com.tata.reto.advantageonlineshopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUser {
    public static final Target POP_UP = Target.the("login password")
            .located(By.xpath("//div[@class='PopUp']//div[@class='login ng-scope']"));

    public static final Target LOGIN_USERNAME = Target.the("login user name")
            .located(By.xpath("//input[@name='username']"));

    public static final Target LOGIN_PASSWORD = Target.the("login password")
            .located(By.xpath("//input[@name='password']"));

    public static final Target REMEMBER_ME = Target.the("remenber me")
            .located(By.xpath("//input[@name='remember_me']"));

    public static final Target SIGN_IN = Target.the("button sign in")
            .located(By.xpath("//button[@id='sign_in_btnundefined']"));

    private LoginUser() {
    }
}
