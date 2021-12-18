package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.n11.navigation.login.LoginAsUser;
import starter.n11.navigation.user_interface.n11UserHomePageElements;
import starter.n11selleroffice.signup.SignUpNewUser;
import starter.n11selleroffice.tasks.NavigateTo;
import starter.n11selleroffice.user_interface.n11SellerOfficeValidationPageElements;

public class N11SellerOfficeSignUpStepDefinitions {
    Actor actor = Actor.named("patikabootcampers");

    @Managed
    WebDriver webDriver;


    @Given("user launch browser and open the signup page")
    public void userLaunchBrowserAndOpenTheSignupPage() {

        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(NavigateTo.theN11HomePage());

    }

    @When("user tries to sign up")
    public void userTriesToSignUp() {
        actor.attemptsTo(SignUpNewUser.SignUpThePage("deneme","a232mP23","a232mP23", "deneme@gmail.com", "deneme@gmail.com", "DenemeMagaza"));
    }

    @Then("user should see validation errors")
    public void userShouldSeeValidationErrors() {
        //serenity tester
        actor.attemptsTo(
                Ensure.that(n11SellerOfficeValidationPageElements.CHECK_VALIDATION).isDisplayed()

        );

    }
}
