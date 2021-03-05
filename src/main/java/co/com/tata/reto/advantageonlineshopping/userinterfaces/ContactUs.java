package co.com.tata.reto.advantageonlineshopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContactUs {

    public static final Target BUTTON_CONTACT_US = Target.the("button CONTACT US")
            .located(By.linkText("CONTACT US"));
    public static final Target TEXT_CONTACT_US = Target.the("text CONTACT US")
            .located(By.xpath("//h1[contains(text(),'CONTACT US')]"));

    public static final Target TYPE_CATEGORY = Target.the("category List box")
            .located(By.xpath("//select[@name='categoryListboxContactUs']"));

    public static final Target PRODUCT_LIST = Target.the("product List box")
            .located(By.xpath("//select[contains(@name,'productListboxContactUs')]"));

    public static final Target EMAIL_CONTACT = Target.the("email contact")
            .located(By.xpath("//input[contains(@name,'emailContactUs')]"));

    public static final Target SUBJECT = Target.the("subject contact")
            .located(By.xpath("//textarea[contains(@name,'subjectTextareaContactUs')]"));

    public static final Target SEND = Target.the("send contact")
            .located(By.xpath("//button[@class='sec-sender-a ng-scope']"));

    public static final Target QUESTION_CONTACT = Target.the("send contact")
            .located(By.xpath("//p[@class='roboto-regular successMessage ng-binding'][contains(.,'Thank you for contacting Advantage support.')]"));

}
