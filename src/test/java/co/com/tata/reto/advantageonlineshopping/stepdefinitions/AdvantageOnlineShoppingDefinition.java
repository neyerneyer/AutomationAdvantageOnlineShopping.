package co.com.tata.reto.advantageonlineshopping.stepdefinitions;

import co.com.tata.reto.advantageonlineshopping.exceptions.AddedProductException;
import co.com.tata.reto.advantageonlineshopping.exceptions.InformationSentException;
import co.com.tata.reto.advantageonlineshopping.exceptions.UserLoginException;
import co.com.tata.reto.advantageonlineshopping.exceptions.UserRegistrationException;
import co.com.tata.reto.advantageonlineshopping.models.ModelContact;
import co.com.tata.reto.advantageonlineshopping.models.ModelLogin;
import co.com.tata.reto.advantageonlineshopping.questions.Added;
import co.com.tata.reto.advantageonlineshopping.questions.Information;
import co.com.tata.reto.advantageonlineshopping.questions.LoggedIn;
import co.com.tata.reto.advantageonlineshopping.questions.User;
import co.com.tata.reto.advantageonlineshopping.tasks.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static co.com.tata.reto.advantageonlineshopping.exceptions.AddedProductException.NOT_SENT;
import static co.com.tata.reto.advantageonlineshopping.exceptions.InformationSentException.MESSAGE_WAS_NOT_SENT;
import static co.com.tata.reto.advantageonlineshopping.exceptions.UserLoginException.MESSAGE_USER_NOT_FOUND;
import static co.com.tata.reto.advantageonlineshopping.exceptions.UserRegistrationException.MESSAGE_NOT_FOUND;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AdvantageOnlineShoppingDefinition {

    @Given("^\"([^\"]*)\" you need to enter the advantage online shopping page to register$")
    public void youNeedToEnterTheAdvantageOnlineShoppingPageToRegister(String brandon) {
       theActorCalled(brandon).wasAbleTo(Launch.browser());
    }

    @When("^he enters the necessary information to create the registration$")
    public void heEntersTheNecessaryInformationToCreateTheRegistration() {
        theActorInTheSpotlight().attemptsTo(Create.theRegistration());
    }

    @Then("^it is verified that you have been able to register$")
    public void itIsVerifiedThatYouHaveBeenAbleToRegister() {
       theActorInTheSpotlight().should(seeThat(User.registration()).orComplainWith(UserRegistrationException.class,MESSAGE_NOT_FOUND));
    }

    @Given("^\"([^\"]*)\" you need to enter the advantage online shopping page to log in$")
    public void youNeedToEnterTheAdvantageOnlineShoppingPageToLogIn(String brandon) {
        theActorCalled(brandon).wasAbleTo(Launch.browser());
    }

    @When("^you enter the necessary information to log in$")
    public void youEnterTheNecessaryInformationToLogIn(List<ModelLogin> modelLogins) {
       theActorInTheSpotlight().attemptsTo(StartSession.with(modelLogins));
    }

    @Then("^verify that you have successfully logged in$")
    public void verifyThatYouHaveSuccessfullyLoggedIn() {
        theActorInTheSpotlight().should(seeThat(LoggedIn.user()).orComplainWith(UserLoginException.class,MESSAGE_USER_NOT_FOUND));
    }

    @Given("^\"([^\"]*)\" you need to enter the online shopping advantage page to perform the contact form registration$")
    public void youNeedToEnterTheOnlineShoppingAdvantagePageToPerformTheContactFormRegistration(String brandon) {
        theActorCalled(brandon).wasAbleTo(Launch.browser());
    }

    @When("^you enter the necessary information from the contact form$")
    public void youEnterTheNecessaryInformationFromTheContactForm(List<ModelContact> modelContacts) {
             theActorInTheSpotlight().attemptsTo(EnterData.contactInformation(modelContacts));
    }

    @Then("^verify that you have successfully submitted the information with the message \"([^\"]*)\"$")
    public void verifyThatYouHaveSuccessfullySubmittedTheInformationWithTheMessage(String data) {
        theActorInTheSpotlight().should(seeThat(Information.sent(data)).orComplainWith(InformationSentException.class,MESSAGE_WAS_NOT_SENT));
    }

    @Given("^\"([^\"]*)\" you need to enter the online shopping advantage page$")
    public void youNeedToEnterTheOnlineShoppingAdvantagePage(String brandon) {
        theActorCalled(brandon).wasAbleTo(Launch.browser());

    }

    @When("^he adds any product from the Speaker section \"([^\"]*)\"$")
    public void heAddsAnyProductFromTheSpeakerSection(String speaker) {
        theActorInTheSpotlight().attemptsTo(Add.product(speaker));
    }

    @Then("^he verifies that he has added the product from the Speaker section$")
    public void heVerifiesThatHeHasAddedTheProductFromTheSpeakerSection() {
        theActorInTheSpotlight().should(seeThat(Added.theProduct()).orComplainWith(AddedProductException.class,NOT_SENT));
    }
}
