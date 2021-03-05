package co.com.tata.reto.advantageonlineshopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OurProducts {
    public static final Target LOADER = Target.the("loader")
            .located(By.xpath("//div[@class='loader']"));

    public static final Target SPEAKERS = Target.the("button CONTACT US")
            .located(By.xpath("//span[@aria-label='SpeakersCategoryTxt'][contains(.,'SPEAKERS')]"));

    public static final Target PRODUCT_NAME = Target.the("product name")
            .locatedBy("//a[@class='productName ng-binding'][contains(.,'{0}')]");

    public static final Target ADD_TO_CART = Target.the("add to card")
            .located(By.xpath("//button[@name='save_to_cart'][contains(.,'ADD TO CART')]"));
    public static final Target MENU_CART = Target.the("add to card")
            .located(By.xpath("//*[@id='menuCart']"));

    public static final Target QUESTIONS_PRODUCT = Target.the("add to card")
            .located(By.xpath("//label[@class='roboto-regular productName ng-binding'][contains(.,'BOSE SOUNDLINK WIRELESS SPEAKER')]"));
}
