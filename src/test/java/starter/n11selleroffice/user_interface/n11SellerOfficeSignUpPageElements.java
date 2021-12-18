package starter.n11selleroffice.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class n11SellerOfficeSignUpPageElements {


    public static Target USERNAME_FIELD = Target.the("username textbox").located(By.id("usernameInputText"));
    public static Target PASSWORD_FIELD = Target.the("pass textbox").located(By.id("passwordInputText"));
    public static Target REPASSWORD_FIELD = Target.the("repass textbox").located(By.id("passwordRetypeInputText"));
    public static Target EMAIL_FIELD = Target.the("email textbox").located(By.id("emailInputText"));
    public static Target REEMAIL_FIELD = Target.the("reemail textbox").located(By.id("emailRetypeInputText"));
    public static Target STORENAME_FIELD = Target.the("storename textbox").located(By.id("nicknameInputText"));
    public static Target CHECKBOX = Target.the("checkbox").located(By.xpath("//*[@id=\"membershipTypeRadio\"]/tbody/tr/td[1]/div/div[2]/span"));
    public static Target SIGNUP_BTN = Target.the("signup btn").located(By.cssSelector("#j_id275_j_id_dk"));



}
