package starter.n11selleroffice.signup;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.Keys;

import starter.n11selleroffice.user_interface.n11SellerOfficeHomePageElements;

import starter.n11selleroffice.user_interface.n11SellerOfficeSignUpPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class SignUpNewUser implements Task {

    private final String email_text;
    private final String password_text;
    private final String username_text;
    private final String repassword_text;
    private final String reemail_text;
    private final String storname_text;


    @Step("{0} Signup with some informations'")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(n11SellerOfficeHomePageElements.SIGNUP_LINK),

                WaitUntil.the(n11SellerOfficeSignUpPageElements.USERNAME_FIELD,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(n11SellerOfficeSignUpPageElements.USERNAME_FIELD),
                SendKeys.of(this.username_text).into(n11SellerOfficeSignUpPageElements.USERNAME_FIELD),

                Click.on(n11SellerOfficeSignUpPageElements.PASSWORD_FIELD),
                WaitUntil.the(n11SellerOfficeSignUpPageElements.PASSWORD_FIELD,isVisible()).forNoMoreThan(10).seconds(),
                SendKeys.of(this.password_text).into(n11SellerOfficeSignUpPageElements.PASSWORD_FIELD),

                Click.on(n11SellerOfficeSignUpPageElements.REPASSWORD_FIELD),
                WaitUntil.the(n11SellerOfficeSignUpPageElements.REPASSWORD_FIELD,isVisible()).forNoMoreThan(5).seconds(),
                SendKeys.of(this.repassword_text).into(n11SellerOfficeSignUpPageElements.REPASSWORD_FIELD),

                Click.on(n11SellerOfficeSignUpPageElements.EMAIL_FIELD),
                WaitUntil.the(n11SellerOfficeSignUpPageElements.EMAIL_FIELD,isVisible()).forNoMoreThan(5).seconds(),
                SendKeys.of(this.email_text).into(n11SellerOfficeSignUpPageElements.EMAIL_FIELD),

                Click.on(n11SellerOfficeSignUpPageElements.REEMAIL_FIELD),
                WaitUntil.the(n11SellerOfficeSignUpPageElements.REEMAIL_FIELD,isVisible()).forNoMoreThan(5).seconds(),
                SendKeys.of(this.reemail_text).into(n11SellerOfficeSignUpPageElements.REEMAIL_FIELD),

                Click.on(n11SellerOfficeSignUpPageElements.STORENAME_FIELD),
                WaitUntil.the(n11SellerOfficeSignUpPageElements.STORENAME_FIELD,isVisible()).forNoMoreThan(5).seconds(),
                SendKeys.of(this.storname_text).into(n11SellerOfficeSignUpPageElements.STORENAME_FIELD),

                WaitUntil.the(n11SellerOfficeSignUpPageElements.SIGNUP_BTN,isClickable()).forNoMoreThan(5).seconds(),
                Click.on(n11SellerOfficeSignUpPageElements.SIGNUP_BTN),
                Click.on(n11SellerOfficeSignUpPageElements.SIGNUP_BTN)


                );



    }

    public SignUpNewUser(String username_text, String password_text,String repassword_text, String email_text, String reemail_text, String storname_text){
        this.username_text = username_text;
        this.password_text = password_text;
        this.repassword_text = repassword_text;
        this.email_text = email_text;
        this.reemail_text = reemail_text;
        this.storname_text = storname_text;

    }



    public static SignUpNewUser SignUpThePage(String username_text, String password_text,String repassword_text, String email_text, String reemail_text, String storname_text) {
        return instrumented(SignUpNewUser.class,
                username_text,password_text,repassword_text, email_text, reemail_text, storname_text);
    }
}
