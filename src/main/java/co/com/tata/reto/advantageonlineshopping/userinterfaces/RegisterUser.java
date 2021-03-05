package co.com.tata.reto.advantageonlineshopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUser {

    public static final Target MENU_USER = Target.the("menu user")
            .located(By.id("menuUser"));
    public static final Target CREATE_NEW_ACCOUNT = Target.the("CREATE NEW ACCOUNT")
            .located(By.xpath("//a[contains(text(),'CREATE NEW ACCOUNT')]"));

    public static final Target USER_NAME = Target.the("user name")
            .located(By.xpath("//div[@class='spliter']//input[@name='usernameRegisterPage']"));

    public static final Target EMAIL = Target.the("Email")
            .located(By.xpath("//input[@name='emailRegisterPage']"));

    public static final Target PASSWORD = Target.the("PASSWORD")
            .located(By.xpath("//input[@name='passwordRegisterPage']"));

    public static final Target CONFIRM_PASSWORD = Target.the("CONFIRM PASSWORD")
            .located(By.xpath("//input[@name='confirm_passwordRegisterPage']"));

    public static final Target CHECK_PRIVACY = Target.the("CHECK PRIVACITY")
            .located(By.xpath("//input[@name='i_agree']"));

    public static final Target BUTTON_REGISTER = Target.the("BUTTON REGISTER")
            .located(By.xpath("//button[@id='register_btnundefined']"));

    public static final Target QUESTION_REGISTER = Target.the("validate question register")
            .located(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']"));
    private RegisterUser() {
    }
}
